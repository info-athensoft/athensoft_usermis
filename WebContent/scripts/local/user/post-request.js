function createRequirement(){
		
			//create a json object

	        var p1 = $("#c_projectId").val();	
			var p2 = $("#c_reqType1").val();
			var p3 = $("#c_reqType2").val();		
			var p4 = $("#c_reqNum").val();
			var p5 = $("#c_reqLocation").val();
			var p6 = $("#c_reqTarget").val();
			var p7 = $("#c_reqDesc").val();
			var p8 = $("#c_reqRole").val();
			var p9 = $("#c_reqDate").val();
			var p10 = $("#c_reqStatus").val();

	
			/*
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
			*/
			
			
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