<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <%@ include file="meta.jsp"%>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <title>Document</title>
</head>
<body>
    <%@ include file="header.jsp"%>
    <div class="container">
    <div>
        <h2>게시판</h2>
        <table class="table">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>작성일</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="board" items="${boards}">
                <tr>
                    <td>${board.id}</td>
                    <td>
                        <a href="view?id=${board.id}">
                            ${board.title}
                        </a>
                    </td>
                    <td>${board.author}</td>
                    <td>${board.created_at}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
      <c:if test="${sessionScope.username != null}">
        <div>
            <a href="write.jsp" class="btn btn-primary">글쓰기</a>
        </div>
      </c:if>

    </div>
</div>
<%@ include file="footer.jsp"%>
</body>
</html>











