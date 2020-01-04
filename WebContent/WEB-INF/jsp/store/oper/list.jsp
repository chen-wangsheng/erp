<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<link href="../../../css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../../js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="../../../js/Calendar.js"></script>
<script type="text/javascript">
	/* $(function() {
		$("#query").click(function() {
			$("[name='pageNum']").val(1);
			$("form:first").submit();
		});
	}); */
	
	function query(){
		var flag=false;
		var cztype=$("#cz").val();
		if(cztype==-1){
			alert("请选择正确的方式");
			return false;
		}else{
			flag=true;	
		}
		if(flag){
			$("#ty").val(cztype);
			$("#form").submit();
		}
		
	}
	
	
	
</script>
<div class="content-right">
	<div class="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span class="page_title">仓库出/入库明细</span>
		</div>
	</div>
	<div class="content-text">
		<form action="${base }/store/storeOper.do" method="post" id="form">
		<input type="hidden"  name="cztype" id="ty"/>
			<div class="square-o-top">
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					style="font-size:14px; font-weight:bold; font-family:"黑体";">
					<tr>
						<td>仓库名称:</td>
						<td><input type="text" size="14" name="ckname" value="${ckname }"/></td>
						<td>操作类别:</td>
						<td>
							<select style="width:112px" id="cz">
								<option value="-1">----请-选-择----</option>
								<option value="1">入库</option>
								<option value="0">出库</option>
							</select>
						</td>
						<td>操作时间:</td>
						<td>
							<input type="text" size="14" onfocus="c.showMoreDay=false;c.show(this);" readonly="true" name="starttimes" value="${starttimes }"/>
						</td>
						<td>到&nbsp;</td>
						<td>
							<input type="text" size="14" onfocus="c.showMoreDay=false;c.show(this);" readonly="true" name="endtimes" value="${endtimes }"/>
						</td>
						<td>
							<a id="query" onclick="query()"><img src="../../../images/can_b_01.gif" border="0" /> </a></td>
					</tr>
					<tr>
						<td>操作人:</td>
						<td><input type="text" size="14" name="czrname" value="${czrname }"/></td>
						<td>货物名称:</td>
						<td><input type="text" size="14" name="goodsname" value="${goodsname }"/></td>
						<td>数量(废弃):</td>
						<td><input type="text" size="14" /></td>
						<td>到&nbsp;</td>
						<td><input type="text" size="14" /></td>
					</tr>
				</table>
			</div>
			<!--"square-o-top"end-->
			<div class="square-order">
				<table width="100%" border="1" cellpadding="0" cellspacing="0">
					<tr align="center"
						style="background:url(../../../images/table_bg.gif) repeat-x;">
						<td width="20%"  height="30">仓库名称</td>
						<td width="10%">类别</td>
						<td width="20%" height="30">操作时间</td>
						<td width="15%">操作人</td>
						<td width="20%">货物名称</td>
						<td width="15%">数量(废弃)</td>
					</tr>
					<c:forEach items="${oper }" var="oper">
						<tr align="center" bgcolor="#FFFFFF">
							<td  height="30">${oper.ckname }</td>
							<td>${oper.cztype==0?'出库':'入库' }</td>
							<td>${oper.cztime }</td>
							<td>${oper.czname }</td>
							<td>${oper.goodsname }</td>
							<td>200&nbsp;箱</td>
						</tr>
						</c:forEach>
						<!-- <tr align="center" bgcolor="#FFFFFF">
							<td  height="30">一号仓库</td>
							<td>入库</td>
							<td>2014-11-12</td>
							<td>灰太狼</td>
							<td>小肥羊涮料</td>
							<td>100&nbsp;箱</td>
						</tr>
						<tr align="center" bgcolor="#FFFFFF">
							<td  height="30">一号仓库</td>
							<td>出库</td>
							<td>2014-11-12</td>
							<td>灰太狼</td>
							<td>小肥羊涮肉500g</td>
							<td>100&nbsp;箱</td>
						</tr> -->
				</table>
			</div>
		</form>
	</div>
	<div class="content-bbg"></div>
</div>
