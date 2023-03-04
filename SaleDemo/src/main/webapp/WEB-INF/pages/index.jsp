<%-- 
    Document   : index
    Created on : Mar 4, 2023, 1:34:10 PM
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Bán hàng trực tuyến</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
                    <ul class="navbar-nav">
                        <c:forEach items="${categories}" var="c">
                            <li class="nav-item">
                                <a class="nav-link" href="#">${c.name}</a>
                            </li>
                        </c:forEach>
                    </ul>
                </div>
            </div>
        </nav>
        <section class="container">
            <div class="row mx-1 my-2">
                <c:forEach items="${products}" var="p">
                <div class="col-sm-1 col-xl-3 my-2">
                    <div class="card">
                        <img class="card-img-top" src="${p.image}" alt="Card image">
                        <div class="card-body">
                            <h4 class="card-title">${p.name}</h4>
                            <p class="card-text">${p.price}</p>
                            <a href="#" class="btn btn-primary">Xem chi tiết</a>
                            <a href="#" class="btn btn-primary">Đặt hàng</a>
                        </div>
                    </div>
                </div>
                </c:forEach>
            </div>
        </section>
    </body>
</html>
