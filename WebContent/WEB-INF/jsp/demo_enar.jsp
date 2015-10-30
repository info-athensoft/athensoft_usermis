<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>

<html>

<!-- i18n -->
<c:set var="loc" value="zh_CN"/>
<c:if test="${!(empty param.locale)}">
  <c:set var="loc" value="${param.locale}"/>
</c:if>
<fmt:setLocale value="${loc}" />
<!-- ENDS i18n -->

<!-- live demo urls -->
<c:set var="url_server" value="http://localhost:8080"/>
<c:set var="url_server" value="http://www.athensoft.com"/> 
<c:set var="url_app" value="/demo_enar/"/>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title>Informatique Athensoft</title>
    
    <!-- Company Logo Icon -->
    <link rel="icon" href="content/ico/favicon.ico">    

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="content/css/bootstrap.min.css">
    <link rel="stylesheet" href="content/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="content/css/docs.min.css">

    <!-- Custom styles for this template -->
    <link rel="stylesheet" href="content/css/custom/carousel.css">
    <link rel="stylesheet" href="content/css/custom/athensoft.css">
    
    <!-- Font -->
     
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>
    
    <!--
    <link href="content/font/opensans-light-webfront.woff" rel='stylesheet' type='text/css'>
    <link href="content/font/opensans-light-webfront.ttf" rel='stylesheet' type='text/css'>
    <link href="content/font/opensans-light-webfront.svg" rel='stylesheet' type='text/css'>
     -->
     
    <!-- local css in page scope -->
    <style>    		
	.marketing > p{
		text-align:center;
	}
    </style>
  </head>
  

  <body>
  	<!-- NAVBAR ================================================== -->
 	 <!-- Nav -->
	  <jsp:include page="../../nav_inc.jsp"></jsp:include>	
	  <!-- End of Nav -->

    <!-- Carousel ================================================== -->
	<div class="jumbotron">
	  <div class="container">
	    <h2><spring:message code="page.title.demo"/></h2>
		  <p>多种行业、个人到企业、简单到复杂，总有一款网站适合您</p>
		  <p><a class="btn btn-primary btn-lg" href="contact.do" role="button"><spring:message code="btn.contact"/></a></p>
	  </div>
	</div>

	
	 <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">
      <!-- Three columns of text below the carousel -->
      <div class="row">
      	<div class="col-lg-4">
        <a href="${url_server}${url_app}index-corporate.jsp" target="_blank">
          <img class="img-responsive" src="content/img/demo/1/1.jpg" alt="Generic placeholder image">
          </a>
          <h4><a href="${url_server}${url_app}index-corporate.jsp" target="_blank">Corporate 1</a></h4>
        </div><!-- /.col-lg-4 -->
        
        <div class="col-lg-4">
        <a href="${url_server}${url_app}index-corporate-1.jsp" target="_blank">
          <img class="img-responsive" src="content/img/demo/1/2.jpg" alt="Generic placeholder image">
        </a>
          <h4><a href="${url_server}${url_app}index-corporate-1.jsp">Corporate 2</a></h4>
        </div><!-- /.col-lg-4 -->
        
        <div class="col-lg-4">
         <a href="${url_server}${url_app}index-corporate-2.jsp" target="_blank">
          <img class="img-responsive" src="content/img/demo/1/3.jpg" alt="Generic placeholder image">
         </a>
          <h4><a href="${url_server}${url_app}index-corporate-2.jsp">Corporate 3</a></h4>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->   
		
		<div  class="row">
			<div class="col-lg-4">
	         <a href="${url_server}${url_app}index-corporate-3.jsp" target="_blank">
	          <img class="img-responsive" src="content/img/demo/1/4.jpg" alt="Generic placeholder image">
	         </a>
	          <h4><a href="${url_server}${url_app}index-corporate-3.jsp">Corporate 4</a></h4>
	        </div><!-- /.col-lg-4 -->
		
		<div class="col-lg-4">
         <a href="${url_server}${url_app}index-corporate-4.jsp" target="_blank">
          <img class="img-responsive" src="content/img/demo/1/5.jpg" alt="Generic placeholder image">
         </a>
          <h4><a href="${url_server}${url_app}index-corporate-4.jsp">Corporate 5</a></h4>
        </div><!-- /.col-lg-4 -->
        
		</div>
		
		
     </div>
	
	

	<div class="container">     
	 <hr class="athensoft-divider2">

	  <!-- Bottom -->
	  <jsp:include page="../../bottom_inc.jsp"></jsp:include>	
	  <!-- End of Bottom -->

	  <hr class="athensoft-divider">

      <!-- FOOTER -->
      <jsp:include page="../../footer_inc.jsp"></jsp:include>
	  <!-- FOOTER -->
	  
	  
    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript  ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="scripts/jquery.min.js"></script>
    <script src="scripts/bootstrap.min.js"></script>
    <script src="scripts/docs.min.js"></script>
    
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="scripts/ie10-viewport-bug-workaround.js"></script>
  
  	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
     <script>
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  	  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  	  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  	  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');
  	
  	  ga('create', 'UA-61828003-1', 'auto');
  	  ga('send', 'pageview');
    </script>
    
    <!-- athensoft local script -->
    <script>
    	$(function(){
    		$("div#navbar li").attr("class","");
    		$("li#demo").attr("class","active");
    	});
    </script>
    <!-- athensoft local script -->
 
</body>
</html>