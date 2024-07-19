<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Lab 5</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container-fluid">
        <c:set var="pageTitle" value="Post Details"/> <%-- scope의 기본값은 page --%>
        <%@ include file="../fragments/header.jspf" %>
        
        <main>
            <div class="mt-2 card">
                <div class="card-header">
                    <h2>마이페이지</h2>
                </div>
                <div class="card-body">
                    <form>
                        <div class="mt-2">
                            <label for="id" class="form-label" >아이디</label>
                            <input id="id" class="form-control" type="text" value="${userInfo.userid}" readonly/>
                        </div>
                        <div class="mt-2">
                            <label for="title" class="form-label">비밀번호</label>
                            <input id="title" class="form-control" type="text" value="${userInfo.password}" readonly/>
                        </div>
                        <div class="mt-2">
                            <label for="content" class="form-label">이메일</label>
                            <input id="content" class="form-control" readonly value="${ userInfo.email }">
                        </div>
                        <div class="mt-2">
                            <label for="author" class="form-label">보유 포인트</label>
                            <input id="author" class="form-control" type="text" value="${userInfo.points}" readonly/>
                    </form>
                </div>
            </div>
        </main>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>