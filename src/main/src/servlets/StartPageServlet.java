package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Adelya on 06.05.2018.
 */
public class StartPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int number = Integer.parseInt(req.getParameter("number"));
        req.getSession(true).setAttribute("number",number);
        getServletConfig().getServletContext()
                .getRequestDispatcher("/param.jsp")
                .forward(req, resp);
    }


}
