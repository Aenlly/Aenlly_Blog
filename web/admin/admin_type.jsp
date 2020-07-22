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
            <table class="table" style="text-align: center;" id="table">
                <tr>
                    <td colspan="4" align="right">
                        <button id="btn_add" class="btn btn-default">新建</button>
                    </td>
                    <div id="typeadd" class="modal" style="width: 300px;">
                        <form action="admin_typeadd" name="admin_typeadd" style="padding-top: 0;">
                            <div class="modal-content">
                                <div class="modal-header"
                                     style="background-color: #EFEFEF;padding-top: 10px;padding-bottom: 10px;">
                                    <span style="font-size: 14px;font-family: 微软雅黑;">添加新类型</span></div>
                                <div class="modal-body">
                                    <div class="input-group">
                                        <span class="input-group-addon">新类型名称:</span>
                                        <input class="form-control" name="postTypeEntity.cateName" type="text"
                                               maxlength="10">
                                    </div>
                                </div>
                                <div class="modal-footer" style="text-align: center;">
                                    <button type="submit" class="btn btn-primary">提交</button>
                                    &nbsp;&nbsp;&nbsp;
                                    <button type="button" id="btnaddclose" class="btn btn-danger">取消</button>
                                </div>

                            </div>
                        </form>
                    </div>
                    <script>
                        var typeadd = document.getElementById("typeadd");//获得提交id
                        var btn_add = document.getElementById("btn_add");//获得新建按钮id
                        var btn_add_close = document.getElementById("btnaddclose");//获得模态框取消id

                        btn_add_close.onclick = function () {//按取消隐藏模态框
                            typeadd.style.display = "none";
                        }

                        btn_add.onclick = function () {//按新建显示模态框并且修改宽度与大小
                            typeadd.style.marginLeft = "40%";
                            typeadd.style.marginTop = "15%";
                            typeadd.style.display = "block";
                        }
                        window.onclick = function (event) {
                            if (event.target == typeadd) {
                                typeadd.style.display = "none";
                            }
                        }
                        if ("${onaddtrue}" != 0) {//判断是否添加成功
                            alert("添加成功")
                            location.replace(document.referrer);//获得上一个url
                            document.referrer //前一个页面的URL
                        } else if ("${onaddtrue}" == -1) {
                            alert("添加失败")
                            location.replace(document.referrer);//获得上一个url
                            document.referrer //前一个页面的URL
                        }
                    </script>
                </tr>
                <tr class="active">
                    <th>序号</th>
                    <th>类别名称</th>
                    <th>帖子总数</th>
                    <th>执行操作</th>
                </tr>
                <%int n = 0;%>
                <s:iterator value="typelist">
                    <tr>
                        <td style="vertical-align: middle;"><span
                                style="font-family: 微软雅黑;font-size: 14px;"><%=++n%></span>
                        </td>
                        <td style="vertical-align: middle;"><span id="cateName"
                                                                  style="font-family: 微软雅黑;font-size: 14px;word-wrap:break-word;word-break:break-all;overflow: hidden;">${cateName}</span>
                        </td>
                        <td style="vertical-align: middle;"><span
                                style="font-family: 微软雅黑;font-size: 14px;font-size: 14px;word-wrap:break-word;word-break:break-all;overflow: hidden;">${catePostCount}</span>
                        </td>
                        <td style="vertical-align: middle;" width="30%">
                            <s:if test="%{cateId==1}">
                                &nbsp;
                                <button data-id="" class="btn btn-default">转移</button>
                            </s:if>
                            <s:else>                                                                &nbsp;
                                <button class="btn btn-primary" id="toedit<%=n%>">编辑</button>
                                <div id="typeedit<%=n%>" class="modal" style="width: 300px;">
                                    <form action="admin_typeedit" name="admin_typeedit<%=n%>" style="padding-top: 0;">
                                        <div class="modal-content">
                                            <div class="modal-header"
                                                 style="background-color: #EFEFEF;padding-top: 10px;padding-bottom: 10px;">
                                                <span style="font-size: 14px;font-family: 微软雅黑;">编辑类型名称</span></div>
                                            <div class="modal-body">
                                                <div class="input-group">
                                                    <input type="hidden" name="postTypeEntity.cateId" value="${cateId}" />
                                                    <span class="input-group-addon">类型名称:</span>
                                                    <input class="form-control" name="postTypeEntity.cateName"
                                                           type="text" maxlength="10"
                                                           value="${cateName}">
                                                </div>
                                            </div>
                                            <div class="modal-footer" style="text-align: center;">
                                                <button type="submit" class="btn btn-primary">提交</button>
                                                &nbsp;&nbsp;&nbsp;
                                                <button type="button" id="btneditclose<%=n%>" class="btn btn-danger">
                                                    取消
                                                </button>
                                            </div>

                                        </div>
                                    </form>
                                </div>
                                <script>
                                    //暂时未找到读取表格的方法
                                    var typeedit<%=n%> = document.getElementById("typeedit<%=n%>");
                                    var btn_edit<%=n%> = document.getElementById("toedit<%=n%>");
                                    btn_edit<%=n%>.onclick = function () {
                                        typeedit<%=n%>.style.marginLeft = "40%";
                                        typeedit<%=n%>.style.marginTop = "15%";

                                        typeedit<%=n%>.style.display = "block";
                                    }

                                    var btneditclose<%=n%> = document.getElementById("btneditclose<%=n%>");//获得模态框取消id

                                    btneditclose<%=n%>.onclick = function () {//按取消隐藏模态框
                                        typeedit<%=n%>.style.display = "none";
                                    }

                                    if ("${onedit}" == "true") {
                                        alert("修改成功")
                                        location.replace(document.referrer);//获得上一个url
                                        document.referrer //前一个页面的URL
                                    } else if ("${onedit}" == "false") {
                                        alert("修改失败")
                                        location.replace(document.referrer);//获得上一个url
                                        document.referrer //前一个页面的URL
                                    }
                                </script>
                                &nbsp;
                                <button data-id="" class="btn btn-default">转移</button>
                                &nbsp;

                                <a id="catedelete" href="admin_typedel?postTypeEntity.cateId=${cateId}"
                                   onclick="return confirm('确定删除？删除后文章将转移至默认下')" class="btn btn-danger">删除</a>
                                <script type="text/javascript">
                                    if ("${ondel}" == "true") {
                                        alert("删除成功");
                                        location.replace(document.referrer);//获得上一个url
                                        document.referrer //前一个页面的URL
                                    } else if ("${ondel}" == "false") {
                                        alert("删除失败");
                                        location.replace(document.referrer);//获得上一个url
                                        document.referrer //前一个页面的URL
                                    }
                                </script>
                            </s:else>
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
