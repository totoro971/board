<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body style="padding:10px;">


  <div class="input-group" style="margin-bottom:10px;">
    <input type="text" class="form-control" placeholder="Search" id="searchTxt">
    <div class="input-group-btn">
      <button class="btn btn-default" type="button" onclick ="search();">
        <i class="glyphicon glyphicon-search"></i>
      </button>
    </div>
  </div>

	<table class="table table-bordered">
	  <thead>
		<tr>
			<th>SEQ</th>
			<th>Title</th>
			<th>User</th>
		</tr>
	  </thead>
	  <tbody id="tableBody">
		<c:forEach var="list" items="${list}">
		<tr>
			<td>${list.seq}</td>
			<td><a href="/jpa/detail/${list.seq}">${list.title}</a></td>
			<td>${list.user}</td>
		</tr>
		</c:forEach>
	  </tbody>
	</table>

	<div style="width:100%; text-align:center">
		<ul class="pagination">
		  <li><a href="#">1</a></li>
		  <li class="active"><a href="#">2</a></li>
		  <li><a href="#">3</a></li>
		  <li><a href="#">4</a></li>
		  <li><a href="#">5</a></li>
		</ul>
	</div>
		
	<button type="button" class="btn btn-primary btn-block" id="btnWrite" onclick="moveWrite();">작성</button>

</body>

<script>
	var moveWrite = function() {
		location.href = "/jpa/add";
	}
	
	var search = function() {
		var req = {"title" : $("#searchTxt").val()};

		$.ajax({
			url : "/rest/searchList",
			dataType : "json",
			type : "post",
			data : JSON.stringify(req),
			contentType : "application/json",
			success : function(data) {
				$("#tableBody").html("");
				if(!data) return;
				var html = "";
				for(var i = 0; i < data.length; i++) {
					html = "<tr>";
					html += "<td>" + data[i].seq + "</td>" ;
					html += "<td><a href='/detail/" + data[i].seq + "'>" + data[i].title + "</a></td>" ;
					html += "<td>" + data[i].user + "</td>" ;					
					html += "<tr>";
				}
				$("#tableBody").html(html);
			},
			error : function(req, status, err) {
				alert(req.status + " // " + err);
			} 
		});
	}



	/*
	$(document).ready(function(){
		$("#btnWrite").click(function(){
			location.href = "/add";
		});
		
	});
	*/
</script>
</html>