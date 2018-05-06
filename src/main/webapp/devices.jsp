<%--
  Created by IntelliJ IDEA.
  User: Adelya
  Date: 06.05.2018
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css/startStyles.css" rel="stylesheet">
    <script src="/js/validator.js"></script>

</head>
<body>
Hello!
<div class="params">
    <form method="get" action="/startPageServlet">
        <div id="params">
            <label for="numberOY" class="OULabel">Количество ОУ:</label>
            <input type="text" name="number" id="numberOY" placeholder="<=31">
        </div>
        <div id="settingsButtonDiv">
            <input type="submit" id="paramsButton" onclick="" value="Принять"/>
        </div>
    </form>
</div>

</body>
</html>
