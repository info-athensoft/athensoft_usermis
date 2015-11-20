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
          <h1 class="page-header">Post project requirements</h1>



          <h2 class="sub-header">Project Information</h2>
		  <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <!-- <th>Project ID</th>  -->
                  <th>Project Code</th>
                  <th>Project Name</th>
                  <th>Status</th>
                </tr>
              </thead>
              <tbody>
              
              <tr>
	             <!--  <td></td>  -->
	              <td>WS-CHATIME</td>
	              <td>Chatime website 1.0.0</td>
	              <td>IN PROCESSING</td>
              </tr>
              
              </tbody>
            </table>
          </div>

          <!-- form -->
          <div class="row">
          <div class="col-lg-4">			      
				<input type="hidden" class="form-control" name="c_projectId" id="c_projectId" value="1">
				

				<label for="c_reqType1">Request Type1</label>
				<select id="c_reqType1" class="form-control">
				  <option value="1" checked="checked">Functional</option>
				  <option value="2">Non-functional</option>
				</select><br/>
				
				<label for="c_reqType2">Request Type2</label>
				<select id="c_reqType2" class="form-control">
				  <option value="1" checked="checked">Front-End</option>
				  <option value="2">Back-End</option>
				  <option value="3">System</option>
				</select><br/>
				
				<label for="c_reqRole">Request Role</label>
				<select id="c_reqRole" class="form-control">
				  <option value="1" checked="checked">Athensoft</option>
				  <option value="2">Client</option>
				  <option value="3">Broker</option>
				</select><br/>
				
				<label for="c_reqStatus">Request Status</label>
				<select id="c_reqStatus" class="form-control">
				  <option value="1" checked="checked">Valid</option>
				  <option value="2">Invalid</option>
				  <option value="3">Void</option>
				  <option value="5">Delete</option>
				</select><br/>

          </div>
          	<div class="col-lg-4">
          		<lable for="c_reqDate">Request Date</lable>				 
				<input type="text" class="form-control" name="c_reqDate" id="c_reqDate" value="2015-11-18"><br/>
				
				<lable for="c_reqNum">Request Number</lable>			      
				<input type="text" class="form-control" name="c_reqNum" id="c_reqNum"><br/>
				
				
				<lable for="c_reqLocation">Request Location</lable>
				      
				<input type="text" class="form-control" name="c_reqLocation" id="c_reqLocation"><br/>
				
				
				<lable for="c_reqTarget">Request Target</lable> 			
				<input type="text" class="form-control" name="c_reqTarget" id="c_reqTarget"><br/>
				
				
				<lable for="c_reqDesc">Request Description</lable>				
				<textarea class="form-control" name="c_reqDesc" id="c_reqDesc" rows="3"></textarea><br/> 
				
          	</div>
          </div>
          
          <div class="row">
          <div class="col-lg-12">
          <a href="javascript:void(0);" onclick="createRequirement()" class="btn btn-primary">Post requirement</a> 
				<!-- <input type="submit" value="Search"> 
				<input type="submit" value="Update"> 
				<input type="submit" value="Delete">  -->
				<br/><br/>
          </div>
          </div>
          
          <!-- data -->
          <div id="data"></div>
          
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
    
    <!-- Athensoft scripts -->
    <script src="scripts/local/user/post-request.js"></script>
    
	<script>	
	$(document).ready(function(){
		searchAll();   			
	});
	</script>   
    
    
  </body>
</html>
