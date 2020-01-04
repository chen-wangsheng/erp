<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
<%
String path = request.getContextPath();
String base = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
request.setAttribute("base", base);
request.setAttribute("path", path);
%>


<title>蓝源进销存-系统登录页</title>
<script>
	/* $(function() {
		$("#login_ok").click(function() {
			$("form:first").submit();
		});
	});
	function MM_swapImage(srcObj,image_src){
		srcObj.src=image_src;
	} */
	
	function login(){
		//alert("1")
		//var username=$("#username").val();
		//alert(username);
		var result=false;
		if($("#username").val() != null && $("#username").val() != ""){
			result=true;
		}else{
			alert("请输入账号！");
			return false;
		}
		if($("#pwd").val() != null && $("#pwd").val() != ""){
			result=true;
		}else{
			alert("请输入密码！");
			return false;
		}
		if(result){
			$("#login").submit();
		}
		
		
	}
	
	
</script>
</head>
<body>

	<div class="container-login">
		<div class="login-pic">
			<div class="login-text">
				<form action="${base }/login/gologin.do" method="post" id="login">
					<table width="100%" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td width="19%" height="28">用户名：</td>
							<td colspan="2">
								<input value="admin" type="text" size="18" id="username" name="username"/>
							</td>
						</tr>
						<tr>
							<td height="31">密&nbsp;&nbsp;码：</td>
							<td colspan="2">
								<input value="1" type="test" size="18" id="pwd" name="pwd"/>
							</td>
						</tr>
						<tr id="errorName"  <c:if test="${empty error }">style="display:none"</c:if>>${error}</tr>
						<tr>
							<td height="30">验证码：</td>
							<td width="43%">
								<input type="text" size="9" />
							</td>
							<td width="32%"><img src="../images/test.gif" />
							</td>
						</tr>
						<!-- <a href="javascript:login();">提交</a> -->
						<tr>
							<td height="30">&nbsp;</td>
							<td colspan="2">
								<a href="javascript:login();" id="login_ok">
									<img src="../images/denglu_bg_03.gif" 
										 name="Image1" width="40"	
										 height="22" border="0"  
										 onmouseover="(this,'../images/denglu_h_03.gif')" 
										 onmouseout="MM_swapImage(this,'../images/denglu_bg_03.gif')" /></a>
								<a href="#">
									<img src="${base }/images/giveup_bg_03.gif" 
										 name="Image2" width="42" 
										 height="22" border="0"  
										 onmouseover="MM_swapImage(this,'../images/giveup_h_03.gif')" 
										 onmouseout="MM_swapImage(this,'../images/giveup_bg_03.gif')" /></a>
							</td>
						</tr>
						<!-- <input type="submit" value="提交"></input> -->
					</table>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
