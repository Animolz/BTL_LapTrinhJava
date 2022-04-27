<%-- 
    Document   : index
    Created on : Mar 30, 2022, 11:43:39 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container mt-5">
    <div class="row justify-content-between">
        <div class="col-lg-3 col-md-4 p-0">
            <div class="user-data text-center">
                <div class="user-profile">
                    <div class="user-picture w-100">
                        <img src="<c:url value="/resources/media/pics/avatar.png" />" alt="" class="user-pic"/>
                    </div>
                </div>
                <div class="user-username">
                    <h3 class="text-dark font-weight-bold">John Doe</h3>
                    <span>Graphic Designer at Self Employed</span>
                </div>
            </div>
            <div class="suggestion mt-3">
                <div class="sg-title m-3 d-flex justify-content-between">
                    <h6 class="text-dark">Suggestions</h6>
                    <i class="fa fa-address-book m-1" aria-hidden="true"></i>
                </div>
                <div class="sg-content">
                    <ul class='sg-users p-0 ml-4 mr-5'>
                        <li>
                            <img src="<c:url value="/resources/media/pics/avatar.png" />" class="user-pic" />
                            <h6>Temp</h6>
                        </li>
                        <li>
                            <img src="<c:url value="/resources/media/pics/avatar.png" />" class="user-pic" />
                            <h6>Temp</h6>
                        </li>
                        <li>
                            <img src="<c:url value="/resources/media/pics/avatar.png" />" class="user-pic" />
                            <h6>Temp</h6>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-lg-6 col-md-8">
            <div class="main-post-sec">
                <div class="post-topbar row justify-content-between post">
                    <div class="user-pi col-md-2">
                        <img src="<c:url value="/resources/media/pics/avatar.png" />" class="user-pic" />
                    </div>
                    <div class="col-md-8 user-posting">
                        <ul class="d-flex justify-content-between p-0 m-0">
                            <li><a href="#">Post your Story</a></li>
                            <li><a href="#" class="active">Hold an Auction</a></li>
                        </ul>
                    </div>
                </div>
                <div class="posts mt-5 border-left border-right">
                    <div class="post border-bottom">
                        <div class="post-head">
                            <div class="row justify-content-between">
                                <div class="col-md-10 user-pi d-flex">
                                    <img src="<c:url value="/resources/media/pics/avatar.png" />" class="user-pic" />
                                    <div class="ml-2">
                                        <h6 class="m-0">John Doe</h6>
                                        <span><i class="fa-regular fa-clock"></i></span>
                                        <span>3 min ago</span>
                                    </div>
                                </div>
                                <div class="col-md-2">
                                    <button class="border-0 button-ellips"><i class="fa-2x fa-solid fa-ellipsis"></i></button>
                                </div>
                            </div>
                        </div>
                        <div class="post-content">

                        </div>
                        <div class="post-footer"></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-2"></div>
    </div>
</div>