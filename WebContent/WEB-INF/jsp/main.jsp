<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
String path = request.getContextPath();
String base = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
request.setAttribute("base", base);
request.setAttribute("path", path);
System.err.println("-----------------------------------------");
System.err.println(base);
System.err.println("-----------------------------------------");
System.err.println(path);
System.err.println("-----------------------------------------");
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../css/index.css" rel="stylesheet" type="text/css" />
<title>蓝源进销存系统-系统主页</title>
<script type="text/javascript" src="../../js/jquery-1.8.3.js"></script>
<script type="text/javascript">
$(function(){
	
});
</script>


</head>
<body>
	<div class="container">
		<div class="head">
			<div class="head-left">
				<span style="font-weight:bold; color:#1f4906">欢迎您-</span><br />
				<span style="color:#4a940d"></span>
			</div>
			<div class="head-right">
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="32%">
							<a href="employee/changePwd.jsp" target="main">
								<img src="../images/head-l.gif"	border="0" />
							</a>
						</td>
						<td width="26%">
							<a href="../index2.jsp">   <!-- 注销功能 -->
								<img src="../images/head-m.gif"	border="0" />
							</a>
						</td>
						<td width="7%">&nbsp;</td>
						<td width="35%"><a href="#"><img src="../images/head-r.gif"
								border="0" />
						</a>
						</td>
					</tr>
				</table>
			</div>
		</div>
		<!--"head"end-->

		<div class="content">
			<div class="left">
				<div style="margin-left:2px;">
					<img src="../images/left-top.gif" width="162" height="25" />
				</div>
				<div class="left-bottom">
				<!-- 菜单 -->
				<%-- <%@include file="/WEB-INF/jsp/tools/menu.jsp"%> --%>
				
						<table width="100%" border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td><a class="hei" target="main" href="#">商品管理</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/supplier/supplierList.do">&nbsp;&nbsp;&nbsp;&nbsp;供应商</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/goodstype/goodstypeList.do">&nbsp;&nbsp;&nbsp;&nbsp;商品类别</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/goods/goodsList.do">&nbsp;&nbsp;&nbsp;&nbsp;商品</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="#">采购管理</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/order/orderList.do">&nbsp;&nbsp;&nbsp;&nbsp;采购订单</a></td>
							</tr>
							<!-- <tr>
								<td><a class="hei" target="main" href="#">&nbsp;&nbsp;&nbsp;&nbsp;采购退货</a></td>
							</tr> -->
							<tr>
								<td><a class="hei" target="main" href="${base }/order/orderCheck.do">&nbsp;&nbsp;&nbsp;&nbsp;采购审批</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="#">销售管理</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="#">&nbsp;&nbsp;&nbsp;&nbsp;销售订单</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="#">&nbsp;&nbsp;&nbsp;&nbsp;销售退货</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="#">&nbsp;&nbsp;&nbsp;&nbsp;销售审批</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="#">商品运输</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/goodsTransport/index.do">&nbsp;&nbsp;&nbsp;&nbsp;运输任务指派</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/goodsTransport/goodsTransportQuery.do">&nbsp;&nbsp;&nbsp;&nbsp;运输任务查询</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="#">仓库管理</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/store/storeQuery.do">&nbsp;&nbsp;&nbsp;&nbsp;库存查询</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/store/storeIn.do">&nbsp;&nbsp;&nbsp;&nbsp;入库</a></td>
							</tr>
							<!-- <tr>
								<td><a class="hei" target="main" href="#">&nbsp;&nbsp;&nbsp;&nbsp;出库</a></td>
							</tr> -->
							<tr>
								<td><a class="hei" target="main" href="${base }/store/storeOper.do">&nbsp;&nbsp;&nbsp;&nbsp;仓库操作明细</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="#">报表中心</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/excel/index.do">&nbsp;&nbsp;&nbsp;&nbsp;进货报表</a></td>
							</tr>
							<!-- <tr>
								<td><a class="hei" target="main" href="#">&nbsp;&nbsp;&nbsp;&nbsp;销售报表</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="#">&nbsp;&nbsp;&nbsp;&nbsp;仓库报表</a></td>
							</tr> -->
							<tr>
								<td><a class="hei" target="main" href="#">基础维护</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/dep/deplist.do">&nbsp;&nbsp;&nbsp;&nbsp;部门维护</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/login/emp.do">&nbsp;&nbsp;&nbsp;&nbsp;员工维护</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/role/rolelist.do">&nbsp;&nbsp;&nbsp;&nbsp;角色维护</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/resource/resourceList.do">&nbsp;&nbsp;&nbsp;&nbsp;资源维护</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/menu/menuList.do">&nbsp;&nbsp;&nbsp;&nbsp;菜单维护</a></td>
							</tr>
							<tr>
								<td><a class="hei" target="main" href="${base }/store/storeList.do">&nbsp;&nbsp;&nbsp;&nbsp;仓库管理</a></td>
							</tr>
						</table>
				</div>
				<!--"left-bottom"end-->
			</div>
			<!--"left"end    action="${base }/login/gologin.do"-->

			<iframe id="frame-contect" src="${base }/login/page.do"
				style="width:848px;float:right;height:530px" scrolling="no"
				name="main" frameborder="0"></iframe>
				
			<!--"content-right"end-->
		</div>
		<!--"content"end-->
		<div class="footer">
			<div style="margin-top:5px;">
				<table width="98%" border="0" cellpadding="0" cellspacing="0"
					align="center">
					<tr>
						<td width="82%"><img src="../images/icon_1.gif" />&nbsp; <a
							class="lanyo" href="www.itcast.cn">蓝源信息技术 2014</a></td>
						<td width="18%" valign="middle"><img src="../images/icon_2.gif" />&nbsp;
							<a class="lanyo" href="#">如有疑问请与技术人员联系</a></td>
					</tr>
				</table>
			</div>

		</div>
		<!--"footer"end-->
	</div>
	<!--"container"end-->
	<%@include file="/WEB-INF/jsp/tools/mask.jsp"%>
</body>
</html>
