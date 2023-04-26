<%@ page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String username = (String) session.getAttribute("username");
%>


<header>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">

<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="/index.jsp">Good</a>


    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#"><%= username %>  님 환영합니다.</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
          <i class="bi bi-person-circle"></i>
          </a>

          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="/login.jsp">로그인</a></li>
            <li><a class="dropdown-item" href="/logout">로그아웃</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="/register.jsp">회원가입</a></li>
          </ul>
        </li>

      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
    <nav>
        <ul>

           <c:choose>
                <c:when test="${sessionScope.username != null}">
            <li><a href="logout">로그아웃</a></li>
           </c:when>
           <c:otherwise>
                <li><a href="login.jsp">로그인</a></li>
                <li><a href="register.jsp">회원가입</a></li>
            </c:otherwise>
            </c:choose>
        </ul>
    </nav>

</header>