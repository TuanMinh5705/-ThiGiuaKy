<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee list</title>
</head>
<body>
<h1>Employee list</h1>
<div>
    <form action="/employee?action=search" method="Get">
        <input type="text" name="keyword">
        <input type="submit" value="Search">
    </form>
</div>
<div>
    <a href="/employee?action=add">
        <button>Add Employee</button>
    </a>
</div>
<div>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Age</td>
            <td>Role</td>
            <td>Department</td>
            <td>Salary</td>
            <td>Act</td>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.age}</td>
                <td>${employee.role}</td>
                <td>${employee.department}</td>
                <td>${employee.salary}</td>
                <td>
                    <a href="/employee?action=edit&id=${employee.id}">Edit</a><br>
                    <a href="/employee?action=delete&id=${employee.id}">Delete</a><br>
                    <a href="/employee?action=view&id=${employee.id}">ViewInfor</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
