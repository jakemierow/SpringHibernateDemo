<%--
  Created by IntelliJ IDEA.
  User: Jake
  Date: 4/24/20
  Time: 1:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="cp" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Update Donut</title>
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/style.css">
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/donut-form.css>
    <link type="text/css" rel="stylesheet" href="${cp}/resources/css/select-style.css">
</head>
<body>

<%@include file="/WEB-INF/view/includes/header.jsp" %>
    <form:form action="${cp}/donut/save" modelAttribute="aDonut" method="post">
        <table>
            <tr>
                <td><label>Name</label></td>
                <td><form:input path="name"/></td>
        </tr>
            <tr>
                <td><label>Calories</label></td>
                <td><form:input path="calories"/></td>
            </tr>
            <tr>
                <td><label>Donut Shop</label></td>
                <td>
                    <form:select path="shop" items="${donutShops}" itemLabel="name" itemValue="id" cssClass="select-css"
></form:select>
                </td>
            <tr>
                <td></td>
                <td><input type="submit" value="Save" class="save"></td>
            </tr>
            </tr>


        </table>
    </form:form>
<%@include file="/WEB-INF/view/includes/footer.jsp" %>
</body>
</html>
