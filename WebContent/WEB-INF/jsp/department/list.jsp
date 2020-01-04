<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function() {
		/* $("#query").click(function() {
			$("form:first").submit();${base }/dep/deplist.do
		}); */
	});
	function showMsg(msg,uuid){
		//top.document.getElementById("context-msg").style.display = "block";
		//top.$('context-msg').style.display = "block";
		//top.$('context-msg-text').innerHTML=msg;
		//top.$('hid-action').value="${base }/dep/delete.do?uuid="+uuid;
		//top.lock.show();
		if(confirm(msg)){
			$.post("${base }/dep/delete.do",{"uuid":uuid},function(data){
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
		//alert(1)
	
		$("#forms").submit();
		
	}
	
	
</script>
<div class="content-right">
	<div class="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span class="page_title">部门管理</span>
		</div>
	</div>
	<div class="content-text">
		<form action="${base }/dep/deplist.do" method="post" id="forms">
			<div class="square-o-top">
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					style="font-size:14px; font-weight:bold; font-family:"黑体";">
					<tr>
						<td width="68" height="30">&nbsp;&nbsp;&nbsp;</td>
						<td width="123">&nbsp;</td>
						<td width="62">部门名称:</td>
						<td width="142"><input type="text" size="18" name="name" id="name" value="${name }"/></td>
						<td width="60">电话:</td>
						<td width="149"><input type="text" size="18" name="tele" id="tele" value="${tele }"/></td>
						<td width="70"><a id="query" href="javascript:void(0)" onclick="query();"> <img
								src="../../images/can_b_01.gif" border="0" /> </a></td>
						<td width="70"><a href="${base }/dep/toadddep.do"><img
								src="../../images/can_b_02.gif" border="0" /> </a></td>
					</tr>
				</table>
			</div> 
			<!--"square-o-top"end-->
			<div class="square-order">
				<center style="display:none">
					<span style="font-size:20px;color:#96D34A;font-weight:bold">没有查找到满足条件的数据！</span>
				</center>
				<table width="100%" border="1" cellpadding="0" cellspacing="0">
					<tr align="center"
						style="background:url(../../images/table_bg.gif) repeat-x;">
						<td width="13%" height="30">编号</td>
						<td width="13%">部门名称</td>
						<td width="16%">电话</td>
						<td width="16%">操作</td>
					</tr>
					<c:forEach items="${deps}" var="dep">
					<tr align="center" bgcolor="#FFFFFF">
						<td width="13%" height="30">${dep.uuid }</td>
						<td>${dep.name }</td>
						<td>${dep.tele }</td>
						<td>
							<img src="../../images/icon_3.gif" /> 
							<span style="line-height:12px; text-align:center;"> 
								<a href="${base }/dep/update.do?uuid=${dep.uuid}" class="xiu">修改</a>
							</span> 
							<img src="../../images/icon_04.gif" /> 
							<span style="line-height:12px; text-align:center;"> 
								<a href="javascript:void(0)" class="xiu" onclick="showMsg('是否删除该项数据？当前部门删除后，所有部门内的员工将被删除，同时相关数据也将删除！',${dep.uuid })">删除</a>
							</span>
						</td>
					</tr>
					</c:forEach>
				</table>
				<table width="100%" border="0" cellpadding="0" cellspacing="0">
					<tr>
						<td width="51%">&nbsp;</td>
						<td width="13%">共${PageResult.total}条记录
						<td width="6%">
							<a id="fir" class="sye">首&nbsp;&nbsp;页</a>
						</td>
						<!-- 分页先注释以后完成 -->
						<%-- <c:choose>
						<td width="6%">
							<c:when test="${result.beginNo eq '0'}">
								<a href="#" disabled="disabled" style="background: #eee;">上一页</a>
							</c:when>
						
							<!-- <a id="pre" class="sye">上一页</a> -->
							<c:otherwise>
								<a href="${base }/dep/deplist.do?beginNo=${PageResult.beginNo-PageResult.defaultSize}&pageSize=${PageResult.pageSize-PageResult.defaultSize}">上一页</a>
							</c:otherwise>
						</td>
						</c:choose> --%>
						
						<%-- <c:choose>
						<td width="6%">
						<c:when test="${PageResult.pageSize >= PageResult.totalCount}">
								<a href="#" disabled="disabled" style="background: #eee;">下一页</a>
							</c:when>
						<c:otherwise>
								<a href="${base }/dep/deplist.do?beginNo=${PageResult.beginNo+PageResult.defaultSize}&pageSize=${PageResult.pageSize+PageResult.defaultSize}">下一页</a>
							</c:otherwise>
						
							<!-- <a id="next" class="sye">下一页</a> -->
						</td>
						</c:choose> --%>
						<td width="6%">
							<a id="last" class="sye">末&nbsp;&nbsp;页</a>
						</td>
						<td width="12%">当前第<span style="color:red;"></span>/3页</td>
					</tr>
				</table>
			</div>
		</form>
	</div>
	<div class="content-bbg"></div>
</div>
