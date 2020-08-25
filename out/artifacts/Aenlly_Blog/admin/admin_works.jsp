<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/19
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<div class="panel-heading">
    <span style="font-family: 宋体;font-size: 14px;"><strong>作品管理</strong></span>
</div>
<div class="panel-body">
    <%-- 搜索内容搜索条 --%>
    <form class="navbar-form" action="admin_works_title" role="search" style="padding-left: 0;">
        <div class="form-group">
            <input type="text" class="form-control" name="postEntity.postTitle" placeholder="搜索内容标题">
            <s:if test="%{#count!=null}">
                查询结果:共${count}条记录
            </s:if>
            <s:else>
            </s:else>
        </div>

    </form>
    <!-- navbar-form结束   -->
    <table class="table text-center">
        <tr class="active">
            <td>
                <strong>序号</strong>
            </td>
            <td>
                <strong>内容标题</strong>
            </td>
            <td>
                <strong>文章类别</strong>
            </td>
            <td>
                <strong>执行操作</strong>
            </td>
        </tr>
        <%int n = 0;%>
        <s:iterator value="workslist">
            <tr>
                <td style="vertical-align: middle;"><%=++n%>
                </td>
                <td style="vertical-align: middle;">
                    <div
                            style="display:block;font-family: 微软雅黑;font-size: 14px;word-wrap:break-word;word-break:break-all;overflow: hidden;">
                            ${postTitle}
                    </div>
                </td>
                <td style="vertical-align: middle;">
                    <div
                            style="display:block;font-family: 微软雅黑;font-size: 14px;word-wrap:break-word;word-break:break-all;overflow: hidden;">
                            ${cateName}
                    </div>
                </td>
                <td width="30%">
                    <a href="#" class="btn btn-default">查看</a>
                &nbsp;
                    <a href="" class="btn btn-primary">编辑</a>
                &nbsp;
                    <a href="admin_delete?Post_Entity.postId=${postId}"  onclick="return confirm('确定删除该作品？删除后不可恢复！')" class="btn btn-danger">删除</a>
                </td>
            </tr>
        </s:iterator>
        <s:if test="%{#count!=null}">
        </s:if>
        <s:else>
            <tr>
                <td colspan="4">
                    <ul class="pagination">
                        <li><a href="admin_works?pageNow=${pageNow-1}">上一页</a></li>
                        <li><span>共${pageNow}/${paging.pages==0?1:paging.pages}页</span></li>
                        <s:if test="%{isHasNext}">
                            <li><a href="admin_works?pageNow=${pageNow+1}">下一页</a></li>
                        </s:if>
                        <s:else>
                            <li><a href="admin_works?pageNow=${pageNow}">下一页</a></li>
                        </s:else>
                    </ul>
                </td>
            </tr>
        </s:else>
    </table>
</div>
</body>
</html>
