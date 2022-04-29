<%-- 
    Document   : header
    Created on : Mar 31, 2022, 9:35:29 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header id="header">
        <div class="container pb-2">
            <div class="row pt-1 justify-content-between">
                <div class="logo m-2">
                    <a class="logo-link" href="#">
                        <img src="<c:url value="/resources/media/pics/headerIcon.png" />" alt="alt" class="mt-1"/>
                    </a>
                </div>
                <div class="search-bar col-md-3">
                    <form  action="" class="d-flex">
                        <input type="text" name="search" placeholder="Search...." class="search-content" />
                        <button type="submit" name="searchBtn" id="searchBtn">
                            <i class="fas fa-search" ></i>
                        </button>
                    </form>
                </div>
                <div class="nav col-md-6">
                    <nav class="navbar navbar-expand-md">
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                          <span class="navbar-toggler-icon"></span>
                        </button>

                        <div class="collapse navbar-collapse" id="collapsibleNavbar">
                          <ul class="navbar-nav">
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Home</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Profiles</a>
                                </li>
                                 <li class="nav-item">
                                    <a class="nav-link" href="#">Notifications</a>
                                </li>
                            </ul>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </nav>
</header>