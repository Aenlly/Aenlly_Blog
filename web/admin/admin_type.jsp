<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/20
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        th {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="panel-heading">
    <span style="font-family: 宋体;font-size: 14px;"><strong>主题管理</strong></span>
</div>
<div class="panel-body">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-10">
            <table class="table" style="text-align: center;">
                <tr>
                    <td colspan="4" align="right">
                        <button class="btn btn-default">新建</button>
                    </td>
                </tr>
                <tr class="active">
                    <th>序号</th>
                    <th>类别名称</th>
                    <th>帖子总数</th>
                    <th>执行操作</th>
                </tr>
                <%int n = 1;%>
                <s:iterator value="typelist">
                    <tr>
                        <td style="vertical-align: middle;"><span
                                style="font-family: 微软雅黑;font-size: 14px;"><%=n++%></span></td>
                        <td style="vertical-align: middle;"><span
                                style="font-family: 微软雅黑;font-size: 14px;word-wrap:break-word;word-break:break-all;overflow: hidden;">${cateName}</span></td>
                        <td style="vertical-align: middle;"><span
                                style="font-family: 微软雅黑;font-size: 14px;font-size: 14px;word-wrap:break-word;word-break:break-all;overflow: hidden;">${catePostCount}</span></td>
                        <td style="vertical-align: middle;" width="30%">
                            <button data-id="" class="btn btn-default">转移</button>
                            &nbsp;
                            <button class="btn btn-primary">编辑</button>
                            &nbsp;
                            <button class="btn btn-danger">删除</button>
                        </td>
                    </tr>
                </s:iterator>
            </table>
        </div>
        <div class="col-md-1"></div>
    </div>
</div>
</body>
</html>
