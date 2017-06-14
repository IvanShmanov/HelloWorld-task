<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page session="false" %>
<html>
<head>
<link href="<c:url value ="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
 <script type="text/javascript">
    function doAjax() {
      $.ajax({
        url: 'recive.html',
        success: function(data) {
          $('#recive').html(data);
        }
      });
    }
  </script>
	<title>HelloWorld</title>
</head>
<body>
	<div class="container">
		<h1>Нажмите на кнопку и получите слова</h1>
		<h2><button id="demo" onclick="doAjax()" title="Button">Слова</button></h2>
		<div id="recive">
		</div>
	</div>
</body>
</html>
