<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="../../js/Calendar.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="100%"  border="0" cellpadding="0" cellspacing="0">
				    <tr  bgcolor="#FFFFFF">
				      <td width="18%" height="30" align="center">用&nbsp;户&nbsp;名</td>
				      <td width="32%">
				      	<input type="text" size="25"/>
				      </td>
				      <td width="18%"align="center">真实姓名</td>
				      <td width="32%">
				      	<input type="text" size="25"/>
					  </td>
				    </tr>
				    <tr bgcolor="#FFFFFF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr  bgcolor="#FFFFFF">
				      <td align="center">密&nbsp;&nbsp;&nbsp;&nbsp;码</td>
				      <td>
				      	<input type="text" size="25"/>
				      </td>
				      <td  align="center">确认密码</td>
				      <td >
				      	<input type="text" size="25"/>
				      </td>
				    </tr>
				     <tr bgcolor="#FFFFFF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr  bgcolor="#FFFFFF">
				      <td height="30" align="center">电子邮箱</td>
				      <td>
				      	<input type="text" size="25"/>
				      <td align="center">电话号码</td>
				      <td>
				      	<input type="text" size="25"/>
					  </td>
				     </tr>
				      <tr bgcolor="#FFFFFF">
					  <td colspan="4">&nbsp;</td>
					</tr>
				    <tr  bgcolor="#FFFFFF">
				      <td height="30" align="center">性&nbsp;&nbsp;&nbsp;&nbsp;别</td>
				      <td>
				      	<select style="width:190px">
								<option value="-1">----请-选-择----</option>
								<option value="1">男</option>
								<option value="0">女</option>
							</select>
					  </td>
				      <td align="center">地&nbsp;&nbsp;&nbsp;&nbsp;址</td>
				      <td>
				      	<input type="text" size="25"/>
					  </td>
				    </tr>
				     <tr bgcolor="#FFFFFF">
					  <td colspan="4">&nbsp;</td>
					</tr>
					
				    <tr  bgcolor="#FFFFFF">
				      <td height="30" align="center">出生日期</td>
				      <td>
				      	<input type="text" size="25" onfocus="c.showMoreDay=false;c.show(this);" readonly="true"/>
					  </td>
				      <td align="center">所属部门</td>
				      <td>
				      	<select style="width:190px">
							<option value="-1">----请-选-择----</option>
							<option value="1">销售部</option>
							<option value="2">采购部</option>
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
				      	<input type="checkbox">经理
				      	<input type="checkbox">主管
				      	<input type="checkbox">员工
				      	<input type="checkbox">经理
				      	<input type="checkbox">主管
				      	<input type="checkbox">员工
				      	<input type="checkbox">经理
				      	<input type="checkbox">主管
				      	<input type="checkbox">员工
				      </td>
				    </tr>
				    <tr  bgcolor="#FFFFFF">
				      <td colspan="4">&nbsp;</td>
				    </tr>
				</table>

</body>
</html>