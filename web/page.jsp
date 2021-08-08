<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/8/8
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<style type="text/css">
    table
    {
        border-collapse: collapse;
        text-align: center;
        table-layout: fixed;
        width: 700px;
    }
</style>

<head>
    <title>Title</title>
</head>
<body>



<table >
    <tr>
        <td>业务序号</td>
        <td>排队号</td>
        <td>业务类型</td>
        <td>备注信息</td>
        <td>详情名称</td>
        <td>办理人</td>
        <td>操作内容</td>




    </tr>

    <%--<c:forEach items="${sessionScope.business}" var="business">--%>

        <tr>

            <td>${sessionScope.business.bid}</td>
            <td>${sessionScope.business.bnum}</td>
            <td>${sessionScope.business.btype}</td>
            <td>${sessionScope.business.bmark}</td>
            <td></td>
            <td></td>
            <td><a href="addd.jsp">办理业务</a>  <a href="">删除业务</a></td>




        </tr>




    <%--</c:forEach>--%>
</table>

<table>
    <tr>
        <td><a href="add.jsp">新增业务</a></td>
    </tr>
</table>
</body>
</html>
