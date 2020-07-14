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
        <div class="col col-md-12">
            <div class="navbar-default" role="navigation"  style="background-color: #2aabd2">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#example-navbar-collapse">
                        <span class="sr-only">切换导航</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
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
                    <%--  中间导航栏  #example-navbar-collapse属性作用为浏览器界面小的时候变成另外一种导航栏 --%>
                    <ul class="nav navbar-nav navbar-left">
                        <li>
                            <a href="">
                                <span style="color: #e0e0e0;">发布文章</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <span style="color: #e0e0e0;">发布作品</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <span style="color: #e0e0e0;">查看提问</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <span style="color: #e0e0e0;">查看文章|作品</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <span style="color: #e0e0e0;">修改信息</span>
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
        <div class="col-md-2">
            <dl class="panel panel-default">
                <dt class="panel-heading curter" data-toggle="collapse" data-target="#Function">
                    <span class="panel-title"><strong>功能</strong></span>
                </dt>
                <!--   第一个panel-head结束  collapse in选择器代表显示内容 --->
                <dd id="Function" class="panel-collapse collapse in">
                    <div class="panel-body dl curter">
                        <a href="" target="_self">发布文章</a>
                    </div>
                    <div class="panel-body dl curter">
                        <a href="" target="_self">发布作品</a>
                    </div>
                </dd>
                <!--   第一个panel-head下隐藏的部分结束   --->
                <dt class="panel-heading curter" data-toggle="collapse" data-target="#Administration">
                        <span class="panel-title"><strong>管理</strong></span>
                </dt>
                <!--   第二个panel-head结束   --->
                <dd id="Administration" class="panel-collapse collapse">
                    <div class="panel-body dl curter active">
                        <a href="" target="_self">文章管理</a>
                    </div>
                    <div class="panel-body dl curter">
                        <a href="" target="_self">作品管理</a>
                    </div>
                    <div class="panel-body dl curter">
                        <a href="" target="_self">主题管理</a>
                    </div>
                    <div class="panel-body dl curter">
                        <a href="" target="_self">问题管理</a>
                    </div>
                </dd>
                <!--   第二个panel-head下隐藏的部分结束   --->
                <dt class="panel-heading curter" data-toggle="collapse" data-target="#Datastatistics">
                    <span class="panel-title"><strong>数据统计</strong></span>
                </dt>
                <!--   第三个panel-head结束   --->
                <dd id="Datastatistics" class="panel-collapse collapse">
                    <div class="panel-body dl curter">
                        <a href="" target="_self" style="overflow: hidden;">浏览统计</a>
                    </div>
                </dd>
                <dt class="panel-heading curter" data-toggle="collapse" data-target="#Setup">
                    <span class="panel-title"><strong>管理信息</strong></span>
                </dt>
                <dd id="Setup" class="panel-collapse collapse">
                    <div class="panel-body dl curter">
                        <a href="" target="_self">个人信息</a>
                    </div>
                    <div class="panel-body dl curter">
                        <a href="" target="_self">用户信息</a>
                    </div>
                </dd>
                <!--   第三个panel-head下隐藏的部分结束   --->
            </dl>
            <!--   第一个panel panel-default结束   -->
        </div>
        <div class="col-md-10">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <span class="panel-title"><strong>发布文章</strong></span>
                </div>
                <div class="panel-body">
                    <table width="100%">
                        <tr>
                            <td>
                                标题
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="text" class="form-control" name="" width="100%">
                            </td>
                        </tr>
                        <tr>
                            <td>
                                </br>
                                主题类别
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <select class="form-control" name="">
                                    <option value="">请选择主题</option>
                                    <s:iterator value="catelist">
                                        <option value="cate_cetagory"></option>
                                    </s:iterator>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                </br>正文
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <!-- 加载编辑器的容器 name属性传参的命名-->
                                <script id="content" name="Post_Entity.postContent" type="text/plain">
                                <!--  这里写你的初始化内容  -->
                                </script>
                                <!-- 配置文件 -->
                                <script type="text/javascript" src="<%=request.getContextPath() %>/editor/ueditor.config.js"></script>
                                <!-- 编辑器源码文件 -->
                                <script type="text/javascript" src="<%=request.getContextPath() %>/editor/ueditor.all.min.js"></script>
                                <!-- 实例化编辑器 -->
                                <script type="text/javascript">
                                    var ue = UE.getEditor('content');
                                </script>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
            <!--      第二个panel面板结束      -->
        </div>
    </div>
    <!--  第三个row，作用为显示内容   -->
</div>
<!--   container结束    -->
</body>
</html>
