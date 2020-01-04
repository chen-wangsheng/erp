<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<script type="text/javascript" src="../../js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function() {
		$('option').each(function(i,l){
			var gys=$("#gys").val();
			if($(l).val()==gys){
				$(l).attr('selected','selected');
			}
		});
		
	});
	function showMsg(msg,uuid){
		if(confirm(msg)){
			var url="${base }/goodstype/delete.do"
			$.post(url,{"uuid":uuid},function(data){
				if(data=="ok"){
					window.location.reload();
					alert("删除成功");
				}else{
					alert("删除失败");
				}
			});
		}
	}
	
	function query(){
		//alert(1)
		var flag=false;
		if($("#gys").val()==-1){
			alert("正确填写")
			return false;
		}else{
			flag=true;
		}
		
		if(flag){
			$("#gysname").val($("#gys").val());
			$("#forms").submit();
		}
		
		
		
	}
	
	
	
	
</script>
<div class="content-right">
	<div class="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span class="page_title">商品类别管理</span>
		</div>
	</div>
	<div class="content-text">
		<form action="${base }/goodstype/goodstypeList.do" method="post" id="forms">
		<input type=""  name="gysname" value="" id="gysname"/>
			<div class="square-o-top">
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					style="font-size:14px; font-weight:bold; font-family:"黑体";">
					<tr>
						<td width="68" height="30">&nbsp;</td>
						<td width="123">&nbsp;</td>
						<td width="62">供应商:</td>
						<td width="142">
							<select class="kuan" id="gys">
								<option value="-1">----请-选-择----</option>
								<c:forEach items="${suppliers}" var="supplier">
							<option value="${supplier.uuid }">${supplier.name }</option>
							</c:forEach>
							
							</select>
						</td>
						<td width="60">类别名称:</td>
						<td width="149"><input type="text" size="18" name="name" value="${name }"/></td>
						<td width="70"><a id="query" onclick="query();"> <img
								src="../../images/can_b_01.gif" border="0" /> </a></td>
						<td width="70"><a href="${base }/goodstype/toGoodstypeAdd.do"><img
								src="../../images/can_b_02.gif" border="0" /> </a></td>
					</tr>
				</table>
			</div>
			<!--"square-o-top"end-->
			<div class="square-order">
				<table width="100%" border="1" cellpadding="0" cellspacing="0">
					<tr align="center"
						style="background:url(../../images/table_bg.gif) repeat-x;">
						<td width="30%" height="30">供应商</td>
						<td width="30%">类别名称</td>
						<td width="40%">操作</td>
					</tr>
					<c:forEach items="${goodstypes}" var="goodstype">
					<tr align="center" bgcolor="#FFFFFF">
						<td width="30%" height="30">${goodstype.gysname }</td>
						<td>${goodstype.name }</td>
						<td>
							<img src="../../images/icon_3.gif" /> 
							<span style="line-height:12px; text-align:center;"> 
								<a href="${base }/goodstype/toGoodstypeEdit.do?uuid=${goodstype.uuid }" class="xiu">修改</a> 
							</span> 
							<img src="../../images/icon_04.gif" /> 
							<span style="line-height:12px; text-align:center;"> 
								<a href="javascript:void(0)" class="xiu" onclick="showMsg('是否删除该项数据？',${goodstype.uuid })">删除</a>
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
