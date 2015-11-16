<%@ page contentType="text/html; charset=utf-8" %>
<%@ page pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    
    <link rel="icon" href="content/ico/favicon.ico">

    <title>Athensoft User Center</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="content/css/bootstrap.min.css">

    <!-- Custom styles for this template -->
    <link rel="stylesheet" href="content/css/custom/dashboard.css">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="scripts/temp/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

	<!-- header -->	
	<jsp:include page="../../header_user_inc.jsp"/>	
	<!-- end of header -->
	
    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <!-- nav sidebar -->
          <jsp:include page="../../nav_user_inc.jsp"/>	 
          <!-- end of nav sidebar -->
        </div>
        
        <!-- Dash board  -->
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">My Credits</h1>
          
          <!-- services -->
          <h2 class="sub-header">Summary</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Total Amount</th>
                  <th>Issued Amount</th>
                  <th>Balance Due</th>
                </tr>
              </thead>
              <tbody>
				<tr>
                  <td>$2,000.00</td>
                  <td>$600.00</td>
                  <td>$1,400.00</td>
                </tr>
              </tbody>
            </table>
          </div>
          
          <!-- outstanding credit note -->
          <h2 class="sub-header">Outstanding Credit Notes</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Credit Note No.</th>
                  <th>Reference No.</th>
                  <th>Date Created</th>
                  <th>Amount</th>
                  <th>Date Issued</th>
                  <th>Credit Note Status</th>                  
                </tr>
              </thead>
              <tbody>
              <tr>
             		<td>CRD-001</td>
              		<td>INV-001</td>
              		<td>2015-10-20</td>
              		<td>$600.00</td>
              		<td>2015-10-27</td>   
              		<td>ISSUED</td>           		
              </tr>
              <tr>
             		<td>CRD-002</td>
              		<td>INV-002</td>
              		<td>2015-10-20</td>
              		<td>$700.00</td>
              		<td>2015-10-27</td>   
              		<td>IN PROCESSING</td>           		
              </tr>
              <tr>
             		<td>CRD-003</td>
              		<td>INV-003</td>
              		<td>2015-10-20</td>
              		<td>$700.00</td>
              		<td>2015-10-27</td>   
              		<td>IN PROCESSING</td>           		
              </tr>
 
 <!--               
	             <c:forEach var="item" items="${itemList}">
				<tr>
	                 <td>${item.itemId}</td>
	                 <td>${item.categoryName}</td>
	                 <td>${item.subCategoryName}</td>
	                 <td>${item.itemCode}</td>
	                 <td>${item.itemName}</td>                  
	                 <td>${item.itemStatusName}</td>
	               </tr>
	               </c:forEach> 
-->
              </tbody>
            </table>
          </div>
          <!-- end of outstanding invoices -->          
          
          <!-- history invoices -->
          <h2 class="sub-header">History Credit Notes</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Credit Note No.</th>
                  <th>Reference No.</th>
                  <th>Date Created</th>
                  <th>Amount</th>
                  <th>Date Issued</th>
                  <th>Credit Note Status</th>                  
                </tr>
              </thead>
              <tbody>
              
	             <c:forEach var="item" items="${itemList}">
				<tr>
	                 <td>${item.itemId}</td>
	                 <td>${item.categoryName}</td>
	                 <td>${item.subCategoryName}</td>
	                 <td>${item.itemCode}</td>
	                 <td>${item.itemName}</td>                  
	                 <td>${item.itemStatusName}</td>
	               </tr>
	               </c:forEach>
              </tbody>
            </table>
          </div><!-- end of history invoices -->
                    
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="scripts/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <!-- <script src="../../assets/js/vendor/holder.min.js"></script>  -->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="scripts/temp/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>