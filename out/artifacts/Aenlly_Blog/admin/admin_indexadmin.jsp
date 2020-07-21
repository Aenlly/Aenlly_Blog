<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="com.aenlly.entity.Index_Entity" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/21
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div class="panel-heading">
    <span style="font-family: 宋体;font-size: 14px;"><strong>主页管理</strong></span>
</div>
<div class="panel-body">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6 text-center">
            <div class="row">
                </br>
                </br>
                </br>
                </br>
            </div>
            <!--   空白row。用于换行添加宽度    -->
            <div class="row">
                <div class="col-md-12">
                    <form action="admin_indexupdate">
                        <s:iterator value="indexlist">
                            <s:hidden name="indexEntity.indexId" value="%{indexId}"></s:hidden>
                            <div class="input-group">
                                <span class="input-group-addon">主页名称：&nbsp;&nbsp;&nbsp;&nbsp;</span>
                                <input class="form-control" name="indexEntity.indexName" required="required"
                                       value="${indexName}" maxlength="20">
                                <span class="input-group-addon">最多输入10字符&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-addon">导航栏配色：</span>
                                <input class="form-control" id="inputColor" oninput="index_color()"
                                       name="indexEntity.indexColor" required="required" value="${indexColor}"
                                       maxlength="6">
                                <span class="input-group-addon">输入十六进制</span>
                                <span class="input-group-addon" id="indexColor"
                                      style="background-color: #${indexColor}">&nbsp;&nbsp;&nbsp;</span>
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-addon">显示文章数：</span>
                                <input class="form-control" name="indexEntity.indexColumn" required="required"
                                       type="number" value="${indexColumn}"
                                       max="10" min="1">
                                <span class="input-group-addon">最小为1，最大为10</span>
                            </div>
                            <br>
                            <button class="btn btn-primary btn-block" type="submit">保存</button>
                        </s:iterator>
                    </form>
                </div>
            </div>
            <!--   显示主页管理内容的row   -->
            <div class="row">
                </br>
                </br>
                </br>
                </br>
            </div>
            <!--   空白row。用于换行添加宽度    -->
        </div>
        <div class="col-md-3"></div>
    </div>
</div>
<script type="text/javascript">
    if ("${ontrue}" == "true") {//获得后台的值
        alert("保存成功");
        location.replace(document.referrer);//获得上一个url
        document.referrer //前一个页面的URL
    } else if ("${ontrue}" == "false") {
        alert("保存失败");
        location.replace(document.referrer);//获得上一个url
        document.referrer //前一个页面的URL
    }

    //输入十六进制数旁边显示相应的颜色
    function index_color() {//事件方法
        var color = document.getElementById("inputColor").value;//获得输入颜色的值
        document.getElementById("indexColor").setAttribute("style", "background-color:#" + color + ";");//改变span背景颜色
    }
</script>
</body>
</html>
