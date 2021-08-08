<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 曜
  Date: 2021/8/8
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>




<form action="/test/insert">
   业务详情编号<input type="text" name="bdid"><br>
    <%--业务序号<input type="text"name="bid"><br>--%>
    业务序号<input type="text"name="bid" value="${sessionScope.business.bid}"><br>
    排队号<input type="text" name="bnum" value=${sessionScope.business.bnum}><br>
    业务类型<input type="text" name="btype" value=${sessionScope.business.btype}><br>
    备注信息<input type="text" name="bmark" value=${sessionScope.business.bmark}><br>
    详细名称<input type="text" name="bdname"><br>
    办理人<input type="text" name="bdperson"><br>

    <input type="submit" value="确认添加">


</form>




</body>
</html>
