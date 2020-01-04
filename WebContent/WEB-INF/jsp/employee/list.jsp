<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%
String path = request.getContextPath();
String base = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
request.setAttribute("base", base);
request.setAttribute("path", path);
%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
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
		top.$('hid-action').value="${base }/login/del.do?uuid="+uuid;
		top.lock.show();
	}
	
	function query(){
		alert(2)
		$("#gender").val($("#sex"))
		$("#depUuid").val($("#dep"))
		$("#forms").submit();
	}
	
	
	
</script>
<div class="content-right">
	<div class="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span class="page_title">员工管理</span>
		</div>
	</div>
	<div class="content-text">
		<form action="${base }/login/emp.do" method="post" id="forms">
		<input type="text"  name="gender" id="gender"/>
		<input type="text"  name="depUuid" id="depUuid"/>
			<div class="square-o-top">
				<table width="100%" border="0" cellpadding="0" cellspacing="0"
					style="font-size:14px; font-weight:bold; font-family:"黑体";">
					<tr>
						<td height="30">用&nbsp;户&nbsp;名</td>
						<td><input type="text" size="14" name="username" id="username"/></td>
						<td>真实姓名</td>
						<td><input type="text" size="14" name="name" id="name"/></td>
						<td>电&nbsp;&nbsp;&nbsp;&nbsp;话</td>
						<td><input type="text" size="14" name="tele" id="tele"/></td>
						<td>性&nbsp;&nbsp;&nbsp;&nbsp;别</td>
						<td>
							<select class="kuan" id="sex">
								<option value="-1">----请-选-择----</option>
								<option value="1">男</option>
								<option value="0">女</option>
							</select>
						</td>
							
						<td width="70"><a href="${base }/login/toadd.do"> <img src="../images/can_b_02.gif" border="0" /> </a></td>
					</tr>
					<tr>
						<td  height="30">电子邮件</td>
						<td><input type="text" size="14" /></td>
						<td>登录时间</td>
						<td>
							<input type="text"  size="14" onfocus="c.showMoreDay=false;c.show(this);" readonly="true"/>
						</td>
						<td>登录时间</td>
						<td>
							<input type="text" size="14" onfocus="c.showMoreDay=false;c.show(this);" readonly="true"/>
						</td>
						<td>部门名称</td>
						<td>
							<select class="kuan" id="dep">
								<option value="-1">----请-选-择----</option>
								<c:forEach items="${deps}" var="deps">
							<option value="${deps.uuid }">${deps.name }</option>
							</c:forEach>
							</select>
						</td>
						<td><a id="query" onclick="query();"> <img src="../../images/can_b_01.gif" border="0" /> </a></td>
					</tr>
				</table>
			</div>
			<!--"square-o-top"end-->
			<div class="square-order">
				<table width="100%" border="1" cellpadding="0" cellspacing="0">
					<tr align="center"
						style="background:url(../../images/table_bg.gif) repeat-x;">
						<td width="10%" height="30">用户名</td>
						<td width="10%">真实姓名</td>
						<td width="5%">性别</td>
						<td width="12%">出生日期</td>
						<td width="10%">电话</td>
						<td width="12%">电子邮件</td>
						<td width="9%">所属部门</td>
						<td width="16%">最后登录时间</td>
						<td width="16%">操作</td>
					</tr>
					<c:forEach items="${emps}" var="emp">
					<tr align="center" bgcolor="#FFFFFF">
						<td width="13%" height="30">${emp.username }</td>
						<td>${emp.name }</td>
						<td>${emp.gender==1?'男':'女' }</td>
						<td>${emp.birthdayView}</td> 
						<td>${emp.tele }</td>
						<td>${emp.email }</td>
						<td>${emp.depName }</td><!-- ${emp.depName } -->
						<td>2014-5-12</td>
						
						<td>
							<img src="../../images/icon_3.gif" /> 
							<span style="line-height:12px; text-align:center;"> 
								<a href="${base }/login/toupdate.do?uuid=${emp.uuid}" class="xiu">修改</a>
							</span> 
							<img src="../../images/icon_04.gif" /> 
							<span style="line-height:12px; text-align:center;"> 
								<a href="javascript:void(0)" class="xiu" onclick="showMsg('是否删除该项数据？',${emp.uuid})">删除</a>
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
