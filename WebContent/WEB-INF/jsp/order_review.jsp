<%@ page contentType="text/html; charset=utf-8" %>
<%@ page language="java"%>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>

<!--[if lt IE 7]> <html class="no-js ie6 oldie" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js ie7 oldie" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js ie8 oldie" lang="en"> <![endif]-->
<!--[if gt IE 8]><!-->
 
<html class="no-js" lang="en"> <!--<![endif]-->
<head>
   	<meta charset="utf-8" />
   	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
   
   <!-- Always force latest IE rendering engine (even in intranet) & Chrome Frame -->
   <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
   
   <!-- Mobile viewport optimized: h5bp.com/viewport -->
   <meta name="viewport" content="width=device-width">

   <title>Athensoft Studio</title>

   <meta name="robots" content="index, nofollow">
   <meta name="description" content="" />
   <meta name="keywords" content="" />
   <meta name="author" content="Athensoft"/>
   
   <!-- remove or comment this line if you want to use the local fonts -->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700' rel='stylesheet' type='text/css'>

   <link rel="stylesheet" type="text/css" href="content/css/bootstrap.css">
   <link rel="stylesheet" type="text/css" href="content/css/bootstrap-responsive.css">
   <link rel="stylesheet" type="text/css" href="content/css/bootmetro.css">
   <link rel="stylesheet" type="text/css" href="content/css/bootmetro-tiles.css">
   <link rel="stylesheet" type="text/css" href="content/css/bootmetro-charms.css">
   <link rel="stylesheet" type="text/css" href="content/css/metro-ui-light.css">
   <link rel="stylesheet" type="text/css" href="content/css/icomoon.css">

   <!--  these two css are to use only for documentation -->
   <link rel="stylesheet" type="text/css" href="content/css/demo.css">
   <link rel="stylesheet" type="text/css" href="scripts/google-code-prettify/prettify.css">
   
   <link rel="stylesheet" type="text/css" href="content/slider-nav/extent/extent.css">
	<!-- local style -->
	<link rel="stylesheet" type="text/css" href="style/local/item.css">


   <!-- Le fav and touch icons -->
   <link rel="shortcut icon" href="content/ico/favicon.ico">
   <link rel="apple-touch-icon-precomposed" sizes="144x144" href="content/ico/apple-touch-icon-144-precomposed.png">
   <link rel="apple-touch-icon-precomposed" sizes="114x114" href="content/ico/apple-touch-icon-114-precomposed.png">
   <link rel="apple-touch-icon-precomposed" sizes="72x72" href="content/ico/apple-touch-icon-72-precomposed.png">
   <link rel="apple-touch-icon-precomposed" href="content/ico/apple-touch-icon-57-precomposed.png">
  
   <!-- All JavaScript at the bottom, except for Modernizr and Respond.
      Modernizr enables HTML5 elements & feature detects; Respond is a polyfill for min/max-width CSS3 Media Queries
      For optimal performance, use a custom Modernizr build: www.modernizr.com/download/ -->
   <script src="scripts/bootmetro/modernizr-2.6.1.min.js"></script>
   
   
</head>


<body>

	<!-- 01. Navigation bar -->
	<jsp:include page="../../nav_inc.jsp"></jsp:include>
	<!-- 01. End of Navigation bar -->

	<!-- error.jsp Content-404 -->
	<div class="hero-unit">
	     <h2>cPanel - Shopping cart</h2>
	     <p>View cart</p>
	     <p>
	       <a class="btn btn-primary btn-large" href="index.jsp">
	         Back to home
	       </a>
	     </p>
	</div>
	<!-- End of error.jsp Content-404 -->


	<!-- content -->
	<div class="container-fluid">
		<div class="row-fluid">		
			
			<!-- view section -->
			<div class="span12">			
				
			
			
			<label>Payment_Amount : ${Payment_Amount} </label><br/>
			<label>TOKEN :${TOKEN} </label><br/>
			<label>currencyCodeType : ${currencyCodeType} </label><br/>
			<label>paymentType : ${paymentType} </label><br/>
			<label>PAYERID : ${PAYERID} </label><br/>
			<label>requestScope.serverName : ${requestScope.serverName} <br/>


			<a href="do_confirm.do" class="primary btn">Confirm</a>				
				
			</div>
			<!-- end of view section -->		
			
					
			</div>
		</div>
	<!-- end of content -->

	
	
	<!-- 04. Footer -->
	<jsp:include page="../../footer_inc.jsp"></jsp:include>
	<!-- 04. End of Footer -->


	<!-- Scripts -->
	<!-- Grab Google CDN's jQuery. fall back to local if necessary -->
	<!-- 
   	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
   	 -->
   	<script type="text/javascript" src="scripts/google-code-prettify/prettify.js"></script>
   	<script type="text/javascript" src="scripts/jquery/jquery-1.8.2.min.js"></script>   	
   	<script type="text/javascript" src="scripts/jquery/jquery.mousewheel.js"></script>
   	<script type="text/javascript" src="scripts/jquery/jquery.scrollTo.js"></script>
   	<script type="text/javascript" src="scripts/bootmetro/bootstrap.min.js"></script>
   	<script type="text/javascript" src="scripts/bootmetro/bootmetro.js"></script>
   	<script type="text/javascript" src="scripts/bootmetro/bootmetro-charms.js"></script>
   	<script type="text/javascript" src="scripts/bootmetro/demo.js"></script>
   	<script type="text/javascript" src="scripts/bootmetro/holder.js"></script>
   	<script type="text/javascript" src="scripts/json/json2.js"></script>
   	<script type="text/javascript">
   	</script>
   	
	<!-- local script of uploading -->
	  	
   	<!-- End of Scripts -->
   	
   	
</body>
</html>