<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
   request.setCharacterEncoding("UTF-8");
   String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>휴대폰 번호 수정</title>
<link rel="stylesheet" type="text/css" href="<%=cp%>/css/main.css">
<style type="text/css">

	.subheader
	{
		font-size: 25pt;
		font-weight: bold;
		margin-left: 15%;
		margin-top:5%;
	}
	.subheader_header
	{
		font-size: 20pt;
		font-weight: bold;
		margin-left: 25%;
	}
	.tablebts
	{
		margin-top:5%;
		margin-left: 38%;
    	width: 40%;
    	font-weight: bold;
  	}
  	.hi
  	{
  		border-radius:5px;
  		margin-left:-20%;
  		width:80%;
  	}
</style>
</head>
<body>
<div>
		<!--Header  -->
		<div class="header">
	      <c:import url="comfit_header.jsp"></c:import>
	   	</div>
	   	
	   	<div>
	   		<p class="subheader">마이페이지</p>
	   		<p class="subheader_header">회원정보</p>
	   	</div>
	   	<table class="tablebts">
	   		<tr>
	   			<td>기존 휴대폰 번호</td><td><input type="text" class="hi" placeholder="010-1111-1111" /></td>
	   		</tr>
	   		<tr>
	   			<td>수정할 휴대폰 번호</td><td><input type="text" class="hi" placeholder="'-' 빼고 입력 (예. 01022223333)" /></td>
	   		</tr>
	   		<tr>
	   			<td><button type="button" class="btn btn-primary btn-sm"id="btn" style="margin-left:50%; margin-top:5%; width:80%;">확인</button></td>
	   		</tr>
	   	</table>
</div>

</body>
</html>