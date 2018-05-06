package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adelya on 06.05.2018.
 */
public class DevicesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number = Integer.parseInt(req.getSession().getAttribute("number").toString());
        List<Device> devices = new ArrayList<Device>();
        for(int i=0;i<number; i++){
            String isActive = req.getParameter("aWork"+String.valueOf(i));
            String isBlockedA = req.getParameter("aBlocked"+i);
            String isFailA = req.getParameter("aFail"+i);
            String isGenA = req.getParameter("aGen"+i);

            String isBlockedB = req.getParameter("bBlocked"+i);
            String isGenB = req.getParameter("bGen"+i);

            Device device = new Device(String.valueOf(i));
            if("On".equals(isActive)) {
                device.setActive(true);
                break;
            }
            if("On".equals(isBlockedA)) {
                device.setBlockedByA(true);
                break;
            }
            if("On".equals(isFailA)) {
                device.setFailed(true);
                break;
            }
            if("On".equals(isGenA)) {
                device.setGeneratingInA(true);
                break;
            }

            if("On".equals(isBlockedB)) {
                device.setBlockedByB(true);
                break;
            }

            if("On".equals(isGenB)) {
                device.setGeneratingInB(true);
                break;
            }

            devices.add(device);

        }

        getServletConfig().getServletContext()
                .getRequestDispatcher("/start.jsp")
                .forward(req, resp);
    }
}
