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
                        <img src="${user.avatar}" alt="" class="user-pic"/>
                    </div>
                </div>
                <div class="user-username">
                    <h3 class="text-dark font-weight-bold txt1 h1">${user.fullname}</h3>
                    <span class="txt1 h4">Welcome to Carity</span>
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
            <div class="main-post-sec">
                <div class="post-topbar row justify-content-between post">
                    <div class="user-pi col-md-2">
                        <img src="${user.avatar}" class="user-pic" />
                    </div>
                    <div class="col-md-8 user-posting">
                        <ul class="d-flex justify-content-between p-0 m-0">
                            <li>
                                <button class="border-0" type="button" data-toggle="modal" data-target="#post-story">Post your Story</button>
                                <div class="modal hide fade" id="post-story" tabindex="-1" role="dialog" aria-labelledby="post-story" aria-hidden="true">
                                    <div class="modal-dialog modal-dialog-centered" role="document">
                                      <div class="modal-content">
                                        <div class="modal-header">
                                          <h5 class="modal-title" id="post-story">Post Your Story</h5>
                                          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                          </button>
                                        </div>
                                        <div class="modal-body">
                                            <form>
                                                <div class="wrap-input100 validate-input">
                                                    <textarea class="post-font h-100" placeholder="Share your experience" rows="3"></textarea>
                                                </div>
                                                <div class="wrap-input100 validate-input mt-2">
                                                    <input class="post-font" type="file" accept="image/gif, image/jpeg, image/png" name="story-pic" id="story-pic"/>
                                                </div>
                                                <div class="wrap-input100 validate-input mt-2">
                                                    <img id="output" width="100%" height="auto">
                                                </div>
                                            </form>
                                        <div class="modal-footer">
                                          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                          <button type="submit" class="btn btn-primary" data-dismiss="modal">Post</button>
                                        </div>
                                      </div>
                                    </div>
                                </div>
                            </li>
                            <li>
                                <button class="ac border-0" type="button" data-toggle="modal" data-target="#post-auction">Hold an Auction</button>
                                <div class="modal hide fade" id="post-auction" tabindex="-1" role="dialog" aria-labelledby="post-auction" aria-hidden="true">
                                    <div class="modal-dialog modal-dialog-centered" role="document">
                                      <div class="modal-content">
                                        <div class="modal-header">
                                          <h5 class="modal-title" id="post-auction">Open An Auction</h5>
                                          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                          </button>
                                        </div>
                                        <div class="modal-body">
                                            <form>
                                                <div class="wrap-input100 validate-input">
                                                    <textarea class="post-font h-100" placeholder="About your item" rows="3"></textarea>
                                                </div>
                                                <div class="wrap-input100 validate-input mt-2">
                                                    <input class="post-font" type="number" min="0" id="price" name="price" placeholder="Enter min item price" step="1000"/>
                                                </div>
                                                <h6 class="post-font border-0 mt-3 mb-0">Your item image</h6>
                                                <div class="wrap-input100 validate-input">
                                                    <input class="post-font" type="file" accept="image/gif, image/jpeg, image/png, image/jpg" name="item-pic" id="item-pic"/>
                                                </div>
                                                <div class="wrap-input100 validate-input">
                                                    <img id="output1" width="100%" height="auto">
                                                </div>
                                            </form>
                                        </div>
                                        <div class="modal-footer">
                                          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                          <button type="submit" class="btn btn-primary" data-dismiss="modal">Post</button>
                                        </div>
                                      </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
                <section class="posts mt-4">
                    <div class="post-tab row border-bottom pt-2 pl-2 pr-2 tab-wrapper">
                        <div class="col-lg-1"></div>
                        <button class="col-auto border border-bottom-0 p-2 text-center w-25 rounded general tab active" data-post="norm-post">
                            <i class="fa-2x fa-solid fa-users"></i>
                            <span class="txt1 h6 m-0">Posts</span>
                        </button>
                        <button class="col-auto border border-bottom-0 p-2 text-center w-25 rounded ml-2 general tab" data-post="auction-post">
                            <i class="fa-2x fa-solid fa-gavel"></i>
                            <span class="txt1 h6 m-0">Auctions</span>
                        </button>
                    </div>
                    <div id="norm-post" class="tab-item active">
                        <c:forEach items="${posts}" var="p">
                        <c:if test="${p[4] == false}">
                            <div class="posts mt-2" id="post">
                                <div class="post border pb-0">
                                    <div class="post-head border-bottom">
                                        <div class="row justify-content-between">
                                            <div class="col-md-10 user-pi d-flex">
                                                <img src="${p[9]}" class="user-pic" />
                                                <div class="ml-2">
                                                    <h6 class="m-0">${p[8]}</h6>
                                                    <span><i class="fa-regular fa-clock"></i></span>
                                                    <span id="postedDate">${p[3]}</span>
                                                </div>
                                            </div>
                                            <div class="col-md-2">
                                                <button class="border-0 button-ellips rounded-circle"><i class="fa-2x fa-solid fa-ellipsis"></i></button>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="post-body mt-3 pb-1 border-bottom">
                                        <div class="post-content">
                                            <h6 class="pr-3 pl-3">${p[1]}</h6>
                                        </div>
                                        <div class="post-pic">
                                            <img src="${p[2]}" class="border mt-1">
                                        </div>
                                    </div>
                                    <div class="post-footer mt-1 mb-1 d-flex justify-content-between position-relative">
                                        <button class="btn btn-outline-light w-100 text-dark general" id="likebtn" type="button" data-toggle="button">
                                            <i class="fa-regular fa-thumbs-up"></i>
                                            <input type="button" name="like" value="Like" class="border-0 bg-transparent"/>
                                            <span>100</span>
                                        </button>
                                        <button class="btn btn-outline-light w-100 text-dark general" id="commentsbtn" type="button" >
                                            <i class="fa-regular fa-comments"></i>
                                            <input type="button" name="comments" value="Comments" class="border-0 bg-transparent"/>
                                        </button>
                                    </div>
                                    <div id="comment-section">
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
                        </c:if>
                        </c:forEach>
                    </div>
                    <div id="auction-post" class="tab-item">
                        <c:forEach items="${posts}" var="p">
                        <c:if test="${p[4] == true}">
                        <div class="posts mt-2" id="auction">
                            <div class="post border pb-0">
                                <div class="post-head border-bottom">
                                    <div class="row justify-content-between">
                                        <div class="col-md-10 user-pi d-flex">
                                            <img src="${p[9]}" class="user-pic" />
                                            <div class="ml-2">
                                                <h6 class="m-0">${p[8]}</h6>
                                                <span><i class="fa-regular fa-clock"></i></span>
                                                <span id="postedDate">${p[3]}</span>
                                            </div>
                                        </div>
                                        <div class="col-md-2">
                                            <button class="border-0 button-ellips rounded-circle"><i class="fa-2x fa-solid fa-ellipsis"></i></button>
                                        </div>
                                    </div>
                                </div>
                                <div class="post-body mt-3 pb-1 border-bottom">
                                    <div class="post-content">
                                        <h6 class="pr-3 pl-3">${p[1]}</h6>
                                        <div class="row align-items-center">
                                            <h6 class="col-md-6 m-0">Current Bid: ${p[5]}</h6>
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
                                        <img src="${p[2]}" class="border mt-1">
                                    </div>
                                </div>
                                <div class="post-footer mt-1 mb-1 d-flex justify-content-between position-relative">
                                    <button class="btn btn-outline-light w-100 text-dark general" id="likebtn" type="button" data-toggle="button">
                                        <i class="fa-regular fa-thumbs-up"></i>
                                        <input type="button" name="like" value="Like" class="border-0 bg-transparent"/>
                                        <span>100</span>
                                    </button>
                                    <button class="btn btn-outline-light w-100 text-dark general" id="commentsbtn" type="button">
                                        <i class="fa-regular fa-comments"></i>
                                        <input type="button" name="comments" value="Comments" class="border-0 bg-transparent"/>
                                    </button>
                                </div>
                                <div id="comment-section1">
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
                        </c:if>
                        </c:forEach>
                    </div>
                </section>
            </div>
        </div>
        <div class="col-md-2"></div>
    </div>
</div>
<script>
    let date = document.querySelectorAll("#postedDate");
    for(let i = 0; i < date.length; i ++){
        let d = date[i];
        d.innerText = moment(d.innerText).fromNow();
    }
</script>