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
	    <h2><spring:message code="page.title.ecomm.myshopcart"/></h2>
		  <p>一站式电商网站出租，开网店就是简单</p>
		  <p><a class="btn btn-primary btn-lg" href="contact.do" role="button"><spring:message code="btn.contact"/></a></p>
	  </div>
	</div>
	
	


	<!-- product details -->
	<div class="container">
	
	<form action="do_billing.do" method="post" id="form_checkout">
	
		<div class="col-lg-8">
			<!--
			<div class="panel panel-primary">			   
			  <div class="panel-heading"><b>Billing Address</b></div>
			  
			  <table class="table">
			   	<tr>
			   		<td>
			   			Qian Zhang<br/>
			   			6460 rue sherbrooke ouest Apt #8<br/>
			   			Montreal, QC  H4B 1N2<br/>
			   			Canada
			   		</td>
			   	</tr>
			  </table>			   
			</div>-->
			
			<div class="panel panel-primary">
			  <!-- Default panel contents -->
			  <div class="panel-heading"><b>Billing Information</b></div>
			
			  <!-- Table -->
			  <table class="table">
			   	<tr>
			   		<td>First Name</td>
			   		<td><input type="text" name="bill_fname" id="bill_fname" value="BuyerOne" /></td>
			   		<td>Address</td>
			   		<td><input type="text" name="bill_addr1" id="bill_addr1" value="1 Maire-Victorin" /></td>
			   	</tr>
			   	<tr>
			   		<td>Last Name</td>
			   		<td><input type="text" name="bill_lname" id="bill_lname" value="Athens" /></td>
			   		<td></td>
			   		<td><input type="text" name="bill_addr2" id="bill_addr2" value="" /></td>
			   	</tr>
			   	<tr>
			   		<td>City</td>
			   		<td><input type="text" name="bill_city" id="bill_city" value="Toronto" /></td>
			   		<td>Province/State</td>
			   		<td><input type="text" name="bill_prov" id="bill_prov" value="Ontario" /></td>
			   	</tr>
			   	<tr>
			   		<td>Country</td>
			   		<td><input type="text" name="bill_country" id="bill_country" value="CA" /></td>
			   		<td>Postal Code/Zip Code</td>
			   		<td><input type="text" name="bill_postal" id="bill_postal" value="M5A 1E1" /></td>
			   	</tr>
			  </table>
			</div>
			
			<div class="panel panel-primary">
				<!-- Default panel contents -->
			  <div class="panel-heading"><b>Contact Information</b></div>
			  
				<!-- Table -->
			  <table class="table">
			   	<tr>
			   		<td>Email Address</td>
			   		<td><input type="text" name="bill_email" id="bill_email" value="a@b.com" /></td>
			   		<td>Tel. number</td>
			   		<td><input type="text" name="bill_phone" id="bill_phone" value="5148234567" /></td>
			   	</tr>
			   	<tr>
			   		<td>Company</td>
			   		<td><input type="text" name="bill_company" id="bill_company" value="athensoft" /></td>
			   		<td>Fax</td>
			   		<td><input type="text" name="bill_fax" id="bill_fax" value="5148234568" /></td>
			   	</tr>
			  </table>
			</div>
			
			<div class="panel panel-primary">
			  <!-- Default panel contents -->
			  <div class="panel-heading"><b>Payment Method</b></div>
			
			  <!-- Table -->
			  <table class="table">
			  	<tr>
			   		<td><input type="radio" name="paymentOption" id="pay_method_1" value="PayPal" checked="checked"/>&nbsp;&nbsp;Pay by Paypal</td>
			   	</tr>
			   	<tr>
			   		<td>
			   			<input type="radio" name="paymentOption" id="pay_method_2" value="Credit Card" />&nbsp;&nbsp;Pay by Credit Card<br/>
			   		</td>
			   	</tr>
			   	<tr>
			   		<td>	
			   			<table>
			   				<tr>
			   					<td  colspan="2">
			   						<p>
			   						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						   			<input type="radio" value="Visa" name="paymentOption"/>&nbsp;&nbsp;Visa
						   			<input type="radio" value="MasterCard" name="paymentOption"/>&nbsp;&nbsp;Master Card
						   			<input type="radio" value="Discover" name="paymentOption"/>&nbsp;&nbsp;Discover
						   			<input type="radio" value="AmEx" name="paymentOption"/>&nbsp;&nbsp;American Express
						   			</p>
			   					</td>
			   				</tr>
			   				<tr>
			   					<td>
			   						<p>
			   						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Credit Card Number:
			   						</p>
			   					</td>
			   					<td>
			   						<input type="text" value="" id="creditCardNumber" name="creditCardNumber"/>
			   					</td>
			   				</tr>
			   				<tr>
			   					<td>
			   						<p>
			   						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Expire Date:
			   						</p>
			   					</td>
			   					<td>
			   						<input type="text" value="" id="expDate" name="expDate"/> (MMYYYY)
			   					</td>
			   				</tr>
			   				<tr>
			   					<td>
			   						<p>
			   						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CVV2:
			   						</p>
			   					</td>
			   					<td>
			   						<input type="text" value="" id="cvv2" name="cvv2"/>
			   					</td>
			   				</tr>
			   				</table>
			   		</td>
			   	</tr>
			  </table>
			</div>
			
			
			
						
		</div>
		
		<div class="col-lg-4">
			<div class="panel panel-primary">
				<!-- Default panel contents -->
			  <div class="panel-heading"><b>Order Summary</b></div>
			  
				<!-- Table -->
			  <table class="table">
			  	<tr>
			   		<td><b>Cart Subtotal</b></td>
			   		<td>CDN $119.00</td>
			   	</tr>
			   	<tr>
			   		<td>Shipping Fee/Freight</td>
			   		<td>Free</td>
			   	</tr>
			   	<tr>
			   		<td>Handling Fee</td>
			   		<td>CDN $450.00</td>
			   	</tr>
			   	<tr>
			   		<td>Discount</td>
			   		<td>n/a</td>
			   	</tr>
			   	<tr>
			   		<td><b>Total before tax</b></td>
			   		<td><b>CDN $569.00</b></td>
			   	</tr>
			   	<tr>
			   		<td>Estimated GST/HST</td>
			   		<td>CDN $26.00</td>
			   	</tr>
			   	<tr>
			   		<td>Estimated PST/RST/QST</td>
			   		<td>CDN $51.00</td>
			   	</tr>			   	
			   	<tr>
			   		<td><b><font color="red">Order Total</font></b></td>
			   		<td><b><font color="red">CDN $646.00</font></b></td>
			   	</tr>
			  </table>
			</div>
		</div>
		
		<div>
			<!-- &nbsp;&nbsp;&nbsp;&nbsp;<a class="btn btn-lg btn-success" href="#" role="button">Place your order</a> -->
			&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="btn btn-lg btn-success" name="btn_pay_method_cont" id="btn_pay_method_cont" value="Place your order" onclick="placeOrder();"/>
		
		
		<br/>
		ItemAmount<input type="text" name="itemAmount" id="itemAmount" value="" />
		paymentAmount<input type="text" name="paymentAmount" id="paymentAmount" value="" />
		<input type="text" name="currencyCodeType" id="currencyCodeType" value="CAD" />
		<input type="text" name="ship_method" id="ship_method" value="free_shipping" />
		<input type="text" name="paymentType" id="paymentType" value="Sale" />
		</div>
		</form> <!-- end of form -->
		
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
	</div>



    <!-- Bootstrap core JavaScript  ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="scripts/jquery.min.js"></script>
    <script src="scripts/bootstrap.min.js"></script>
    <script src="scripts/docs.min.js"></script>
    
    <!-- athensoft import -->
    <script type="text/javascript" src="scripts/json/json2.js"></script>
   	<script type="text/javascript" src="scripts/local/payment/pay_checkout.js"></script>
    
    <!-- athensoft local script -->
    <script>
    	$(function(){
    		$("div#navbar li").attr("class","");
    		$("li#ecomm").attr("class","active");
    	});
    </script>
    <!-- athensoft local script -->
    
    
    
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
</body>
</html>