<%@ page contentType="text/html; charset=UTF-8" %>
<meta charset="UTF-8">

<!DOCTYPE html>
<html>
<head>
    <title>로그인</title>
</head>
<body>
    <h2>로그인 페이지</h2>

    <!-- 로그인 실패 시 오류 메시지 표시 -->
    <c:if test="${not empty error}">
        <p style="color:red;">아이디 또는 비밀번호가 잘못되었습니다.</p>
    </c:if>

    <!-- 로그인 폼 -->
    <form action="<c:url value='/login' />" method="post">
        <div>
            <label for="username">아이디:</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div>
            <label for="password">비밀번호:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div>
            <button type="submit">로그인로그인해주세요.!!!!!</button>
            
            
        </div>
        
    </form>
    
</body>
</html>
