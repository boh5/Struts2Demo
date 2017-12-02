<%--
  Created by IntelliJ IDEA.
  User: dill
  Date: 2017/11/30
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title><s:text name="loginPage"/></title>
    <script type="text/javascript">
        function regist() {
            targetForm = document.forms[0];
            targetForm.action = "registAction";
        }
    </script>
</head>
<body>
<s:form action="loginAction">
    <s:textfield name="username" key="user"/>
    <s:textfield name="password" key="pass"/>
    <s:submit key="login"/>
    <s:submit key="signup" onclick="regist()"/>
</s:form>
</body>
</html>
