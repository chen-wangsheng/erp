<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<link href="../../../css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../../js/jquery-1.8.3.js"></script>
<script type="text/javascript">

	/*  $(function() {
		$("#query").click(function() {
			//$("[name='pageNum']").val(1);
			$("form:first").submit();
		});
	}); */ 
	
	 function query(){
		var flag=false;
		var storeName=$('[name="storeName"]').val();
		var glyName=$('[name="glyName"]').val();
		var goodsName=$('[name="goodsName"]').val();
		alert(goodsName)
		if(storeName == null){
			alert("填写仓库名字");
			return false;
		}else{
			flag=true;
		}
		if(glyName == null){
			alert("填写管理员名字");
			return false;
		}else{
			flag=true;
		}
		if(goodsName == null){
			alert("填写货物名字");
			return false;
		}else{
			flag=true;
		}
		
		if(flag){
			$("#form").submit();
		}
		
		
	} 
	
	
	
	
</script>
<div class="content-right">
	<div class="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span class="page_title">仓库货物明细</span>
		</div>
	</div>
	<div class="content-text">
		<form action="${base }/store/storeQuery.do" method="post" id="form">
			<div class="square-o-top">
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					style="font-size:14px; font-weight:bold; font-family:"黑体";">
					<tr>
						<td width="10%">仓库名称:</td>
						<td width="20%"><input type="text" size="20" name="storeName" value="${storeName }"/></td>
						<td>管理员:</td>
						<td><input type="text" size="20" name="glyName" value="${glyName }"/></td>
						<td>货物名称:</td>
						<td><input type="text" size="20" name="goodsName" value="${goodsName }"/></td>
						<td width="">
							<a id="query" onclick="query()"><img src="../../../images/can_b_01.gif" border="0" /> </a></td>
					</tr>
				</table>
			</div>
			<!--"square-o-top"end-->
			<div class="square-order">
				<table width="100%" border="1" cellpadding="0" cellspacing="0">
					<tr align="center"
						style="background:url(../../../images/table_bg.gif) repeat-x;">
						<td width="25%" height="30">仓库名称</td>
						<td width="25%">仓库管理员</td>
						<td width="25%">货物名称</td>
						<td width="25%">当前库存量(废弃)</td>
					</tr>
					<c:forEach items="${infos }" var="info">
						<tr align="center" bgcolor="#FFFFFF">
							<td height="30">${info.storeName }</td>
							<td>${info.glyName }</td>
							<td>${info.goodsName }</td>
							<td>6000&nbsp;件</td>
						</tr>
						</c:forEach>
						<!-- <tr align="center" bgcolor="#FFFFFF">
							<td height="30">一号仓库</td>
							<td>王仓库</td>
							<td>梦龙雪糕</td>
							<td>500000&nbsp;箱</td>
						</tr>
						<tr align="center" bgcolor="#FFFFFF">
							<td height="30">一号仓库</td>
							<td>王仓库</td>
							<td>小肥羊涮料</td>
							<td>4&nbsp;箱</td>
						</tr> -->
				</table>
			</div>
		</form>
	</div>
	<div class="content-bbg"></div>
</div>
