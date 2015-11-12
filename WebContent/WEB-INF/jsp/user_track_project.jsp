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
          <h1 class="page-header">My Projects</h1>
          <h2 class="sub-header">Tracking current projects</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Project ID</th>
                  <th>Project Name</th>
                  <th>Customer ID</th>
                  <th>Escaped Time</th>
                  <th>Project Status</th>
                </tr>
              </thead>
              <tbody>
               <tr>
                  <td>1</td>
                  <td>chatime</td>
                  <td>1</td>
                  <td>10 days</td>
                  <td>In Process</td>
                </tr>
<!-- 
              <c:forEach var="address" items="${shipAddressList}">
               <tr>
                  <td>${address.addressId}</td>
                  <td>${address.streeNum}</td>
                  <td>${address.streeName}</td>
                  <td>${address.roomType}</td>
                  <td>${address.roomNum}</td>
                  <td>${address.cityCode}</td>
                  <td>${address.provinceCode}</td>
                  <td>${address.postalCode}</td>
                  <td>${address.countryCode}</td>
                </tr>
                </c:forEach>
 -->
              </tbody>
            </table>
            
                        
            
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Project Phase</th>
                  <th>Tasks</th>                  
                  <th>Status</th>
                  <th>Activity-Athensoft</th>
                  <th>Activity-Client</th>
                  <th>Activity-Broker</th>
                </tr>
              </thead>
              
              <tbody>
          		<c:forEach var="phase" items="${project.phaseList}">      
                 <tr>
                  <td>${phase.phaseId} : ${phase.phaseName}</td>
                  <td>Task 1-1</td>
                  <td>Waiting</td>
                  <!-- inner table athensoft-activity -->
                  <td>                  		
                  		 <table>			              
			              <tbody>
			               <tr>
			                  <td>act-11</td>
			                  <td>in processing</td>
			                </tr>
			                <tr>
			                  <td>act-12</td>
			                  <td>waiting</td>
			                </tr>
			                <tr>
			                  <td>act-12</td>
			                  <td>to do</td>
			                </tr>			
			              </tbody>
			            </table>                  
                  </td>
                  
                  <!-- inner table client-activity -->
                  <td>                  		
                  		 <table>			              
			              <tbody>
			               <tr>
			                  <td>act-21</td>
			                  <td>in processing</td>
			                </tr>
			                <tr>
			                  <td>act-22</td>
			                  <td>waiting</td>
			                </tr>
			              </tbody>
			            </table>                  
                  </td>
                  
                  <!-- inner table broker-activity -->
                  <td>                  		
                  		 <table>			              
			              <tbody>
			               <tr>
			                  <td>act-31</td>
			                  <td>in processing</td>
			                </tr>
			              </tbody>
			            </table>                  
                  </td>
                </tr>
			</c:forEach>
			
              </tbody>
            </table>
            
            
          </div>
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
