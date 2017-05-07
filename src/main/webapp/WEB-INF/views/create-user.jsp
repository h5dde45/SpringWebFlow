<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<form:form method="POST" modelAttribute="user"
           class="box login">
    <fieldset class="boxBody">
        <form:label path="name">
            <spring:message code="username" />
        </form:label>
        <form:input path="name"/>
        <form:label path="password">
            <spring:message code="password" />
        </form:label>
        <form:password path="password"/>

        <c:if test="${not empty message}">
				<span style="float: right"
                      class="error">${message}</span>
        </c:if>
    </fieldset>
    <footer>

        <input type="submit" class="btnLogin"
               value=" <spring:message code="cancel" />" name="_eventId_cancel">

        <input type="submit" class="btnLogin"
               value="<spring:message code="create" />" name="_eventId_submit">

    </footer>
</form:form>
</body>
</html>