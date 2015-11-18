<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="scripts/bootstrap.min.js"></script>
</head>
<body>
	<h2>Test Requirement Form</h2>
	<br/>
	
	<div>
		<a href="javascript:void(0);" onclick="createRequirement()">create requirement</a>
	
	</div>
	
	<div id="data"></div>
	
	
	
	
	
	
	<script>
	
	$(document).ready(function(){
			searchAll();   			
	});
	
	
	function createRequirement(){
		
			//create a json object
			/*
			var p1 = $("#c_").val();
			var p2 = $("#c").val();		
			var p3 = $("#c").val();
			var p4 = $("#c").val();
			var p5 = $("#c").val();
			var p6 = $("#c").val();
			var p7 = $("#c").val();
			var p8 = $("#c").val();
			var p9 = $("#c").val();
			var p10 = $("#c").val();
			*/
			var p1 = '2';
			var p2 = '1';
			var p3 = '1';
			var p4 = '1';
			var p5 = '1';
			var p6 = '1';
			var p7 = '1';
			var p8 = '1';
			var p9 = '2015-11-18';
			var p10 = '1';
			
			
			//create json object
			var reqObject =
			{
				projectId	:p1,
				reqType1	:p2,
				reqType2	:p3,
				reqNum		:p4,
				reqLocation	:p5,
				reqTarget	:p6,
				reqDesc		:p7,
				requestRole :p8,
				requestDate	:p9,
				reqStatus	:p10
				
				
			};
		
			//execute saving
			$.ajax({
				type:		"post",
				url:		"create_requirement.do?reqJSONString="+JSON.stringify(reqObject),
				dataType:	"json",
				timeout: 	30000,
				
				success:function(data){
					searchAll();
				},
				error:function(){
					alert("ERROR: create failed.");	 
				},			
				complete: function(XMLHttpRequest, textStatus){
					//reset to avoid duplication
					//createReset();
				}		
			});
	}
	
	
	//search all
	
	function searchAll(){
		
	$.ajax({
		type:"post",
		url:"search_requirement_all.do",
		dataType:"json",
		timeout : 30000,
		
		success:function(data){
			reqs = data.reqList;
			var str = "<table class=\"table table-striped\">"
			    	+ "<tr>"
			    	+" <th>Req Type A</th>"
			    	+" <th>Req Type B</th>"
			    	+" <th>Req No.</th>"
			    	+" <th>Req Location</th>"
			    	+" <th>Req Target</th>"
			    	+" <th>Req Description</th>"
			    	+ "</tr>";

		    for(var i in reqs){				
				str = str + "<tr>"
					+ "<td>"+reqs[i].reqType2+"</td>"
					+ "<td>"+reqs[i].reqType1+"</td>"
					+ "<td>"+reqs[i].reqNum+"</td>"
					+ "<td>"+reqs[i].reqLocation+"</td>"
					+ "<td>"+reqs[i].reqTarget+"</td>"
					+ "<td>"+reqs[i].reqDesc+"</td>"
					+ "<td>"+reqs[i].requestRole+"</td>"
					+ "<td>"+reqs[i].requestDate+"</td>"
					+ "<td>"+reqs[i].reqStatus+"</td>"
					+ "</tr>";
			}
			str = str + "</table>";
			$("#data").html(str);
		},
		
		error:function(){
			  alert("ERROR:	req query failed!");
		},
		
		complete: function(XMLHttpRequest, textStatus){
		}
	
	});
} //end of function searchAll()
	
	
	</script>
	
</body>
</html>