<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/12
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        .col{
            padding: 0;
            margin: 0;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col col-md-12">
            <div class="navbar-default" role="navigation"  style="background-color: #2aabd2">
                <div class="navbar-header">
                    <div class="navbar-brand">
                        <a href="index.jsp" style="text-decoration: none;">
                            <span style="font-family: 华文隶书;color:#ffffff;font-size: 25px;">
                                Aenlly 个人主页
                            </span>
                        </a>
                    </div>
                    <!--  brand结束  -->
                </div>
                <!--  header结束   -->
                <div class="navbar-collapse collapse">
                    <%--  中间导航栏   --%>
                    <ul class="nav navbar-nav navbar-left">
                        <li>
                            <a href="">
                                <span style="color: #e0e0e0;">文章</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <span style="color: #e0e0e0;">作品</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <span style="color: #e0e0e0;">文件</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <span style="color: #e0e0e0;">向作者提问</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <span style="color: #e0e0e0;">联系作者</span>
                            </a>
                        </li>
                    </ul>
                    <%-- 搜索内容搜索条 --%>
                    <form class="navbar-form navbar-right" action="#" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="搜索内容">
                        </div>
                    </form>
                    <!-- navbar-form结束   -->
                </div>
                <!--  navbar-collapse结束  -->
            </div>
            <!--   navbar-default结束  -->
        </div>
        <!--  col结束  -->
    </div>
    <!--  第一个row结束，作用为设置导航栏  -->
    <div class="row">
        <div class="col-md-12" style="height: 10%;">
        </div>
    </div>
    <!--  第二个row结束，作用使导航栏下面空白一部分  -->
    <div class="row">
        <div class="col col-md-8" style="border-bottom: #e2e2e2 1px solid;">
            <div class="col panel">
                <div class="panel-heading col-md-2 text-center" style="border-top: black 5px solid;">
                    <span style="font-family: sans-serif;font-size: 20px;letter-spacing: 2px;text-align: center;">
                        <font color="black">
                            <strong><%out.print(request.getParameter("article"));%></strong>
                        </font>
                    </span>
                </div>
                <!--   panel-head标题结束    -->
                <div class="panel-body">

                </div>
                <!--    panel-body内容结束    -->
            </div>
            <!--    第一个panel结束-->
        </div>
        <!--  col-md-8结束   -->
        <div class="col col-md-1"></div>
        <div class="col col-md-3" style="border-left: #e2e2e2 1px solid;">
            <div class="panel">
                <div class="panel-heading">
                    <div class="panel-group">
                    </div>
                </div>
                <!--  pan-head头部结束   -->
                <div class="panel-body">

                </div>
                <!--   panel-body内容结束   -->
            </div>
            <!--  第二个panel面板结束    -->
        </div>
        <!--  右侧panel面板定义划分为col-md-3大小   -->
    </div>
    <!--  第三给row开始，作用为填充内容    -->
</div>
<!--   container结束    -->
</body>
</html>
