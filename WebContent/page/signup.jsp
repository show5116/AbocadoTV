<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/jquery-ui.min.css">
    <link rel="stylesheet" href="../css/signup.css">
    <title>Document</title>
</head>
<body>
    <div class="body__container">
        <form class="signup-form">
            <ul>
                <li>
                    <div class="term">
                        <label><input type="checkbox">약관 전체 동의</label>
                        <label><input type="checkbox">이용 약관 동의(필수)</label>
                        <label><input type="checkbox">개인 정보 수집/이용 동의(필수)</label>
                        <label><input type="checkbox">위치 정보 동의(선택)</label>
                        <button type="button" class="term-next">다음</button>
                    </div>
                </li>
                <li class="hidden">
                    <div class="signup-form-input">
                        <h1>계정 만들기</h1>	
                        <div>
                            <span>이미 계정이 있으십니까?</span>
                            <a href="">로그인</a>
                        </div>
                        <div class="mail">
                            <div class="relative">
                                <input id="mail" class="form-text" type="text" name="mail"
                                required maxlength="30">
                                <label for="mail" class="text-label">메일</label>
                                <img src="../img/check.jpg" class="hidden">
                            </div>
                        </div>
                        <div class="name">
                            <div class="firstname relative">
                                <input id="firstname" class="form-text" type="text" name="firstname"
                                required maxlength="10">
                                <label for="firstname" class="text-label">성</label>
                                <img src="../img/check.jpg" class="hidden">
                            </div>
                            <div class="lastname relative">
                                <input id="lastname" class="form-text" type="text" name="lastname"
                                required maxlength="15">
                                <label for="lastname" class="text-label">이름</label>
                                <img src="../img/check.jpg" class="hidden">
                            </div>
                        </div>
                        <div class="pass"> 
                            <div class="relative">
                                <input id="password-text" class="form-text" type="password" name="password"
                                required maxlength="20">
                                <label for="password-text" class="text-label">Password</label>
                                <img src="../img/passwordNoSee.jpg" class="password-see">
                                <img src="../img/check.jpg" style="right:55px" class="hidden password-success">
                            </div>
                        </div>
                        <div class="pass-check hidden">
                            <ul>
                                <li><img src="../img/state.jpg" class="first-check"> 최소 8개 이상의 문자 포함</li>
                                <li><img src="../img/state.jpg" class="second-check"> 소문자(a-z)와 대문자(A-Z) 모두 포함</li>
                                <li><img src="../img/state.jpg" class="last-check"> 하나 이상의 숫자(0-9) 또는 기호 포함</li>
                            </ul>
                        </div>
                        <div class="resident">
                            <div class="birth relative">
                                <input id="birth" class="form-text" type="text" name="birth"
                                required maxlength="6">
                                <label for="birth" class="text-label">주민번호 앞 6자리</label>
                                <img src="../img/check.jpg" class="hidden">
                            </div>
                            <div class="gender relative">
                                <input id="gender" class="form-text" type="text" name="gender"
                                required maxlength="1">
                                <label for="gender" class="text-label">주민번호 뒤 1자리</label>
                                <img src="../img/check.jpg" class="hidden">
                            </div>
                        </div>
                        <div class="nickname">
                            <div class="relative">
                                <input id="nickname-text" class="form-text" type="text" name="nickname"
                                required maxlength="20">
                                <label for="nickname-text" class="text-label">닉네임</label>
                                <img src="../img/check.jpg" class="hidden">
                            </div>
                        </div>
                        <button class="next-btn" type="button" value="다음"></button>
                    </div>
                </li>
                <li class="hidden">
                    <div class="mailcheck">
                        <div>
                            <span>avocadoTV계정을 인증하세요.</span><br>
                            <span class="current-mail"></span><br>
                            <span>위 메일로 전송된 코드를 입력하시오.</span><br>
                        </div>
                        <div>
                            <input id="certification" class="form-text" type="text"
                            required maxlength="6">
                            <label for="certification" class="text-label">인증번호 6자리</label>
                        </div>
                        <div>
                            <span class="timer">5:00</span>
                            <button type="button" class="submit-btn">제출</button>
                        </div>
                        <div>
                            <button type="button" class="re-send-btn">인증메일 재전송</button>
                        </div>
                    </div>
                </li>
            </ul>
            <div>
                <img src="../img/logo.jpg" style="top: 100px;">
            </div>
        </form>
    </div>
    <script src="../js/jquery-3.6.0.min.js"></script>
    <script src="../js/jquery-ui.min.js"></script>
    <script src="../js/signup.js"></script>
</body>
</html>