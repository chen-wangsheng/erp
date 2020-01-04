<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
	//$(function() {
		/* alert("111") */
		//将省id传入后台
		/* $("#box").change(function() {
			var pid = $("#box").val();
			$.ajax({
				type : "POST",
				url : "showCityListByPid.form",
				data : {
					pid : pid
				},
				dataType : "JSON",
				success : function(date) {
					var str = "<option>请选择</option>";
					$("#box1").html("");
					for ( var i = 0; i < date.length; i++) {
						str += "<option value='"+date[i].cityid+"'>" + date[i].city + "</option>";

					}
					$("#box1").append(str);

					$("#box").change(function() {
						$("#box1").val("请选择");
						$("#box2").val("请选择");
					})
				}
			});

		}); */
		//将城市id传入后台
		/* $("#box1").change(function() {
			var cid = $("#box1").val();
			$.ajax({
				type : "POST",
				url : "showTownListByCid.form",
				data : {
					cid : cid
				},
				dataType : "JSON",
				success : function(date) {
					var str = "<option>请选择</option>";
					$("#box2").html("");
					for ( var i = 0; i < date.length; i++) {
						str += "<option value='"+date[i].areaid+"'>" + date[i].area + "</option>";

					}
					$("#box2").append(str);					
					$("#box1").change(function() {
						$("#box2").val("请选择");
					})

				}

			});

		});

	}); */
</script>



</head>

<body>
	<h4>haha</h4>

	<!-- 省下拉列表 -->
	<%-- <select id="box">
		<option>请选择</option>
		<c:forEach items="${proList}" var="pro">
			<option value="${pro.provinceid}">${pro.province}</option>
		</c:forEach>
	</select>
	<!--  城市下拉列表 -->
	<select id="box1">
		<option>请选择</option>
	</select>

	<!-- 区、县下拉列表 -->
	<select id="box2">
		<option>请选择</option>
	</select> --%>
</body>
</html>
