<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert title here</title>
    <style>
        p {
            margin: 5px 0;
        }
    </style>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<form action="register.do" method="post">
    <p>이름</p>
    <input type="text" id="name" name="name">
    <p>아이디</p>
    <input type="text" id="id" name="id">
    <p>닉네임</p>
    <input type="text" id="nickname" name="nickname">
    <p>비밀번호</p>
    <input type="password" id="password" name="password">
    <p>비밀번호 재확인</p>
    <input type="password" id="cPassword" name="cPassword">
    <p>이메일</p>
    <input type="email" id="email" name="email">
    <p>주소</p>
    <input type="text" id="postcode" name="postcode" placeholder="우편번호">
    <input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br>
    <input type="text" id="roadAddress" name="roadAddress" placeholder="도로명주소">
    <input type="text" id="jibunAddress" name="jibunAddress" placeholder="지번주소">
    <span id="guide" style="color:#999;display:none"></span>
    <input type="text" id="detailAddress" name="detailAddress" placeholder="상세주소">
    <input type="text" id="extraAddress" name="extraAddress" placeholder="참고항목">

    <p>생년월일</p>
    <input type="number" id="year" name="year">
    <select id="month" name="month">
        <c:forEach var="m" begin="1" end="12">
            <option value="${m}">${m}</option>
        </c:forEach>
    </select>
    <input type="number" id="date" name="date">
    <p>전화번호</p>
    <input type="number" id="phone" name="phone">
    <p>성별구분</p>
    <input type="radio" id="male" name="sex" value="m"><label for="male">남</label>
    <input type="radio" id="female" name="sex" value="f"><label for="female">여</label>
    <br><br>
    <input type="submit" onclick="checkPassword()" value="회원가입">
    <input type="button" onclick="clickCancelBtn()" value="취소">
</form>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript">
    function clickCancelBtn() {
        history.back();
    }

    function checkPassword() {
        const pwd1 = document.getElementById('password').value;
        const pwd2 = document.getElementById('cPassword').value;

        if (pwd1 !== pwd2) {
            alert('비밀번호가 일치하지 않습니다.');
            location.href = "./register.jsp";
            return false;
        } else {
            return true;
        }
    }

    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('postcode').value = data.zonecode;
                document.getElementById("roadAddress").value = roadAddr;
                document.getElementById("jibunAddress").value = data.jibunAddress;

                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }
</script>
</body>
</html>