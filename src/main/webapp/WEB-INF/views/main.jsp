<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8"%>
<c:url value='/' var="root"/>   <!-- 컨텍스트 루트 생성해 root라는 변수에 저정하겠다 -->
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>

    <style>
        body {
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #f8f9fa; /* 배경색 */
        }
        .login-container {
            max-width: 400px;
            width: 100%;
            padding: 20px;
            background: white;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>
<div class="login-container">
    <h2 class="text-center mb-4">로그인</h2>
    <form action="${root}user/login" method="post">
        <!-- 아이디 입력 -->
        <div class="mb-3">
            <label for="user_id" class="form-label">아이디</label>
            <input type="text" class="form-control" id="user_id" name="user_id" placeholder="아이디를 입력하세요">
        </div>
        <!-- 비밀번호 입력 -->
        <div class="mb-3">
            <label for="user_pw" class="form-label">비밀번호</label>
            <input type="password" class="form-control" id="user_pw" name="user_pw" placeholder="비밀번호를 입력하세요">
        </div>
        <!-- 로그인 버튼 -->
        <button type="submit" class="btn btn-primary w-100">로그인</button>
        <!-- 회원가입/비밀번호 찾기 -->
        <div class="text-center mt-3">
            <a href="/register" class="text-decoration-none">회원가입</a> |
            <a href="/forgot-password" class="text-decoration-none">비밀번호 찾기</a>
        </div>
    </form>
</div>

<!-- Bootstrap JS (옵션) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>