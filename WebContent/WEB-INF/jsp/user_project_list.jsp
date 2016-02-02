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
          <h1 class="page-header">My Projects and Services</h1>
		 
		 <!-- project list -->
          <h2 class="sub-header">Projects</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Project ID</th>
                  <th>Project Code/SeqNo</th>
                  <!-- <th>Project Seq No</th>  -->
                  <th>Project Name</th>
                  <th>Project Description</th>
                  <th>Total Duration</th>
                  <th>Total Cost</th>
                  <th>Project Status</th>
                </tr>
              </thead>
              <tbody>
              
              <c:forEach var="projectProfile" items="${projectProfileList}">
               <tr>
                  <td>${projectProfile.projectId}</td>
                  <td>${projectProfile.projectCode}-${projectProfile.projectSeqno}</td>
                  <!-- <td>${projectProfile.projectSeqno}</td>  -->
                  <td>${projectProfile.projectName}</td>
                  <td>${projectProfile.projectDesc}</td>
                  <td>${projectProfile.duration} weeks</td>
                  <td>$${projectProfile.cost}</td>
                  <td>${projectProfile.projectStatusName}</td>
                </tr>
                </c:forEach>
              </tbody>
            </table>
          </div>
          
          <!-- service list -->
          <h2 class="sub-header">Services</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Service ID</th>
                  <th>Ref. Code</th>
                  <th>Service Code</th>
                  <th>Service Name</th>
                  <th>Service Description</th>
                  <th>Start Date</th>
                  <th>End Date</th>
                  <th>Total Cost</th>
                  <th>Service Status</th>
                </tr>
              </thead>
              <tbody>
              <tr>
                  <td>1</td>
                  <td></td>
                  <td>SRV-1-1-3</td>
                  <td>domain name binding</td>
                  <td>one-time</td>
                  <td> - </td>
                  <td> - </td>
                  <td> - </td>
                  <td>Active</td>
               </tr>
               
               <tr>
                  <td>2</td>
                  <td>PRJ001,PRJ002</td>
                  <td>SRV-1-2-2</td>
                  <td>host server renting</td>
                  <td>1 year plan</td>
                  <td>2015-10-01</td>
                  <td>2016-09-30</td>
                  <td> - </td>
                  <td>Active</td>
               </tr>
              </tbody>
            </table>
          </div>
          
          
          <!-- important date -->
          <h2 class="sub-header">Important date of project</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>No.</th>
                  <th>Event</th>
                  <th>Date</th>
                  <th>Rep. of Client</th>
                  <th>Rep. of Athensoft</th>
                </tr>
              </thead>
              <tbody>
              <tr>
                  <td>1</td>
                  <td>First contact</td>
                  <td>2015-10-23</td>
                  <td>Mr. Kenny</td>
                  <td>Athens</td>
               </tr>
               <tr>
                  <td>2</td>
                  <td>Registration</td>
                  <td>2015-10-24</td>
                  <td>Mr. Ivan Cho</td>
                  <td>Athens</td>
               </tr>
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
