<%-- 
    Document   : admin-user-input
    Created on : May 3, 2022, 1:15:04 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${error != null}"><div class="txt1 h5 alert alert-danger text-center my-2 w-100 p-2">${error}</div></c:if>

<div class="container">
    <c:url var="action" value="/admin-user/input/add"/>
    <form:form method="POST" action="${action}" modelAttribute="user" 
               enctype="multipart/form-data">
        <span class="login-signup-display my-2">Add User</span>
        <div class="mt-4 mb-2">
            <span class="txt1">Username</span>
        </div>
        <div class="wrap-input100 validate-input">
            <form:input cssClass="login-signup-form" path="username"/>
        </div>
        <div class="mt-4 mb-2">
            <span class="txt1">Password</span>
        </div>
        <div class="wrap-input100 validate-input">
            <form:input type="password" cssClass="login-signup-form" path="password"/>
        </div>
        <div class="mt-4 mb-2">
            <span class="txt1">Email</span>
        </div>
        <div class="wrap-input100 validate-input">
            <form:input type="email" cssClass="login-signup-form" path="email"/>
        </div>
        <div class="mt-4 mb-2">
            <span class="txt1">Full name</span>
        </div>
        <div class="wrap-input100 validate-input">
            <form:input cssClass="login-signup-form" path="fullname"/>
        </div>
        <div class="mt-4 mb-2">
            <span class="txt1">Phone</span>
        </div>
        <div class="wrap-input100 validate-input">
            <form:input cssClass="login-signup-form" path="phone"/>
        </div>
        <div class="mt-4 mb-2">
            <span class="txt1">Role</span>
        </div>
        <div class="wrap-input100 validate-input">
            <form:select path="role" cssClass="login-signup-form" >
                <form:option value="Admin" cssClass="login-signup-form" label="Admin" />
                <form:option value="User" cssClass="login-signup-form" label="User" />
            </form:select>
        </div>
        <div id="submit-container" class="mt-5">
            <button type="submit" class="w-100" id="submitBtn">
                <input type="button" name="add-user-submit" value="Add" class="button"/>
            </button>
        </div>
    </form:form>
</div>
