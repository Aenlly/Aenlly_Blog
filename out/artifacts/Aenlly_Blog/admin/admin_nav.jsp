<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/13
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <style type="text/css">
        .dl{
            padding-bottom: 5px;
            padding-top: 5px;
            padding-left: 30px;
        }
        /*  改变鼠标移动到列表上的背景   */
        .dl:hover{
            background-color: #e2e2e2;
        }
        /*  改变列表选中之后的样式  */
        .active{
            background-color: #c0a16b;
        }
        .active a{
            color: #ffffff;
        }
        /*   使鼠标显示为手指标志   */
        .curter{
            cursor: pointer;
        }

        a{
            color: #444444;
        }
        /*  使鼠标移动到链接上无下划线  */
        a:hover{
            text-decoration: none;
            color: #444444;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <p></p>
    </div>
    <!--   第一个row结束，用与留白    -->
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
                <div class="navbar-collapse collapse" id="example-navbar-collapse">
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
    <!--  第二个row结束，作用为设置导航栏  -->
    <div class="row">
        <div class="col-md-12" style="height: 10%;">
        </div>
    </div>
    <!--  第三个row结束，作用使导航栏下面空白一部分  -->
    <div class="row">
        <div class="col-md-2">
            <dl class="panel panel-default">
                <dt class="panel-heading curter" data-toggle="collapse" data-target="#Function">
                    <span class="panel-title"><strong>功能</strong></span>
                </dt>
                <!--   第一个panel-head结束  collapse in选择器代表显示内容 --->
                <dd id="Function" class="panel-collapse collapse in">
                    <a href="admin_release" target="_self">
                        <div class="panel-body dl curter ${istrue==0?"active":""}">
                            发布内容
                        </div>
                    </a>
                </dd>
                <!--   第一个panel-head下隐藏的部分结束   --->
                <dt class="panel-heading curter" data-toggle="collapse" data-target="#Administration">
                        <span class="panel-title"><strong>管理</strong></span>
                </dt>
                <!--   第二个panel-head结束   --->
                <dd id="Administration" class="panel-collapse collapse in">
                    <a href="admin_article" target="_self">
                        <div class="panel-body dl curter ${istrue==1?"active":""}">
                            文章管理
                        </div>
                    </a>
                    <a href="admin_works" target="_self">
                        <div class="panel-body dl curter ${istrue==2?"active":""}">
                            作品管理
                        </div>
                    </a>
                    <a href="admin_type" target="_self">
                        <div class="panel-body dl curter ${istrue==3?"active":""}">
                            类型管理
                        </div>
                    </a>
                    <!--未设计问题管理的数据库
                    <a href="admin_matter" target="_self">
                        <div class="panel-body dl curter $ {istrue==4?"active":""}">
                            问题管理
                        </div>
                    </a>
                    -->
                    <a href="admin_indexs" target="_self">
                        <div class="panel-body dl curter ${istrue==5?"active":""}">
                        主页管理
                        </div>
                    </a>
                </dd>
                <!--   第二个panel-head下隐藏的部分结束   --->
                <dt class="panel-heading curter" data-toggle="collapse" data-target="#Datastatistics">
                    <span class="panel-title"><strong>数据统计</strong></span>
                </dt>
                <!--   第三个panel-head结束   --->
                <dd id="Datastatistics" class="panel-collapse collapse in">
                    <a href="admin_browse" target="_self" style="overflow: hidden;">
                        <div class="panel-body dl curter ${istrue==6?"active":""}">
                            浏览统计
                        </div>
                    </a>
                </dd>
                <dt class="panel-heading curter" data-toggle="collapse" data-target="#Setup">
                    <span class="panel-title"><strong>管理信息</strong></span>
                </dt>
                <dd id="Setup" class="panel-collapse collapse in">
                    <a href="" target="_self">
                        <div class="panel-body dl curter ${istrue==7?"active":""}">
                            个人信息
                        </div>
                    </a>
                    <a href="" target="_self">
                        <div class="panel-body dl curter ${istrue==8?"active":""}">
                            用户信息
                        </div>
                    </a>
                </dd>
                <!--   第三个panel-head下隐藏的部分结束   --->
            </dl>
            <!--   第一个panel panel-default结束   -->
        </div>
        <div class="col-md-10">
            <div class="panel panel-default">
                <s:if test="%{#istrue==0}">
                    <s:include value="admin_release.jsp"></s:include>
                </s:if>
                <s:elseif test="%{#istrue==1}">
                    <s:include value="admin_article.jsp"></s:include>
                </s:elseif>
                <s:elseif test="%{#istrue==2}">
                    <s:include value="admin_works.jsp"></s:include>
                </s:elseif>
                <s:elseif test="%{#istrue==3}">
                    <s:include value="admin_type.jsp"></s:include>
                </s:elseif>
                <s:elseif test="%{#istrue==5}">
                    <s:include value="admin_indexadmin.jsp"></s:include>
                </s:elseif>
                <s:else>
                    <s:include value="admin_release.jsp"></s:include>
                </s:else>
            </div>
            <!--      第二个panel面板结束      -->
        </div>
    </div>
    <!--  第四个row，作用为显示内容   -->
</div>
<!--   container结束    -->
</body>
</html>
