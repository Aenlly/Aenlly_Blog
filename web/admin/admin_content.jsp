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
<div class="panel-body">
    <table width="100%" class="text-center table-hover">
        <tr>
            <td style="text-align: left;">
                <%-- 搜索内容搜索条 --%>
                <form class="navbar-form" action="admin_article_title" role="search">
                    <div class="form-group">
                        <input type="text" class="form-control" name="post_Entity.postTitle" placeholder="搜索内容">
                        <s:if test="%{#count!=null}">
                            查询结果:共${count}条记录
                        </s:if>
                        <s:else>
                        </s:else>
                    </div>

                </form>
                <!-- navbar-form结束   -->
            </td>
        </tr>

        <tr>
            <td>
                </br>
                <strong>内容标题</strong>
                </br></br>
            </td>
            <td>
                </br>
                <strong>执行操作</strong>
                </br></br>
            </td>
        </tr>
        <s:iterator value="pagelist">
        <tr>
            <td>
                </br>
                <div class="center-block" style="display:block;width:500px;font-family: 宋体;overflow: hidden;text-overflow: ellipsis;">${postTitle}</div>
            </td>
            <td width="30%">
                </br>
                <a href="#" class="btn btn-default">查看</a>
                &nbsp;
                <a href="" class="btn btn-primary">编辑</a>
                &nbsp;
                <a href="admin_delete?Post_Entity.postId=${postId}" class="btn btn-danger">删除</a>
            </td>
        </tr>
        </s:iterator>
        <s:if test="%{#count!=null}">
        </s:if>
        <s:else>
            <tr>
                <td colspan="2">
                    <ul class="pagination">
                        <li><a href="admin_Page?pageNow=${pageNow-1}">上一页</a></li>
                        <li><span>共${pageNow}/${paging.pages}页</span></li>
                        <s:if test="%{isHasNext}">
                            <li><a href="admin_page?pageNow=${pageNow+1}">下一页</a></li>
                        </s:if>
                        <s:else>
                            <li><a href="admin_page?pageNow=${pageNow}">下一页</a></li>
                        </s:else>
                    </ul>
                </td>
            </tr>
        </s:else>
    </table>
</div>
</body>
</html>
