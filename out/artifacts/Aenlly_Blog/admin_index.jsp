<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Aenlly
  Date: 2020/7/12
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <s:iterator value="adminlists">
        <tr>
            <td>
                    ${adminId }
            </td>
            <td>
                    ${adminNickname }
            </td>
            <td>
                    ${adminPwd }
            </td>
            <td>
                    ${adminPower }
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
