<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/13
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <s:include value="../index/head.jsp">
        <s:param name="title" value="'管理员主页'" />
    </s:include>
</head>
<body>
<div class="container">
    <div class="row">
        <s:include value="admin_nav.jsp"></s:include>
    </div>
</div>
</body>
</html>
