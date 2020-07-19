<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/19
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
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
                主题
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
                </br>
                文章类别
            </td>
        </tr>
        <tr>
            <td>
                <select class="form-control" name="">
                    <option value="">请选择类别</option>
                    <s:iterator value="typelist">
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
</body>
</html>
