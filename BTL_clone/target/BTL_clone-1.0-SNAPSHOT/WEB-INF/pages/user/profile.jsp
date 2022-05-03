<%-- 
    Document   : profile
    Created on : Apr 29, 2022, 8:36:41 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<section class="cover-sec">
    <img src="<c:url value="/pics/cover-img.jpg"/>" alt="alt"/>
</section>

<div class="container mt-5">
    <div class="row justify-content-between">
        <div class="col-lg-3 col-md-4 p-0">
            <div class="profile-pic text-center">
                <div class="user-profile mb-2">
                    <div class="user-picture w-100 p-0 bg-transparent pic-resize">
                        <img src="<c:url value="/pics/avatar.png" />" alt="" class="user-pic"/>
                    </div>
                </div>
                <ul id="social-link" class="text-left p-0 border">
                    <li>
                        <a href="https://www.facebook.com/profile.php?id=100038061072521" class="d-flex">
                            <i class="fa-2x  fa-brands fa-facebook-square mr-1"></i>
                            <h6 class="txt1 no-wrap m-0">https://www.facebook.com/profile.php?id=100038061072521</h6>
                        </a>
                    </li>
                    <li>
                        <a href="https://www.instagram.com/l.h.n_animol/" class="d-flex">
                            <i class="fa-2x fa-brands fa-instagram-square mr-1"></i>
                            <h6 class="txt1 no-wrap m-0">https://www.instagram.com/l.h.n_animol/</h6>
                        </a>
                    </li>
                </ul>
            </div>
            <div class="suggestion mt-3">
                <div class="sg-title m-3 d-flex justify-content-between">
                    <h6 class="text-dark">Suggestions</h6>
                    <i class="fa fa-address-book m-1" aria-hidden="true"></i>
                </div>
                <div class="sg-content">
                    <ul class='sg-users p-0 ml-4 mr-5'>
                        <li>
                            <img src="<c:url value="/pics/avatar.png" />" class="user-pic" />
                            <h6>Temp</h6>
                        </li>
                        <li>
                            <img src="<c:url value="/pics/avatar.png" />" class="user-pic" />
                            <h6>Temp</h6>
                        </li>
                        <li>
                            <img src="<c:url value="/pics/avatar.png" />" class="user-pic" />
                            <h6>Temp</h6>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="col-lg-6 col-md-8">
            <div class="main-post-sec margin-resize-1">
                <section class="profile-header posts">
                    <div class="d-flex align-items-center"><i class="fa-2x fa-solid fa-circle-info text-success mr-2"></i><p class="txt1 m-0 h1 text-success">INFO</p></div>
                    <div class="posts border border-top-0 pt-3 pb-2 pl-4 pr-4 margin-resize-1">
                        <div class="row align-items-center mb-2">
                            <span class="txt1 h4 max-w-fit mr-1 col-auto m-0">John Doe</span>
                            <span class="txt1 h6 m-0 col-auto text-muted"> has post 10 posts </span>
                        </div>
                        <span class="txt1 h6 text-secondary">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua</span>
                    </div>
                </section>
                <section class="posts">
                    <div class="posts mt-3">
                        <div class="post border pb-0">
                            <div class="post-head border-bottom">
                                <div class="row justify-content-between">
                                    <div class="col-md-10 user-pi d-flex">
                                        <img src="<c:url value="/pics/avatar.png" />" class="user-pic" />
                                        <div class="ml-2">
                                            <h6 class="m-0">John Doe</h6>
                                            <span><i class="fa-regular fa-clock"></i></span>
                                            <span>3 min ago</span>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="border-0 button-ellips rounded-circle"><i class="fa-2x fa-solid fa-ellipsis"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="post-body mt-3 pb-1 border-bottom">
                                <div class="post-content">
                                    <h6 class="pr-3 pl-3">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</h6>
                                </div>
                                <div class="post-pic">
                                    <img src="<c:url value="/pics/crowd.png" />" class="border mt-1">
                                </div>
                            </div>
                            <div class="post-footer mt-1 mb-1 d-flex justify-content-between position-relative">
                                <button class="btn btn-outline-light w-100 text-dark" id="likebtn" type="button" data-toggle="button">
                                    <i class="fa-regular fa-thumbs-up"></i>
                                    <input type="button" name="like" value="Like" class="border-0 bg-transparent"/>
                                    <span>100</span>
                                </button>
                                <button class="btn btn-outline-light w-100 text-dark" id="commentsbtn" type="button" data-toggle="collapse" data-target="#comment-section">
                                    <i class="fa-regular fa-comments"></i>
                                    <input type="button" name="comments" value="Comments" class="border-0 bg-transparent"/>
                                </button>
                            </div>
                            <div id="comment-section" class="collapse">
                                <div class="media border p-2">
                                    <img src="<c:url value="/pics/avatar.png" />" alt="John Doe" class="mr-3 mt-3 rounded-circle" style="width:60px;">
                                    <div class="media-body">
                                        <h6>John Doe <small><i class="fa-regular fa-clock"></i> 3 min ago</small></h6>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                    </div>
                                </div>
                                <div class="media border p-2">
                                    <img src="<c:url value="/pics/avatar.png" />" alt="John Doe" class="mr-3 mt-3 rounded-circle" style="width:60px;">
                                    <div class="media-body">
                                        <h6>John Doe <small><i class="fa-regular fa-clock"></i> 3 min ago</small></h6>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="posts mt-3">
                        <div class="post border pb-0">
                            <div class="post-head border-bottom">
                                <div class="row justify-content-between">
                                    <div class="col-md-10 user-pi d-flex">
                                        <img src="<c:url value="/pics/avatar.png" />" class="user-pic" />
                                        <div class="ml-2">
                                            <h6 class="m-0">John Doe</h6>
                                            <span><i class="fa-regular fa-clock"></i></span>
                                            <span>3 min ago</span>
                                        </div>
                                    </div>
                                    <div class="col-md-2">
                                        <button class="border-0 button-ellips rounded-circle"><i class="fa-2x fa-solid fa-ellipsis"></i></button>
                                    </div>
                                </div>
                            </div>
                            <div class="post-body mt-3 pb-1 border-bottom">
                                <div class="post-content">
                                    <h6 class="pr-3 pl-3">This is a shoes</h6>
                                    <div class="row align-items-center">
                                        <h6 class="col-md-6 m-0">Current Bid: 0</h6>
                                        <button class="btn btn-outline-light w-100 text-dark col-md-6 general" id="bidbtn" type="button" data-toggle="modal" data-target="#auction-bid">
                                            <i class="fa-solid fa-gavel"></i>
                                            <input type="button" name="Bid" value="Name your price" class="border-0 bg-transparent"/>
                                        </button>
                                        <div class="modal hide fade" id="auction-bid" tabindex="-1" role="dialog" aria-labelledby="auction-bid" aria-hidden="true">
                                            <div class="modal-dialog modal-dialog-centered" role="document">
                                              <div class="modal-content">
                                                <div class="modal-header">
                                                  <h5 class="modal-title" id="post-auction">Enter your bid</h5>
                                                  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                  </button>
                                                </div>
                                                <div class="modal-body">
                                                    <form>
                                                        <div class="wrap-input100 validate-input mt-2">
                                                            <input class="post-font" type="number" min="0" id="price" name="price" placeholder="Enter min item price" step="1000"/>
                                                        </div>
                                                    </form>
                                                </div>
                                                <div class="modal-footer">
                                                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                  <button type="submit" class="btn btn-primary" data-dismiss="modal">Bid</button>
                                                </div>
                                              </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="post-pic">
                                    <img src="<c:url value="/pics/shoes.png" />" class="border mt-1">
                                </div>
                            </div>
                            <div class="post-footer mt-1 mb-1 d-flex justify-content-between position-relative">
                                <button class="btn btn-outline-light w-100 text-dark general" id="likebtn" type="button" data-toggle="button">
                                    <i class="fa-regular fa-thumbs-up"></i>
                                    <input type="button" name="like" value="Like" class="border-0 bg-transparent"/>
                                    <span>100</span>
                                </button>
                                <button class="btn btn-outline-light w-100 text-dark general" id="commentsbtn" type="button" data-toggle="collapse" data-target="#comment-section1">
                                    <i class="fa-regular fa-comments"></i>
                                    <input type="button" name="comments" value="Comments" class="border-0 bg-transparent"/>
                                </button>
                            </div>
                            <div id="comment-section1" class="collapse">
                                <div class="media border p-2">
                                    <img src="<c:url value="/pics/avatar.png" />" alt="John Doe" class="mr-3 mt-3 rounded-circle" style="width:60px;">
                                    <div class="media-body">
                                        <h6>John Doe <small><i class="fa-regular fa-clock"></i> 3 min ago</small></h6>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                    </div>
                                </div>
                                <div class="media border p-2">
                                    <img src="<c:url value="/pics/avatar.png" />" alt="John Doe" class="mr-3 mt-3 rounded-circle" style="width:60px;">
                                    <div class="media-body">
                                        <h6>John Doe <small><i class="fa-regular fa-clock"></i> 3 min ago</small></h6>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </div>
        </div>
        <div class="col-md-2 col-lg-2">
            <div class="widget border border-top-0 posts mt-3 p-2">
                <div class="widget-header d-flex align-items-center b-2 border-bottom">
                    <h3 class="txt1 m-0">Media</h3>
                    <i class="fa-regular fa-image text-muted"></i>
                </div>
                <div class="widget-gallery mt-2">
                    <ul class="p-0 d-flex flex-wrap justify-content-between">
                        <li>
                            <img src="https://res.cloudinary.com/dyhp6kio1/image/upload/v1651245612/Java/wp5609581_u3xpe2.jpg" alt="alt"/>
                        </li>
                        <li>
                            <img src="https://res.cloudinary.com/dyhp6kio1/image/upload/v1651245593/Java/download_qimbd9.jpg" alt="alt"/>
                        </li>
                        <li>
                            <img src="https://res.cloudinary.com/dyhp6kio1/image/upload/v1651245588/Java/download_a1rlhw.jpg" alt="alt"/>
                        </li>
                        <li>
                            <img src="https://res.cloudinary.com/dyhp6kio1/image/upload/v1651245584/Java/download_lkwf3e.jpg" alt="alt"/>
                        </li>
                        <li>
                            <img src="https://res.cloudinary.com/dyhp6kio1/image/upload/v1651245612/Java/wp5609581_u3xpe2.jpg" alt="alt"/>
                        </li>
                        <li>
                            <img src="https://res.cloudinary.com/dyhp6kio1/image/upload/v1651245593/Java/download_qimbd9.jpg" alt="alt"/>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
