<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> practice 글쓰기 폼</title>
 <script src="https://code.jquery.com/jquery-latest.min.js"></script>
 <script type="text/javascript">
   function check(){
	   if($.trim($('#test_title').val()) == ''){
		   window.alert('글제목을 입력하세요!');
		   $('#test_title').val('').focus();
		   return false;
	   }
	   
	   if($.trim($('#test_cont').val()) == ''){
		   alert('글내용을 입력하세요!');
		   $('#test_cont').val('').focus();
		   return false;
	   }
   }
 </script>
</head>
<body>
<form method="post" action="test_ok" onsubmit='return check();'>
제목 : <input name="test_title" id="test_title" size="36"><br><br>
내용 : <textarea name="test_cont" id="test_cont" rows="10" cols="34"></textarea>
 <hr>
 <input type="submit" value="입력">
 <input type="reset" value="취소">
</form>
</body>
</html>