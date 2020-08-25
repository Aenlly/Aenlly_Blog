<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/11
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <s:include value="index/head.jsp">
      <s:param name="title" value="'Aenlly个人主页'" />
    </s:include>
  </head>
  <body>
  <div class="container">
    <div class="row">
      <s:include value="index/index_nav.jsp">
        <s:param name="article" value="'最新文章'"/>
        <s:param name="works" value="'最新作品'"/>
      </s:include>
    </div>
  </div>
  </body>
</html>
