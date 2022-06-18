<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
<link rel="stylesheet" href="css/main.css" type="text/css">
<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<style type="text/css">

   /* div {border: 1px solid black;} */
   .MultiCarousel { float: left; overflow: hidden; padding: 15px; width: 100%; position:relative; }
    .MultiCarousel .MultiCarousel-inner { transition: 1s ease all; float: left; }
    .MultiCarousel .MultiCarousel-inner .item { float: left;}
    .MultiCarousel .MultiCarousel-inner .item > div { text-align: center; padding:10px; margin:10px; background:#f1f1f1; color:#666;}
    .MultiCarousel .leftLst, .MultiCarousel .rightLst { position:absolute; border-radius:50%;top:calc(50% - 20px); }
    .MultiCarousel .leftLst { left:0; }
    .MultiCarousel .rightLst { right:0; }
    
    .MultiCarousel .leftLst.over, .MultiCarousel .rightLst.over { pointer-events: none; background:#ccc; }
   
   .newList > div.card 
   {
      display: inline-block;
      /* float: left; */
      margin: 10px;
   }
   
   .lead
   {
      margin-top: 8px; margin-bottom: 8px;
   }
   
   .card
   {
		width: 14rem;
   }
   
   .MultiCarousel .MultiCarousel-inner .item .pad15:hover
   {
   		background-color: #A9D0F5;
   		cursor:pointer;
   }
   .MultiCarousel .MultiCarousel-inner .item .pad15:active
   {
   		background-color: #CEECF5;
   		cursor:pointer;
   }

   
</style>
<script type="text/javascript">

   $(document).ready(function () 
   {
	   
       var itemsMainDiv = ('.MultiCarousel');
       var itemsDiv = ('.MultiCarousel-inner');
       var itemWidth = "";
   
       $('.leftLst, .rightLst').click(function () {
           var condition = $(this).hasClass("leftLst");
           if (condition)
               click(0, this);
           else
               click(1, this)
       });
   
       ResCarouselSize();
   
   
   
   
       $(window).resize(function () {
           ResCarouselSize();
       });
   
       //this function define the size of the items
       function ResCarouselSize() {
           var incno = 0;
           var dataItems = ("data-items");
           var itemClass = ('.item');
           var id = 0;
           var btnParentSb = '';
           var itemsSplit = '';
           var sampwidth = $(itemsMainDiv).width();
           var bodyWidth = $('body').width();
           $(itemsDiv).each(function () {
               id = id + 1;
               var itemNumbers = $(this).find(itemClass).length;
               btnParentSb = $(this).parent().attr(dataItems);
               itemsSplit = btnParentSb.split(',');
               $(this).parent().attr("id", "MultiCarousel" + id);
   
   
               if (bodyWidth >= 1200) {
                   incno = itemsSplit[3];
                   itemWidth = sampwidth / incno;
               }
               else if (bodyWidth >= 992) {
                   incno = itemsSplit[2];
                   itemWidth = sampwidth / incno;
               }
               else if (bodyWidth >= 768) {
                   incno = itemsSplit[1];
                   itemWidth = sampwidth / incno;
               }
               else {
                   incno = itemsSplit[0];
                   itemWidth = sampwidth / incno;
               }
               $(this).css({ 'transform': 'translateX(0px)', 'width': itemWidth * itemNumbers });
               $(this).find(itemClass).each(function () {
                   $(this).outerWidth(itemWidth);
               });
   
               $(".leftLst").addClass("over");
               $(".rightLst").removeClass("over");
   
           });
       }
   
   
       //this function used to move the items
       function ResCarousel(e, el, s) {
           var leftBtn = ('.leftLst');
           var rightBtn = ('.rightLst');
           var translateXval = '';
           var divStyle = $(el + ' ' + itemsDiv).css('transform');
           var values = divStyle.match(/-?[\d\.]+/g);
           var xds = Math.abs(values[4]);
           if (e == 0) {
               translateXval = parseInt(xds) - parseInt(itemWidth * s);
               $(el + ' ' + rightBtn).removeClass("over");
   
               if (translateXval <= itemWidth / 2) {
                   translateXval = 0;
                   $(el + ' ' + leftBtn).addClass("over");
               }
           }
           else if (e == 1) {
               var itemsCondition = $(el).find(itemsDiv).width() - $(el).width();
               translateXval = parseInt(xds) + parseInt(itemWidth * s);
               $(el + ' ' + leftBtn).removeClass("over");
   
               if (translateXval >= itemsCondition - itemWidth / 2) {
                   translateXval = itemsCondition;
                   $(el + ' ' + rightBtn).addClass("over");
               }
           }
           $(el + ' ' + itemsDiv).css('transform', 'translateX(' + -translateXval + 'px)');
       }
   
       //It is used to get some elements from btn
       function click(ell, ee) {
           var Parent = "#" + $(ee).parent().attr("id");
           var slide = $(Parent).attr("data-slide");
           ResCarousel(ell, Parent, slide);
       }

      });

</script>
<script type="text/javascript">


   $(document).ready(function()
   {
      $(".hover").hover(function()                
      {                                         
         //alert("테스트");                       
                                               
         $(this).removeClass("btn-secondary"); 
         $(this).addClass("btn-primary");      
      }, function()                             
      {                                         
         $(this).removeClass("btn-primary");   
         $(this).addClass("btn-secondary");    
      });
      
      
      $(".item").click(function()
	  {
			//alert("카테고리선택");
			//alert($(this).children(".cateItem").val());
								
			location.href = "categorySelect.action?categoryName=" + $(this).children(".cateItem").val();
	  });
    		    
  
   })
	
   function needSignUp()
   {
		alert("로그인이 필요한 서비스입니다. 로그인후 이용해 주세요");
		
		return;
   }
   



</script>


</head>
<body>
<%
	String u_id = (String)session.getAttribute("u_id");
	
	if(u_id != null)
	{	
%>
		<div class="header">
			<c:import url="/WEB-INF/view/user/main/comfit_header_user.jsp"></c:import>
		</div>
<%	}
	else
	{
%>
	<div>
   		<c:import url="/WEB-INF/view/user/main/comfit_header_nolog.jsp"></c:import>
	</div>
<%	} %>	

<!-- 220610 추가한 부분 지워도 됩니다! 큼직하게 이미지 넣는게 밀도있을 것 같아보여서 추가했어요 -->
<section>
  <div style="">
  	<img src="images/comfit_main.jpg" alt=""  style="background-size: cover; width: 100%; height: 500px;" />
      <!-- <h1 class="display-4 fw-normal">COMFIT 나에게 딱맞는 컴퓨터</h1>
      <p class="lead fw-normal">The best choice, fast deal, trustless trust, no stress. <br />this is comfit</p>
      <a class="btn btn-outline-secondary" href="#">Coming soon</a> -->
  </div>
</section>  
<!-- 220610 추가한 부분 -->  

<!-- 카테고리 -->
<div class="container">
   <div class="row">
      <div class="MultiCarousel" data-items="1,3,5,6" data-slide="1" id="MultiCarousel"  data-interval="1000">
            <div class="MultiCarousel-inner">
            	<c:forEach var="category" items="${cateList }">
            		<div class="item" >
            			<input class="cateItem" type="hidden" value="${category.category_name }"/>
                    	<div class="pad15 shadow rounded" style="align-items: center;">
                       	 <p class="lead" style="font-size: large; margin-top: 8px; margin-bottom: 8px;">${category.category_name }</p>
                   		</div>
                   	</div>
            	</c:forEach>
            </div>
            <button class="btn btn-primary leftLst"> <i class="bi bi-arrow-left"></i> </button>
            <button class="btn btn-primary rightLst"> <i class="bi bi-arrow-right"></i> </button>
        </div>
   </div>
   <br />
   
   <hr />
   
   <br />
   
   <div class="row">
       
      <!-- 최근 등록 상품 -->
      <div style="font-size: 20pt; font-weight:bold; display: inline-block; width: 1100px;">
         최근 등록 상품
      </div>
         
      
      <br /><br />
   
   
       <div class="col-md-12 text-center">
   
         <div class="newList">
            <c:forEach var="product" items="${pdList }" begin="1" end="15">
         	   <div class="card">
            	   <!-- <img src="images/ssd.jpg" class="card-img-top"> -->
            	   <img alt="" src="images/${product.pd_photo }"
						class="card-img-top" style="width: 220px; height: 140px;">
            	   
              	 <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">${product.pd_title }</h5>
                  <p class="card-text"  style="text-align: center;">${product.price }</p>
                  <%-- <a href="pd_detail.action?pd_id=${product.pd_id }" class="btn btn-secondary hover" style="margin: auto; display: block;">상세페이지</a> --%>
                  <button type="button" class="btn btn-secondary hover"
                   style="margin: auto; display: block;" onclick="needSignUp()">상세페이지</button>
               	</div>
            </div>		
         	</c:forEach>
         </div>	<!-- close.newList -->
         <br />   
      </div><!-- close.col-md-12 text-center -->
      <hr />
      <br />   
      <!-- 인기 상품 -->
      <div style="font-size: 20pt; font-weight:bold; display: inline-block; width: 1100px;">
         인기 상품
      </div>
         
      <br /><br />
      
      
      <div class="col-md-12 text-center">
   
         <div class="newList">
            <div class="card">
               <img src="images/ssd.jpg" class="card-img-top">
               <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">SSD</h5>
                  <p class="card-text"  style="text-align: center;">120,000</p>
                  <a href="#" class="btn btn-secondary hover" style="margin: auto; display: block;">상세페이지</a>
               </div>
            </div>
            <div class="card">
               <img src="images/ssd.jpg" class="card-img-top">
               <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">SSD</h5>
                  <p class="card-text"  style="text-align: center;">120,000</p>
                  <a href="#" class="btn btn-secondary hover" style="margin: auto; display: block;">상세페이지</a>
               </div>
            </div>
            <div class="card">
               <img src="images/ssd.jpg" class="card-img-top">
               <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">SSD</h5>
                  <p class="card-text"  style="text-align: center;">120,000</p>
                  <a href="#" class="btn btn-secondary hover" style="margin: auto; display: block;">상세페이지</a>
               </div>
            </div>
            <div class="card">
               <img src="images/ssd.jpg" class="card-img-top">
               <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">SSD</h5>
                  <p class="card-text"  style="text-align: center;">120,000</p>
                  <a href="#" class="btn btn-secondary" style="margin: auto; display: block;">상세페이지</a>
               </div>
            </div>
            <div class="card">
               <img src="images/ssd.jpg" class="card-img-top">
               <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">SSD</h5>
                  <p class="card-text"  style="text-align: center;">120,000</p>
                  <a href="#" class="btn btn-secondary" style="margin: auto; display: block;">상세페이지</a>
               </div>
            </div>
            <div class="card">
               <img src="images/ssd.jpg" class="card-img-top">
               <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">SSD</h5>
                  <p class="card-text"  style="text-align: center;">120,000</p>
                  <a href="#" class="btn btn-secondary hover" style="margin: auto; display: block;">상세페이지</a>
               </div>
            </div>
            <div class="card">
               <img src="images/ssd.jpg" class="card-img-top">
               <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">SSD</h5>
                  <p class="card-text"  style="text-align: center;">120,000</p>
                  <a href="#" class="btn btn-secondary hover" style="margin: auto; display: block;">상세페이지</a>
               </div>
            </div>
            <div class="card">
               <img src="images/ssd.jpg" class="card-img-top">
               <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">SSD</h5>
                  <p class="card-text"  style="text-align: center;">120,000</p>
                  <a href="#" class="btn btn-secondary hover" style="margin: auto; display: block;">상세페이지</a>
               </div>
            </div>
            <div class="card">
               <img src="images/ssd.jpg" class="card-img-top">
               <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">SSD</h5>
                  <p class="card-text"  style="text-align: center;">120,000</p>
                  <a href="#" class="btn btn-secondary hover" style="margin: auto; display: block;">상세페이지</a>
               </div>
            </div>
            <div class="card">
               <img src="images/ssd.jpg" class="card-img-top">
               <div class="card-body">
                  <h5 class="card-title" style="text-align: center;">SSD</h5>
                  <p class="card-text"  style="text-align: center;">120,000</p>
                  <a href="#" class="btn btn-secondary hover" style="margin: auto; display: block;">상세페이지</a>
               </div>
            </div>
           
            
            
         </div>
                        
      </div>
         
   </div>           
</div>

            

<div>
   <c:import url="/WEB-INF/view/user/main/footer.jsp"></c:import>
</div>






</body>
</html>