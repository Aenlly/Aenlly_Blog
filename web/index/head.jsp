<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/12
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<title><% out.print(request.getParameter("title"));%></title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap3.3.5/css/bootstrap.min.css">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%=request.getContextPath() %>/jquery3.1.0/jquery-3.1.0.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<%=request.getContextPath() %>/bootstrap3.3.5/js/bootstrap.min.js"></script>
<!-- bootstrap dialog -->
<link href="<%=request.getContextPath() %>/bootstrap3-dialog/css/bootstrap-dialog.min.css" rel="stylesheet" type="text/css" />
<script src="<%=request.getContextPath() %>/bootstrap3-dialog/js/bootstrap-dialog.min.js"></script>
