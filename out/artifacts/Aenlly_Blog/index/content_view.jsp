<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/10/16
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <s:include value="head.jsp">
        <s:param name="title" value="'Aenlly个人主页'" />
    </s:include>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col col-md-12">
            <div class="navbar-default" role="navigation" style="background-color: #2aabd2">
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
                                <span style="color: #e0e0e0;">提问</span>
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
        <div class="col col-md-8" style="">
            <div class="col panel" style="margin-bottom: 0;">
                <div class="panel-heading">
                    <h2 style="margin: 0;"><span style="font-family: 微软雅黑;">标题</span></h2>
                    <%--${postTitle}--%>
                </div>

                <div class="panel-body">
                    <ul class="nav navbar-nav">
                        <li class="">
                            文章
                        </li>
                        <li>&nbsp;</li>
                        <li>
                            2019-19-29
                        </li>
                    </ul>
                </div>
                <!--   panel-head标题结束    -->
            </div>
            <!--  panel结束  -->
            <!--    帖子内容显示-->
            <div class="panel-body">
                内容
            </div>
        </div>
        <!--  col-md-8结束   -->
        <div class="col col-md-1"></div>

        <div class="col col-md-3" style="border-left: #e2e2e2 1px solid;">
            <div class="col panel">
                <div class="panel-heading">
                    <div class="panel-group" align="center" style="margin-bottom: 12px;margin-top: 8px;">
                        <span style="color:black;font-family: sans-serif;font-size: 20px;letter-spacing: 2px;text-align: center;">
                            <strong>
                                文章/作品</br>
                                类型查找
                            </strong>
                        </span>
                    </div>
                </div>
                <!--  pan-head头部结束   -->
            </div>
            <!--  第二个panel面板结束    -->
            <table class="table" style="margin-bottom: 0px;">
                <%for (int n = 0; n < 10; n++) {%>
                <tr>
                    <td style="vertical-align: center;border-top: #FFFFFF">
                        <div style="width: 100%;">
                            <div style="text-align:center;">
                                <a href="#">
                                    <span style="font-size: 15pt;font-family: 微软雅黑;">C#</span>
                                </a>
                            </div>
                        </div>
                    </td>
                </tr>
                <%}%>
            </table>
        </div>
        <!--  右侧panel面板定义划分为col-md-3大小   -->
    </div>
    <!--  第三给row开始，作用为填充内容    -->
</div>
<!--   container结束    -->
</body>
</html>
