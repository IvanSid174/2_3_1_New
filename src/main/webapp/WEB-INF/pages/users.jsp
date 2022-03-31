<%--
  Created by IntelliJ IDEA.
  User: ivansidorov
  Date: 29.03.2022
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>USERS</title>
</head>
<body>

<h2>Users</h2>
<table>
<tr>
    <th>id</th>
    <th>Имя</th>
    <th>Отчество</th>
    <th>Фамилия</th>
    <th>Полных лет</th>
    <th>Внести Изминение</th>

</tr>
<c:forEach var="user" items="${userList}">
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.patronymic}</td>
        <td>${user.surname}</td>
        <td>${user.age}</td>
        <th>action</th>
        <td>
            <a href="/edit/${user.id}">edit</a>
            <a href="/delete/${user.id}">delete</a>
        </td>
    </tr>
</c:forEach>
</table>

<h2>Add</h2>
<c:url value="/add" var="add"/>
<a href="${add}">Add new user</a>

</body>
</html>
