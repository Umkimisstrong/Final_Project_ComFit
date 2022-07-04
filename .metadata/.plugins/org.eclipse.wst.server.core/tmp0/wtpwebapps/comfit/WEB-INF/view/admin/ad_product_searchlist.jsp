<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 기기별 크기 담당 -->
<meta name="viewport" content="width=device-width", initial-scale="1">
<title>bbs.jsp</title>
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<script type="text/javascript">

	$(document).ready(function()
	{
		//alert("테스트");
		
		$("#searchBtn").click(function()
		{
			
			// 카테고리 설정 안하고 검색했을때 걸러내기
			if ($(".listselect").val() == "카테고리")
			{
				alert("검색 카테고리를 설정해 주세요.");
				return;
			}
			
			alert($(".listselect").val());
			alert($("#searchvalue").val());
			
			$(location).attr("href", "/comfit/admin_product_searchlist.action?listselect="+$("#listselect").val()+"&searchvalue="+$("#searchvalue").val());
			
		});		
	});
	
	// 상세주소 분기... 성공했다
	$(document).ready(function()
	{
		$(".Btntitle").click(function()
		{
			// 아이디값 가져오기
			var id_check = $(this).attr("id");
			
			// 아이디값 체크
			alert(id_check);
			
			// 분기 			
			if (id_check=='deli')
			{
				location.href="admin_product_list_delivery.action?pd_num=" + $(this).val();
			}
			else {
				location.href="admin_product_list_direct.action?pd_num=" + $(this).val();
			}
		})
	})		

</script>
</head>
<body>

<c:import url="ad_Header.jsp"></c:import>

<div class="container">
	<div class="row">
	<div style="margin-bottom: 20px"><h1><b>관리자모드_상품관리</b></h1></div> 
		<table class="table table-bordered" style="text-align: center; border: 1px solid #dddddd">
			<thead><!-- 제목 -->
				<tr><!-- 1행 -->
					<th style="text-align: center;">카테고리</th>
					<th style="text-align: center;">등록일자</th>
					<th style="text-align: center;">판매자ID</th>
					<th style="text-align: center;">거래 아이디</th>					
					<th style="text-align: center;">pd_num</th>					
					<th style="text-align: center;">제목</th>
					<th style="text-align: center;">거래방식</th>
					<th style="text-align: center;">상태</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${productlist}">					
				<tr>
					<td>${product.category_name}</td>
					<td>${product.pd_regit_date}</td>
					<td>${product.u_id}</td>					
					<td class="${product.pd_id}" id="${product.pd_num }" >${product.pd_id}</td>					
					<td>${product.pd_num}</td>					
					<td><button type="submit" value="${product.pd_num }" id="${product.pd_id}" class="btn btn-outline-secondary Btntitle">
					${product.pd_title}</button></td>
					<td>${product.deal_type}</td>
					<td>${product.deal_status}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>

 
		<div style="text-align: right;">
		
		<div class="justify-content-end">
			<input type="checkbox" name="xxx" value="yyy" checked>블라인드 처리된 게시글만 보기
		</div>
		<div class="btn-group" style="width: 30%; text-align: right;">
			<select class="form-select listselect" id="listselect" style="width: 40%; display: inline-block;">
			    <option selected>카테고리</option>
			    <option value="1">상품 카테고리</option>
			    <option value="2">판매자ID</option>
			    <option value="2">제목</option>
			</select> 
        <div class="input-group" style="width:100%; text-align: right;">
           <input type="text" class="form-control" id="searchvalue" placeholder="검색어를 입력하세요">
            <button id="searchBtn" type="button" class="btn btn-outline-primary">
          <i class="bi bi-search"></i>
            </button>                          
		</div>
		</div>
		
		</div>


	</div>
</div>


</body>
</html>