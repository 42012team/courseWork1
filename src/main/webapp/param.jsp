<%--
  Created by IntelliJ IDEA.
  User: Adelya
  Date: 06.05.2018
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/startStyles.css" rel="stylesheet">
    <!--<script src="/js/validator.js"></script>-->
</head>
<body>
<form method="get" action="/devicesServlet">
<%int n =Integer.parseInt(session.getAttribute("number").toString());%>
<div id="linesDiv">
    <div id="lineADiv">
        <label id="lineA">Line A</label>
        <table id="tableA">
            <tr class="first">
                <th>ОУ</th>
                <th>Исправен</th>
                <th>Заблокирован</th>
                <th>Сбой</th>
                <th>Генерация</th>
            </tr>
            <%for (int i = 0; i < n; i++) {%>
            <tr>
                <th><%=i%>
                </th>
                <th><input type="checkbox" onclick="oclick(this)" name="aWork<%=i%>"></th>
                <th><input type="checkbox" onclick="oclick(this)" name="aBlocked<%=i%>"></th>
                <th><input type="checkbox" onclick="oclick(this)" name="aFail<%=i%>"></th>
                <th><input type="checkbox" onclick="oclick(this)" name="aGen"<%=i%>"></th>
            </tr>
            <%}%>
        </table>
    </div>
    <div id="lineBDiv">
        <label id="lineB">Line B</label>
        <div>
            <table id="tableB">
                <tr>
                    <th>ОУ</th>
                    <th>Исправен</th>
                    <th>Заблокирован</th>
                    <th>Сбой</th>
                    <th>Генерация</th>
                </tr>
                <%for (int i = 0; i < n; i++) {%>
                <tr>
                    <th><%=i%>
                    </th>
                    <th><input type="checkbox" name="bWork<%=i%>"></th>
                    <th><input type="checkbox" name="bBlocked<%=i%>"></th>
                    <th><input type="checkbox" name="bFail<%=i%>"></th>
                    <th><input type="checkbox" name="bGen<%=i%>"></th>
                </tr>
                <%}%>
            </table>
        </div>
    </div>
</div>
<div id="saveDiv">
    <input class="save" type="submit" value="Сохранить">
</div>
    </form>
</body>
</html>
