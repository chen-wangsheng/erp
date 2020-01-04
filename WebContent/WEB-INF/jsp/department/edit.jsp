<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/jquery-1.8.3.js"></script>
<script type="text/javascript">
$(function() {
	 //alert("1");
	/* $("#commit").click(function() {
		$("form:first").submit();
	}); */
});  
	
	 function save(){
		var rs=false;
		var name=$("#name").val();
		alert(name)
		if(!name || !$("#tele").val() ){
			
			alert("请输入完整!");
			return false;
		}else{
			rs=true;
		}
		if(rs){
			$("#saves").submit();
		}
	}
	

	//重置
	function reloads(){
		window.location.reload();
	}
	
	function quit(){
		alert("1")
		window.location.href='/dep/quit.do';
	}
	//修改
	function update(){
		var url="/dep/updatedep.do";
		
		/* $.post(url,params,function(data){
			if(data ==){}
		}"json") */
		
	}
	
</script>
  <html>
 <body>
 	
	<div class="content-right">
	<div class="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span class="page_title">部门管理</span>
		</div>
	</div>
	<div class="content-text">
		<div class="square-order">
			<form action="${base }/dep/updatedep.do" method="post" id="saves">
			<input type="hidden" name="uuid" value="${dep.uuid }">
  			<div style="border:1px solid #cecece;">
				<table width="100%"  border="0" cellpadding="0" cellspacing="0">
				  <tr bgcolor="#FFFFFF">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table width="100%"  border="0" cellpadding="0" cellspacing="0">
				    <tr  bgcolor="#FFFFFF">
				      <td width="18%" height="30" align="center"  >部门名称</td>
				      <td width="32%">
				      	<input type="text" size="25" name="name" id="name" value="${dep.name }"/>
				      </td>
				      <td width="18%" align="center">电话</td>
				      <td width="32%">
				      	<input type="text" size="25" name="tele" id="tele" value="${dep.tele }"/>
				      </td>
				    </tr>
				    <tr  bgcolor="#FFFFFF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				</table>
				
			</div>
			<div class="order-botton">
				<div style="margin:1px auto auto 1px;">
					<table width="100%"  border="0" cellpadding="0" cellspacing="0">
					  <tr>
					    <td>
					    	<a href="javascript:save();" id="commit"><img src="../../images/order_tuo.gif" border="0" /></a>
					    </td>
					    <td>&nbsp;</td>
					    <td><a href="javascript:reloads()"><img src="../../images/order_tuo.gif" border="0" /></a></td>
					    <td>&nbsp;</td>
					    <td><a href="javascript:quit()"><img src="../../images/order_tuo.gif" border="0" /></a></td>
					  </tr>
					</table>
				</div>
			</div>
			</form>
		</div><!--"square-order"end-->
	</div><!--"content-text"end-->
	<div class="content-bbg"><img src="../../images/content_bbg.jpg" /></div>
</div>
</body>
<script type="text/javascript">

</script>
 </html>
