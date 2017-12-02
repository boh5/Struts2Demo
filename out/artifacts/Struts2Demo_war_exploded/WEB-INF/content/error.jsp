<%--
  Created by IntelliJ IDEA.
  User: dill
  Date: 2017/11/30
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title><s:text name="errorPage"/></title>
</head>
<body>
<s:text name="failTip"/><br/>
${requestScope.tip}
</body>
</html>
