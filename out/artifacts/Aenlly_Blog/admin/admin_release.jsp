<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/19
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <div class="row">
        <form role="form" action="admin_releaseadd">
        <table width="100%">
            <tr>
                <td>
                    标题
                </td>
            </tr>
            <tr>
                <td>
                    <input type="text" class="form-control" required="required" name="PostEntity.postTitle" width="100%" maxlength="30" >
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
                    <select class="form-control" name="PostEntity.themeName">
                        <s:iterator value="themelist">
                            <option>${themeName}</option>
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
                    <select class="form-control" name="PostEntity.cateName">
                        <s:iterator value="typelist">
                            <option>${cateName}</option>
                        </s:iterator>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    </br>
                    作者
                </td>
            </tr>
            <tr>
                <td>
                    <input type="text" class="form-control" required="required" name="PostEntity.postAuthor" width="100%" maxlength="10">
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
                    <script id="content" name="PostEntity.postContent" type="text/plain">
                    </script>
                    <!-- 配置文件 -->
                    <script type="text/javascript"
                            src="<%=request.getContextPath() %>/editor/ueditor.config.js"></script>
                    <!-- 编辑器源码文件 -->
                    <script type="text/javascript"
                            src="<%=request.getContextPath() %>/editor/ueditor.all.min.js"></script>
                    <!-- 实例化编辑器 -->
                    <script type="text/javascript">
                        var ue = UE.getEditor('content');
                    </script>
                </td>
            </tr>
            <tr>
                <td align="center">
                    </br>
                    <button class="btn btn-primary btn-lg" type="submit">
                        提交
                    </button>
                </td>
            </tr>
        </table>
        </form>
        <script type="text/javascript">
            if("${iscontadd}"=="true"){
                alert("发布成功");
                location.replace(document.referrer);//获得上一个url
                document.referrer //前一个页面的URL
            }else if("${iscontadd}"=="false"){
                alert("发布失败");
                location.replace(document.referrer);//获得上一个url
                document.referrer //前一个页面的URL
            }else{}

        </script>
    </div>
</div>
</body>
</html>
