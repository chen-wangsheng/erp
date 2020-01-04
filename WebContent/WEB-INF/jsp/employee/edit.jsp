<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<link href="../../css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../../js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="../../js/Calendar.js"></script>
<script type="text/javascript">
	$(function() {
		$("#all").click(function() {
			$("[name=roleId]:checkbox").attr("checked",$("#all").attr("checked")=="checked");
		});
		$("#reverse").click(function() {
			$("[name=roleId]:checkbox").each(function () {
                $(this).attr("checked", !$(this).attr("checked"));
            });

		});
		//回现
		$('option').each(function (i,l) {
         //alert(l);
            if($(l).val()==$('#gender').val()){
                $(l).attr('selected','selected')
            }
         	 var depname=$("#depname").val()
            if($(l).val()==depname){
                $(l).attr('selected','selected')
            }
        })
       
        
        
		//role回现
        //<c:forEach items="${rolist}" var="list">   
		//var r="${list.jueseid}"; 
		//alert(r)
		//</c:forEach>  
		//var objArray=new Array(); 
		//objArray.push(r)
		//alert(objArray.pop());
		 //for (var i = 0; i < objArray.length; i++) {
	        //alert(i+":"+objArray[i]);
	        /* if(objArray[i]==$('input[name="roleId"]')){
	        	
	        } */
	    //}; 
		
	    $('input[name="roleId"]').each(function(i,l){
        	for(var j = 0; j < objArray.length; j++){
        		if($(l).val()==objArray[j]){
        			$(l).attr('selected','selected')
        		}
        	}
        });
		
		/*  r.each(function(i,l){
			if($(l).val()==$('input[name="roleId"]').val()){
				//$(l).attr('selected','selected')
			}
		});  */ 
		
		/* r.each(function(i,l){
			if($(l).val()==$('input[name="roleId"]')){
				$(l).attr('selected','selected')
			}
		}); */
		
		
	});
	
	function submit(){
		//alert("1")
		var result=false;
		var sel=$("#sel").val();//部门
		var sex=$("#sex").val();//性别
		alert(sex)
		var address=$("#address").val()
		var birthday=$("#birthday").val();//出生日期
		//alert(birthday);
		if(!$("#username").val && !$("#name").val && !$("#pwd").val && !$("#checkpwd").val && !$("#email").val && !$("#tele").val && !sel &&!sex && !address && !birthday){
			alert("请输入完整信息！");
			return false;
		}else{
			result=true;
		}
		
		if(result){
			$("#genderID").val(sex)
			$("#dep").val(sel)
			$("#save").submit();
		}
	}
	
	//重置
	function reloads(){
		window.location.reload();
	}
	
	function quit(){
		//alert("1")
		window.location.href='/login/quit.do';
	}
	
	
	
	
</script>
<%-- <c:forEach items='${requestScope.groupVideoinfo.rolist}' var='r'><c:if test="${role.uuid == r.jueseid}">checked</c:if></c:forEach> --%>
<input type="hidden" id="gender" value="${info.gender }">
<input type="hidden" id="depname" value="${info.depuuid }">
<!-- <input type="" id="depname" value=""> -->
<div class="content-right">
	<div class="content-r-pic_w">
		<div style="margin:8px auto auto 12px;margin-top:6px">
			<span class="page_title">员工管理</span>
		</div>
	</div>
	<div class="content-text">
		<div class="square-order">
			<form action="${base }/login/update.do" method="post" id="save"> 
			<input type="" name="uuid" value="${info.uuid }">
			<input type="hidden" name="gender" id="genderID" value="">
			<input type="hidden" name="depId" id="dep" value="">
  			<div style="border:1px solid #cecece;">
				<table width="100%"  border="0" cellpadding="0" cellspacing="0">
				  <tr bgcolor="#FFFFFF">
				    <td>&nbsp;</td>
				  </tr>
				</table>
				<table width="100%"  border="0" cellpadding="0" cellspacing="0">
				    <tr  bgcolor="#FFFFFF">
				      <td width="18%" height="30" align="center">用&nbsp;户&nbsp;名</td>
				      <td width="32%">
				      	<input type="text" size="25" name="username" id="username" value="${info.username }"/>
				      </td>
				      <td width="18%"align="center">真实姓名</td>
				      <td width="32%">
				      	<input type="text" size="25" name="name" id="name" value="${info.name }"/>
					  </td>
				    </tr>
				    <tr bgcolor="#FFFFFF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr  bgcolor="#FFFFFF">
				      <td align="center">密&nbsp;&nbsp;&nbsp;&nbsp;码</td>
				      <td>
				      	<input type="text" size="25" name="pwd" id="pwd"/>
				      </td>
				      <td  align="center">确认密码</td>
				      <td >
				      	<input type="text" size="25" name="checkpwd" id="checkpwd"/>
				      </td>
				    </tr>
				     <tr bgcolor="#FFFFFF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr  bgcolor="#FFFFFF">
				      <td height="30" align="center">电子邮箱</td>
				      <td>
				      	<input type="text" size="25" name="email" id="email" value="${info.email }"/>
				      <td align="center">电话号码</td>
				      <td>
				      	<input type="text" size="25" name="tele" id="tele" value="${info.tele }"/>
					  </td>
				     </tr>
				      <tr bgcolor="#FFFFFF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr  bgcolor="#FFFFFF">
				      <td height="30" align="center">性&nbsp;&nbsp;&nbsp;&nbsp;别</td>
				      <td>
				      	<select style="width:190px" id="sex">
								<option>----请-选-择----</option>
								<option value="1">男</option>
								<option value="0">女</option>
							</select>
					  </td>
				      <td align="center">地&nbsp;&nbsp;&nbsp;&nbsp;址</td>
				      <td>
				      	<input type="text" size="25" name="address" id="address" value="${info.address }"/>
					  </td>
				    </tr>
				     <tr bgcolor="#FFFFFF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr  bgcolor="#FFFFFF">
				      <td height="30" align="center">出生日期</td>
				      <td>
				      	<input type="text" size="25" onfocus="c.showMoreDay=false;c.show(this);" readonly="true" name="birthday" id="birthday" value="${info.birthdayView}"/>
					  </td>
				      <td align="center">所属部门</td>
				      <td>
				      	<select style="width:190px" id="sel">
							<option>----请-选-择----</option>
							<!-- <option value="1">销售部</option> -->
							<c:forEach items="${deps}" var="d">
							<option id="de" value="${d.uuid }"  >${d.name }</option>
							</c:forEach>
							
							
						</select>
					  </td>
				    </tr>
				    <tr  bgcolor="#FFFFFF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				    <tr  bgcolor="#FFFFFF">
				      <td width="18%" height="30" align="center">角色名称</td>
				      <td width="82%" colspan="3">
				      	<input type="checkbox" id="all">全选&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				      	<input type="checkbox" id="reverse">反选
				      </td>
				    </tr>
				    <tr  bgcolor="#FFFFFF">
				      <td width="18%" height="30" align="center">&nbsp;</td>
				      <td width="82%" colspan="3">
				      	
				      	<c:forEach items="${roles}" var="role">
				      	<input type="checkbox" name="roleId"
				      	
				      	 value="${role.uuid }"/>${role.name }
				      	</c:forEach>
				      	
				      	
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
					    	<!-- 保存 -->
					    	<a href="javascript:submit()"><img src="../../images/order_tuo.gif" border="0" /></a>
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
