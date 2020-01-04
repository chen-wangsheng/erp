<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/jquery-1.8.3.js"></script>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<script type="text/javascript">
	$(function() {
		/* $("#query").click(function() {
			$("[name='pageNum']").val(1);
			$("form:first").submit();
		}); */
		
		$('option').each(function(i,l){
			if($(l).val()==$("#e").val()){
				$(l).attr('selected','selected')
			}
		});
		
	});
	function showMsg(msg,uuid){
		//top.$('context-msg').style.display = "block";
		//top.$('context-msg-text').innerHTML=msg;
		//top.$('hid-action').value="${base }/supplier/delSupplier.do?uuid="+uuid;
		//top.lock.show();
		//alert(msg);
		if(confirm(msg)){
			$.post("${base }/supplier/delSupplier.do",{"uuid":uuid},function(data){
				if(data == "ok"){
					window.location.reload();
					alert("删除成功");
				}else{
					alert("删除失败");
				}
			});
		}
	}
	
	function query(){
		var flag=false;
		$("#n").val($("#needss").val())
		
		$("#forms").submit();
		
	}
	
	
	/* function query(){
		var name=$("#name").val();
		var needs=$("#needss").val();
		var contact=$("#contact").val()
		var tele=$("#tele").val()
		var url="${base }/supplier/selSupplier.do";
		//alert(tele)
		$.post(url,{"name":name,"needs":needs,"contact":contact,"tele":tele},function(data){
			//var datas=data.substring(1,data.length-1)
			//alert(datas)
// 			for(var i=0;i<datas.length;i++){
// 				var object=eval("["+datas[i]+"]");
// 				var appendStr="<td width='13%' height='30'>"+object.name+"</td><td>${supplier.address }</td><td>${supplier.contact }</td><td>${supplier.tele }</td><td>${supplier.needs==1?'送货':'自提' } </td><td><img src='../../images/icon_3.gif' /> <span style='line-height:12px; text-align:center;'> <a href='${base }/supplier/toUpdateSupplier.do?uuid=${supplier.uuid}' class='xiu'>修改</a></span> <img src='../../images/icon_04.gif' /> <span style='line-height:12px; text-align:center;'> <a href='javascript:void(0)' class='xiu' onclick='showMsg('是否删除该项数据？',${supplier.uuid })'>删除</a></span></td></tr>";
// 				var tbody=$("tbody").append(appendStr)
// 			}
			var datas=data.substring(1,data.length-1)
			for(var i=0;i<datas.length;i++){
			var object=eval("["+datas[i]+"]");
			var appendStr="<td width='13%' height='30'>"+object.name+"</td><td>"+object.address+"</td><td>"+object.contact+"</td><td>"+object.tele+"</td><td>"+object.needs+"</td><td><img src='../../images/icon_3.gif' /> <span style='line-height:12px; text-align:center;'> <a href='${base }/supplier/toUpdateSupplier.do?uuid=${supplier.uuid}' class='xiu'>修改</a></span> <img src='../../images/icon_04.gif' /> <span style='line-height:12px; text-align:center;'> <a href='javascript:void(0)' class='xiu' onclick='showMsg('是否删除该项数据？',${supplier.uuid })'>删除</a></span></td></tr>";
			var tbody=$("tbody").append(appendStr)
						}
			$("#tbodyContent").append(tbody);
		});
	} */
	
</script>
<div class="content-right">
	<div class="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span class="page_title">供应商管理</span>
		</div>
	</div>
	<div class="content-text">
		<form action="${base }/supplier/supplierList.do" method="post" id="forms">
		<input type="hidden" id="n" name="needs"/>
		<input type="hidden" id="e" name="needs" value="${needs }"/>
			<div class="square-o-top">
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					style="font-size:14px; font-weight:bold; font-family:"黑体";">
					<tr>
						<td width="28%" height="30">&nbsp;</td>
						<td width="8%">供应商:</td>
						<td width="17%"><input type="text" size="18" id="name" name="name" value="${name }"/></td>
						<td width="8%">联系人:</td>
						<td width="17%"><input type="text" size="18" id="contact" name="contact" value="${contact }"/></td>
						<td width="12%">
							<a id="query" onclick="query();"><img src="../../images/can_b_01.gif" border="0" /> </a></td>
					</tr>
					<tr>
						<td height="30">&nbsp;</td>
						<td>电话:</td>
						<td><input type="text" size="18" id="tele" name="tele" value="${tele }"/></td>
						<td>提货方式：</td>
						<td>
							<select class="kuan" id="needss">
								<option value="-1">----请-选-择----</option>
								<option value="1">送货</option>
								<option value="2">自提</option>
							</select>
						</td>
						<td>
							<a href="${base }/supplier/toSupplierAdd.do"><img	src="../../images/can_b_02.gif" border="0" /> </a></td>
					</tr>
				</table>
			</div>
			<!--"square-o-top"end-->
			<div class="square-order">
				<table width="100%" border="1" cellpadding="0" cellspacing="0">
					<thead>
					<tr align="center"
						style="background:url(../../images/table_bg.gif) repeat-x;">
						<td width="20%" height="30">供应商</td>
						<td width="20%">地址</td>
						<td width="20%">联系人</td>
						<td width="12%">电话</td>
						<td width="12%">送货方式</td>
						<td width="16%">操作</td>
					</tr>
					</thead>
					<tbody id="tbodyContent">
					<c:forEach items="${suppliers}" var="supplier">
					<tr align="center" bgcolor="#FFFFFF">
						<td width="13%" height="30">${supplier.name }</td>
						<td>${supplier.address }</td>
						<td>${supplier.contact }</td>
						<td>${supplier.tele }</td>
						<td>${supplier.needs==1?'送货':'自提' } </td>
						<td>
							<img src="../../images/icon_3.gif" /> 
							<span style="line-height:12px; text-align:center;"> 
								<a href="${base }/supplier/toUpdateSupplier.do?uuid=${supplier.uuid}" class="xiu">修改</a>
							</span> 
							<img src="../../images/icon_04.gif" /> 
							<span style="line-height:12px; text-align:center;"> 
								<a href="javascript:void(0)" class="xiu" onclick="showMsg('是否删除该项数据？',${supplier.uuid })">删除</a>
							</span>
						</td>
					</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>
		</form>
	</div>
	<div class="content-bbg"></div>
</div>
