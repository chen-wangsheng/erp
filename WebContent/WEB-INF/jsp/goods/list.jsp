<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<script type="text/javascript" src="../../js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="../../js/Calendar.js"></script>
<script type="text/javascript">
	$(function() {
		$("#query").click(function() {
			$("[name='pageNum']").val(1);
			$("form:first").submit();
		});
	});
	function showMsg(msg,uuid){
		//top.document.getElementById("context-msg").style.display = "block";
		top.$('context-msg').style.display = "block";
		top.$('context-msg-text').innerHTML=msg;
		top.$('hid-action').value="actionName";
		top.lock.show();
	}
	
	function submit(){
		var gysId=$("#gysId").val()
		var flag=false;
		if(flag ==-1){
			alert("填写供应商")
			return false;
		}else{
			$("#gysId").val($("#sel").val());
			flag=true;
		}
		if(flag){
			$("#forms").submit();
		}
		
		
	}
	
	
</script>
<div class="content-right">
	<div class="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span class="page_title">商品管理</span>
		</div>
	</div>
	<div class="content-text">
		<form action="${base }/goods/goodsList.do" method="post" id="form"> 
		<input type=""  name="gysId" id="gysId"/>
			<div class="square-o-top">
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					style="font-size:14px; font-weight:bold; font-family:"黑体";">
					<tr>
						<td>供应商:</td>
						<td>
							<select class="kuan" id="sel">
								<option value="-1">----请-选-择----</option>
								<c:forEach items="${suppliers}" var="supplier">
							<option value="${supplier.uuid }">${supplier.name }</option>
							</c:forEach>
								
							</select>
						</td>
						<td height="30">商&nbsp;品&nbsp;名</td>
						<td><input type="text" size="14" name="name"/></td>
						<td>生产厂家</td>
						<td><input type="text" size="14" name="producer"/></td>
						<td>单&nbsp;&nbsp;&nbsp;&nbsp;位</td>
						<td><input type="text" size="14" name="unit"/></td>
						<td width="70"><a href="${base }/goods/toAddGoods.do"><img src="../../images/can_b_02.gif" border="0" /> </a></td>
					</tr>
					<tr>
						<td height="30">进货价格</td>
						<td><input type="text" size="14" name=""/></td>
						<td>到</td>
						<td><input type="text" size="14" name=""/></td>
						<td height="30">销售价格</td>
						<td><input type="text" size="14" name=""/></td>
						<td>到</td>
						<td><input type="text" size="14" /></td>
						<td><a id="query"> <img src="../../images/can_b_01.gif" border="0" /> </a></td>
					</tr>
				</table>
			</div>
			<!--"square-o-top"end-->
			<div class="square-order">
				<table width="100%" border="1" cellpadding="0" cellspacing="0">
					<tr align="center"
						style="background:url(../../images/table_bg.gif) repeat-x;">
						<td width="12%" height="30">供应商</td>
						<td width="12%">商品名</td>
						<td width="12%">生产厂家</td>
						<td width="12%">产地</td>
						<td width="12%">进货价格</td>
						<td width="12%">销售价格</td>
						<td width="12%">单位</td>
						<td width="16%">操作</td>
					</tr>
					<c:forEach items="${goods}" var="goods">
						<tr align="center" bgcolor="#FFFFFF">
							<td width="13%" height="30">${goods.gysname }</td>
							<td>${goods.name }</td>
							<td>${goods.producer }</td>
							<td>${goods.gysaddress }</td>
							<td align="right">${goods.inprice }&nbsp;元&nbsp;</td>
							<td align="right">${goods.outprice }&nbsp;元&nbsp;</td>
							<td>${goods.unit }</td>
							<td>
								<img src="../../images/icon_3.gif" /> 
								<span style="line-height:12px; text-align:center;"> 
									<a href="${base }/goods/toGoodsEdit.do?uuid=${goods.uuid }" class="xiu">修改</a> 
								</span> 
								<img src="../../images/icon_04.gif" /> 
								<span style="line-height:12px; text-align:center;"> 
									<a href="javascript:void(0)" class="xiu" onclick="showMsg('是否删除该项数据？',>${goods.uuid })">删除</a>
								</span>
							</td>
						</tr>
						</c:forEach>
				</table>
			</div>
		</form>
	</div>
	<div class="content-bbg"></div>
</div>
