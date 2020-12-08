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
	<form id="frm" action="/add" method="post">
		<div class="form-group">
			<label for="title">제목</label>
			<input type="text" class="form-control" id="title" name="title">
		</div>
		<div class="form-group">
			<label for="user">작성자</label>
			<input type="text" class="form-control" id="user" name="user">
		</div>
		<div class="form-group">
			<label for="detl">본문</label>
			<textarea class="form-control" rows="5" id="comment" name="detl" id="detl"></textarea>
		</div>

     	<button type="button" id="btn" class="btn btn-primary btn-block" onclick="add();">저장</button>
	</form>
	
<script>
	function add() {
		if($("#title").val().trim() == "") {
			alert("제목을 입력해주세요");
			return;
		}

		document.getElementById("frm").submit();
	}

</script>	
</body>
</html>
