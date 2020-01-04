/*
Navicat MySQL Data Transfer

Source Server         : taotao
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : erps

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-06-27 21:32:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for c_category
-- ----------------------------
DROP TABLE IF EXISTS `c_category`;
CREATE TABLE `c_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) DEFAULT NULL COMMENT '上级id',
  `name` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '分类名称',
  `status` int(1) DEFAULT NULL COMMENT '状态',
  `has_child` int(1) DEFAULT NULL COMMENT '是否有子分类（0:否,1:是）',
  `sort` int(9) DEFAULT NULL COMMENT '排序id',
  `create_time` bigint(15) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of c_category
-- ----------------------------
INSERT INTO `c_category` VALUES ('17', '0', '家具', '1', '0', '0', null);
INSERT INTO `c_category` VALUES ('18', '17', '卧室', '1', '0', '0', null);
INSERT INTO `c_category` VALUES ('19', '18', '床', '1', '0', '0', null);
INSERT INTO `c_category` VALUES ('20', '18', '床头柜', '1', '0', '0', null);
INSERT INTO `c_category` VALUES ('21', '17', '客厅', '1', '0', '0', null);
INSERT INTO `c_category` VALUES ('22', '21', '沙发', '1', '0', '0', null);
INSERT INTO `c_category` VALUES ('25', '0', '厨具', '1', '0', '0', null);

-- ----------------------------
-- Table structure for tbl_dep
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dep`;
CREATE TABLE `tbl_dep` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `tele` varchar(30) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_dep
-- ----------------------------
INSERT INTO `tbl_dep` VALUES ('1', '总裁办', '8888');
INSERT INTO `tbl_dep` VALUES ('2', '采购部', '6668');
INSERT INTO `tbl_dep` VALUES ('3', '销售部', '6888');
INSERT INTO `tbl_dep` VALUES ('4', '运输中心', '3434');
INSERT INTO `tbl_dep` VALUES ('5', '库管中心', '5666');
INSERT INTO `tbl_dep` VALUES ('6', '人力资源', '1234');
INSERT INTO `tbl_dep` VALUES ('7', '财务部', '9999');
INSERT INTO `tbl_dep` VALUES ('13', '采购部', '6668');
INSERT INTO `tbl_dep` VALUES ('14', '采购部', '6668');
INSERT INTO `tbl_dep` VALUES ('15', '采购部', '6668');
INSERT INTO `tbl_dep` VALUES ('16', '采购部', '6668');
INSERT INTO `tbl_dep` VALUES ('17', '采购部', '6668');
INSERT INTO `tbl_dep` VALUES ('18', '采购部', '6668');
INSERT INTO `tbl_dep` VALUES ('19', '采购部', '6668');

-- ----------------------------
-- Table structure for tbl_emp
-- ----------------------------
DROP TABLE IF EXISTS `tbl_emp`;
CREATE TABLE `tbl_emp` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(15) NOT NULL,
  `pwd` varchar(32) NOT NULL,
  `name` varchar(28) NOT NULL,
  `email` varchar(255) NOT NULL,
  `tele` varchar(30) NOT NULL,
  `address` varchar(255) NOT NULL,
  `gender` int(1) NOT NULL COMMENT '1-男；0-女',
  `birthday` bigint(20) NOT NULL,
  `depUuid` bigint(20) NOT NULL,
  `roleId` bigint(20) DEFAULT NULL COMMENT 'lastLoginTime//改为角色Id//废除',
  `lastLoginIp` varchar(255) DEFAULT NULL,
  `logintimes` int(11) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_emp
-- ----------------------------
INSERT INTO `tbl_emp` VALUES ('6', 'admin', '21232f297a57a5a743894a0e4a801fc3', '赵云', 'admin@it.cn', '112233', '金燕龙1楼大厅', '1', '1263830400000', '1', '1423106985647', '0:0:0:0:0:0:0:1', '270');
INSERT INTO `tbl_emp` VALUES ('7', 'chengzheng', '202cb962ac59075b964b07152d234b70', '总裁', 'Qeeqe', 'q11213', 'q213', '0', '1420473600000', '1', '1422263312319', '-', '0');
INSERT INTO `tbl_emp` VALUES ('8', 'hr', '202cb962ac59075b964b07152d234b70', 'hr主管', 'hr@x.cn', '3232323', '金燕龙1楼大厅', '0', '1421164800000', '6', '1422516196593', '0:0:0:0:0:0:0:1', '4');
INSERT INTO `tbl_emp` VALUES ('9', 'hr2', '202cb962ac59075b964b07152d234b70', 'hr专员', 'hr2@it.cn', '3232323', '中腾建华3楼', '0', '1421683200000', '6', '1422516211656', '0:0:0:0:0:0:0:1', '3');
INSERT INTO `tbl_emp` VALUES ('11', 'test', '098f6bcd4621d373cade4e832627b4f6', 'test', 'test', 'test', 'test', '1', '1421164800000', '1', '1422848026718', '0:0:0:0:0:0:0:1', '3');
INSERT INTO `tbl_emp` VALUES ('12', 'jock', '202cb962ac59075b964b07152d234b70', '李老师', 'jock@it.cn', '15611386665', '北京', '1', '1422547200000', '6', '1422589659332', '192.168.40.184', '1');
INSERT INTO `tbl_emp` VALUES ('13', 'liulei', '202cb962ac59075b964b07152d234b70', '刘磊', 'liulei@qq.com', '010-110', '小莘庄', '0', '1421856000000', '1', '1422592663169', '-', '0');
INSERT INTO `tbl_emp` VALUES ('17', '张三', '111', '张三', '111', '111', '111张三', '1', '1476288000000', '8', null, null, null);
INSERT INTO `tbl_emp` VALUES ('19', '3', '3', '3', '3', '3', '3', '1', '1478620800000', '3', null, null, null);

-- ----------------------------
-- Table structure for tbl_emp_role
-- ----------------------------
DROP TABLE IF EXISTS `tbl_emp_role`;
CREATE TABLE `tbl_emp_role` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `empUuid` bigint(20) NOT NULL,
  `roleUuid` bigint(20) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_emp_role
-- ----------------------------
INSERT INTO `tbl_emp_role` VALUES ('12', '8', '8');
INSERT INTO `tbl_emp_role` VALUES ('13', '9', '9');
INSERT INTO `tbl_emp_role` VALUES ('18', '11', '7');
INSERT INTO `tbl_emp_role` VALUES ('19', '12', '8');
INSERT INTO `tbl_emp_role` VALUES ('20', '12', '3');
INSERT INTO `tbl_emp_role` VALUES ('21', '12', '2');
INSERT INTO `tbl_emp_role` VALUES ('22', '12', '9');
INSERT INTO `tbl_emp_role` VALUES ('23', '12', '5');
INSERT INTO `tbl_emp_role` VALUES ('24', '12', '4');
INSERT INTO `tbl_emp_role` VALUES ('25', '12', '6');
INSERT INTO `tbl_emp_role` VALUES ('26', '12', '1');
INSERT INTO `tbl_emp_role` VALUES ('27', '12', '7');
INSERT INTO `tbl_emp_role` VALUES ('37', '13', '8');
INSERT INTO `tbl_emp_role` VALUES ('38', '13', '6');
INSERT INTO `tbl_emp_role` VALUES ('39', '13', '4');
INSERT INTO `tbl_emp_role` VALUES ('40', '13', '7');
INSERT INTO `tbl_emp_role` VALUES ('41', '13', '5');
INSERT INTO `tbl_emp_role` VALUES ('42', '13', '3');
INSERT INTO `tbl_emp_role` VALUES ('43', '13', '9');
INSERT INTO `tbl_emp_role` VALUES ('44', '13', '2');
INSERT INTO `tbl_emp_role` VALUES ('45', '13', '1');
INSERT INTO `tbl_emp_role` VALUES ('46', '6', '1');
INSERT INTO `tbl_emp_role` VALUES ('47', '6', '8');
INSERT INTO `tbl_emp_role` VALUES ('48', '4', '3');
INSERT INTO `tbl_emp_role` VALUES ('49', '4', '5');
INSERT INTO `tbl_emp_role` VALUES ('50', '4', '6');
INSERT INTO `tbl_emp_role` VALUES ('51', '1', '8');
INSERT INTO `tbl_emp_role` VALUES ('52', '1', '9');
INSERT INTO `tbl_emp_role` VALUES ('53', '8', '7');
INSERT INTO `tbl_emp_role` VALUES ('54', '19', '1');
INSERT INTO `tbl_emp_role` VALUES ('55', '19', '2');

-- ----------------------------
-- Table structure for tbl_goods
-- ----------------------------
DROP TABLE IF EXISTS `tbl_goods`;
CREATE TABLE `tbl_goods` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `origin` varchar(30) DEFAULT NULL,
  `producer` varchar(30) DEFAULT NULL,
  `unit` varchar(30) DEFAULT NULL,
  `inPrice` double(10,2) DEFAULT NULL,
  `outPrice` double(10,2) DEFAULT NULL,
  `goodsTypeUuid` bigint(20) DEFAULT NULL,
  `useNum` int(11) DEFAULT NULL,
  `minNum` int(11) DEFAULT NULL,
  `maxNum` int(11) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_goods
-- ----------------------------
INSERT INTO `tbl_goods` VALUES ('1', '辣条(10g)', '四川', '成都辣条厂', '箱', '1.00', '11.00', '1', '6', '15', '100');
INSERT INTO `tbl_goods` VALUES ('2', '辣条(100g)', '四川', '四川辣条厂', '袋', '2.00', '22.00', '1', '5', '15', '100');
INSERT INTO `tbl_goods` VALUES ('3', '老干妈超辣', '四川', '老干妈家', '箱', '3.00', '33.00', '2', '5', '15', '100');
INSERT INTO `tbl_goods` VALUES ('4', '老干妈麻辣', '四川', '老干妈家', '箱', '4.00', '44.00', '2', '3', '15', '100');
INSERT INTO `tbl_goods` VALUES ('5', '老干妈BT辣', '四川', '老干妈家', '袋', '5.00', '55.00', '2', '1', '15', '100');
INSERT INTO `tbl_goods` VALUES ('6', '王致和臭豆腐', '四川', '王致和家', '箱', '6.00', '66.00', '3', '1', '15', '100');
INSERT INTO `tbl_goods` VALUES ('7', '罗技鼠标', '广东', '广东电子元件厂', '个', '7.00', '77.00', '5', '1', '15', '100');
INSERT INTO `tbl_goods` VALUES ('8', '散热器大', '广东', '广东电子元件厂', '个', '8.00', '88.00', '6', '1', '15', '100');
INSERT INTO `tbl_goods` VALUES ('9', '散热器中', '广东', '广东电子元件厂', '个', '9.00', '99.00', '6', '1', '15', '100');
INSERT INTO `tbl_goods` VALUES ('10', '麻辣鱼', '四川', '四川麻辣鱼长', '箱', '100.00', '200.00', '9', '5', null, null);
INSERT INTO `tbl_goods` VALUES ('11', '2', '2', '2', '2', '2.00', '2.00', '10', '2', null, null);

-- ----------------------------
-- Table structure for tbl_goodstype
-- ----------------------------
DROP TABLE IF EXISTS `tbl_goodstype`;
CREATE TABLE `tbl_goodstype` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `supplierUuid` bigint(20) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_goodstype
-- ----------------------------
INSERT INTO `tbl_goodstype` VALUES ('1', '辣条', '1');
INSERT INTO `tbl_goodstype` VALUES ('2', '老干妈辣酱', '1');
INSERT INTO `tbl_goodstype` VALUES ('3', '臭豆腐', '1');
INSERT INTO `tbl_goodstype` VALUES ('4', '薯片', '1');
INSERT INTO `tbl_goodstype` VALUES ('5', '鼠标', '2');
INSERT INTO `tbl_goodstype` VALUES ('6', '散热器', '2');
INSERT INTO `tbl_goodstype` VALUES ('7', '键盘', '2');
INSERT INTO `tbl_goodstype` VALUES ('8', '烤鸭', '3');
INSERT INTO `tbl_goodstype` VALUES ('9', '老干妈辣酱', '1');
INSERT INTO `tbl_goodstype` VALUES ('10', '老干妈辣酱', '2');

-- ----------------------------
-- Table structure for tbl_menu
-- ----------------------------
DROP TABLE IF EXISTS `tbl_menu`;
CREATE TABLE `tbl_menu` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `url` varchar(255) NOT NULL,
  `puuid` bigint(20) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=707 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_menu
-- ----------------------------
INSERT INTO `tbl_menu` VALUES ('1', '系统菜单', '-', '0');
INSERT INTO `tbl_menu` VALUES ('100', '商品管理', '-', '1');
INSERT INTO `tbl_menu` VALUES ('101', '供应商', 'supplier_list.action', '100');
INSERT INTO `tbl_menu` VALUES ('102', '商品类别', 'goodsType_list.action', '100');
INSERT INTO `tbl_menu` VALUES ('103', '商品', 'goods_list.action', '100');
INSERT INTO `tbl_menu` VALUES ('200', '采购管理', '-', '1');
INSERT INTO `tbl_menu` VALUES ('201', '采购订单', 'order_buyList.action', '200');
INSERT INTO `tbl_menu` VALUES ('202', '采购审核', 'order_buyCheckList.action', '200');
INSERT INTO `tbl_menu` VALUES ('300', '销售管理', '-', '1');
INSERT INTO `tbl_menu` VALUES ('400', '商品运输', '-', '1');
INSERT INTO `tbl_menu` VALUES ('401', '任务指派', 'transport_taskList.action', '400');
INSERT INTO `tbl_menu` VALUES ('402', '任务查询', 'transport_tasks.action', '400');
INSERT INTO `tbl_menu` VALUES ('500', '仓库管理', '-', '1');
INSERT INTO `tbl_menu` VALUES ('502', '入库', 'order_inStoreList.action', '500');
INSERT INTO `tbl_menu` VALUES ('600', '报表中心', '-', '1');
INSERT INTO `tbl_menu` VALUES ('601', '采购报表', 'bill_buyBillList.action', '600');
INSERT INTO `tbl_menu` VALUES ('700', '基础维护', '-', '1');
INSERT INTO `tbl_menu` VALUES ('701', '部门维护', 'dep_list.action', '700');
INSERT INTO `tbl_menu` VALUES ('702', '员工维护', 'emp_list.action', '700');
INSERT INTO `tbl_menu` VALUES ('703', '角色维护', 'role_list.action', '700');
INSERT INTO `tbl_menu` VALUES ('704', '资源维护', 'res_list.action', '700');
INSERT INTO `tbl_menu` VALUES ('705', '菜单维护', 'menu_list.action', '700');
INSERT INTO `tbl_menu` VALUES ('706', '仓库维护', 'store_list.action', '700');

-- ----------------------------
-- Table structure for tbl_operdetail
-- ----------------------------
DROP TABLE IF EXISTS `tbl_operdetail`;
CREATE TABLE `tbl_operdetail` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `empUuid` bigint(20) NOT NULL,
  `operTime` bigint(20) NOT NULL,
  `type` int(1) NOT NULL,
  `goodsUuid` bigint(20) NOT NULL,
  `storeUuid` bigint(20) NOT NULL,
  `num` int(11) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_operdetail
-- ----------------------------
INSERT INTO `tbl_operdetail` VALUES ('3', '6', '1422866275700', '1', '6', '1', '10');
INSERT INTO `tbl_operdetail` VALUES ('4', '6', '1422866286419', '1', '6', '1', '5');
INSERT INTO `tbl_operdetail` VALUES ('5', '6', '1422866312331', '1', '6', '3', '15');
INSERT INTO `tbl_operdetail` VALUES ('6', '6', '1422866557169', '1', '6', '3', '1');
INSERT INTO `tbl_operdetail` VALUES ('7', '6', '1422866562699', '1', '6', '2', '20');
INSERT INTO `tbl_operdetail` VALUES ('8', '6', '1422866565578', '1', '6', '2', '9');
INSERT INTO `tbl_operdetail` VALUES ('9', '6', '1422866659498', '1', '4', '1', '11');
INSERT INTO `tbl_operdetail` VALUES ('10', '6', '1422866662443', '1', '4', '2', '22');
INSERT INTO `tbl_operdetail` VALUES ('11', '6', '1422866665416', '1', '4', '1', '7');
INSERT INTO `tbl_operdetail` VALUES ('12', '6', '1422866717019', '1', '1', '1', '9');
INSERT INTO `tbl_operdetail` VALUES ('13', '6', '1422866729350', '1', '2', '1', '20');
INSERT INTO `tbl_operdetail` VALUES ('14', '6', '1422866730517', '1', '3', '1', '30');
INSERT INTO `tbl_operdetail` VALUES ('15', '6', '1422866731719', '1', '5', '1', '50');
INSERT INTO `tbl_operdetail` VALUES ('16', '6', '1422866733506', '1', '1', '1', '1');
INSERT INTO `tbl_operdetail` VALUES ('17', '6', '1422866984562', '1', '8', '1', '10');
INSERT INTO `tbl_operdetail` VALUES ('18', '6', '1422866986220', '1', '9', '1', '10');
INSERT INTO `tbl_operdetail` VALUES ('19', '6', '1422866987843', '1', '7', '1', '10');
INSERT INTO `tbl_operdetail` VALUES ('20', '6', '1422867363860', '1', '8', '1', '10');
INSERT INTO `tbl_operdetail` VALUES ('21', '6', '1422867365146', '1', '9', '1', '10');
INSERT INTO `tbl_operdetail` VALUES ('22', '6', '1422867366359', '1', '7', '1', '10');
INSERT INTO `tbl_operdetail` VALUES ('23', '6', '1422867375121', '1', '6', '1', '60');
INSERT INTO `tbl_operdetail` VALUES ('24', '6', '1422867376618', '1', '4', '1', '40');
INSERT INTO `tbl_operdetail` VALUES ('25', '6', '1422867377750', '1', '1', '1', '10');
INSERT INTO `tbl_operdetail` VALUES ('26', '6', '1422867378917', '1', '5', '1', '50');

-- ----------------------------
-- Table structure for tbl_order
-- ----------------------------
DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE `tbl_order` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `orderNum` varchar(30) NOT NULL,
  `creater` bigint(20) NOT NULL,
  `createTime` bigint(20) NOT NULL,
  `checker` bigint(20) DEFAULT NULL,
  `checkTime` bigint(20) DEFAULT NULL,
  `completer` bigint(20) DEFAULT NULL COMMENT '跟单人',
  `endTime` bigint(20) DEFAULT NULL,
  `orderType` int(1) NOT NULL,
  `type` int(3) NOT NULL,
  `totalNum` int(11) NOT NULL,
  `totalPrice` double(10,2) NOT NULL,
  `supplierUuid` bigint(20) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_order
-- ----------------------------
INSERT INTO `tbl_order` VALUES ('1', '37F4489A1', '6', '1422782442006', '7', '1422843573782', null, null, '1', '121', '4', '10.00', '1');
INSERT INTO `tbl_order` VALUES ('2', '37F4489A2', '6', '1422782485205', '6', '1422842391025', '6', '1422867366361', '1', '199', '30', '240.00', '2');
INSERT INTO `tbl_order` VALUES ('3', '37F4489A3', '6', '1422782578170', '6', '1422843576079', '11', null, '1', '131', '4', '10.00', '1');
INSERT INTO `tbl_order` VALUES ('4', '37F4489A4', '6', '1422782748231', null, null, null, null, '1', '111', '3', '6.00', '1');
INSERT INTO `tbl_order` VALUES ('5', '37F4489A5', '6', '1422783740701', '6', '1422842081560', null, null, '1', '120', '3', '6.00', '1');
INSERT INTO `tbl_order` VALUES ('6', '37F4489A6', '6', '1422784607857', '6', '1422841477118', '6', null, '1', '141', '210', '910.00', '1');
INSERT INTO `tbl_order` VALUES ('7', '37F461041', '6', '1422848864081', '6', '1422848869769', '6', null, '1', '131', '1', '1.00', '1');

-- ----------------------------
-- Table structure for tbl_orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `tbl_orderdetail`;
CREATE TABLE `tbl_orderdetail` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `goodsUuid` bigint(20) NOT NULL,
  `price` double(10,2) NOT NULL,
  `orderUuid` bigint(20) NOT NULL,
  `num` int(11) NOT NULL COMMENT '订单数量',
  `surplus` int(11) NOT NULL COMMENT '剩余',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_orderdetail
-- ----------------------------
INSERT INTO `tbl_orderdetail` VALUES ('1', '4', '4.00', '1', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('2', '2', '2.00', '1', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('3', '1', '1.00', '1', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('4', '3', '3.00', '1', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('5', '8', '8.00', '2', '10', '0');
INSERT INTO `tbl_orderdetail` VALUES ('6', '9', '9.00', '2', '10', '0');
INSERT INTO `tbl_orderdetail` VALUES ('7', '7', '7.00', '2', '10', '0');
INSERT INTO `tbl_orderdetail` VALUES ('8', '2', '2.00', '3', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('9', '3', '3.00', '3', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('10', '1', '1.00', '3', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('11', '4', '4.00', '3', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('12', '2', '2.00', '4', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('13', '3', '3.00', '4', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('14', '1', '1.00', '4', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('15', '1', '1.00', '5', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('16', '3', '3.00', '5', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('17', '2', '2.00', '5', '1', '1');
INSERT INTO `tbl_orderdetail` VALUES ('18', '6', '6.00', '6', '60', '0');
INSERT INTO `tbl_orderdetail` VALUES ('19', '4', '4.00', '6', '40', '0');
INSERT INTO `tbl_orderdetail` VALUES ('20', '1', '1.00', '6', '10', '0');
INSERT INTO `tbl_orderdetail` VALUES ('21', '5', '5.00', '6', '50', '0');
INSERT INTO `tbl_orderdetail` VALUES ('22', '3', '3.00', '6', '30', '30');
INSERT INTO `tbl_orderdetail` VALUES ('23', '2', '2.00', '6', '20', '20');
INSERT INTO `tbl_orderdetail` VALUES ('24', '1', '1.00', '7', '1', '1');

-- ----------------------------
-- Table structure for tbl_res
-- ----------------------------
DROP TABLE IF EXISTS `tbl_res`;
CREATE TABLE `tbl_res` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `url` varchar(255) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_res
-- ----------------------------
INSERT INTO `tbl_res` VALUES ('1', '员工列表', 'cn.itcast.erp.auth.emp.web.EmpAction.list');
INSERT INTO `tbl_res` VALUES ('2', '操作添加/修改员工', 'cn.itcast.erp.auth.emp.web.EmpAction.input');
INSERT INTO `tbl_res` VALUES ('3', '添加/修改员工', 'cn.itcast.erp.auth.emp.web.EmpAction.save');
INSERT INTO `tbl_res` VALUES ('4', '删除员工', 'cn.itcast.erp.auth.emp.web.EmpAction.delete');

-- ----------------------------
-- Table structure for tbl_role
-- ----------------------------
DROP TABLE IF EXISTS `tbl_role`;
CREATE TABLE `tbl_role` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `code` varchar(30) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_role
-- ----------------------------
INSERT INTO `tbl_role` VALUES ('1', '系统管理员', 'admin');
INSERT INTO `tbl_role` VALUES ('2', '采购主管', 'buymgr');
INSERT INTO `tbl_role` VALUES ('3', '采购专员', 'buyer');
INSERT INTO `tbl_role` VALUES ('4', '销售主管', 'salemgr');
INSERT INTO `tbl_role` VALUES ('5', '销售专员', 'saler');
INSERT INTO `tbl_role` VALUES ('6', '跟单员', 'follower');
INSERT INTO `tbl_role` VALUES ('7', '仓库管理员', 'storemgr');
INSERT INTO `tbl_role` VALUES ('8', '人力资源总监', 'hrmgr');
INSERT INTO `tbl_role` VALUES ('9', '人力资源专员', 'hr');

-- ----------------------------
-- Table structure for tbl_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `tbl_role_menu`;
CREATE TABLE `tbl_role_menu` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `roleUuid` bigint(20) NOT NULL,
  `menuUuid` bigint(20) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_role_menu
-- ----------------------------
INSERT INTO `tbl_role_menu` VALUES ('14', '1', '600');
INSERT INTO `tbl_role_menu` VALUES ('15', '1', '701');
INSERT INTO `tbl_role_menu` VALUES ('16', '1', '700');
INSERT INTO `tbl_role_menu` VALUES ('17', '1', '100');
INSERT INTO `tbl_role_menu` VALUES ('18', '1', '103');
INSERT INTO `tbl_role_menu` VALUES ('19', '1', '201');
INSERT INTO `tbl_role_menu` VALUES ('20', '1', '705');
INSERT INTO `tbl_role_menu` VALUES ('21', '1', '400');
INSERT INTO `tbl_role_menu` VALUES ('22', '1', '702');
INSERT INTO `tbl_role_menu` VALUES ('23', '1', '704');
INSERT INTO `tbl_role_menu` VALUES ('24', '1', '200');
INSERT INTO `tbl_role_menu` VALUES ('25', '1', '102');
INSERT INTO `tbl_role_menu` VALUES ('26', '1', '703');
INSERT INTO `tbl_role_menu` VALUES ('27', '1', '101');
INSERT INTO `tbl_role_menu` VALUES ('28', '1', '1');
INSERT INTO `tbl_role_menu` VALUES ('29', '1', '300');
INSERT INTO `tbl_role_menu` VALUES ('30', '1', '500');
INSERT INTO `tbl_role_menu` VALUES ('31', '8', '703');
INSERT INTO `tbl_role_menu` VALUES ('32', '8', '704');
INSERT INTO `tbl_role_menu` VALUES ('33', '8', '1');
INSERT INTO `tbl_role_menu` VALUES ('34', '8', '702');
INSERT INTO `tbl_role_menu` VALUES ('35', '8', '701');
INSERT INTO `tbl_role_menu` VALUES ('36', '8', '700');
INSERT INTO `tbl_role_menu` VALUES ('37', '9', '1');
INSERT INTO `tbl_role_menu` VALUES ('38', '9', '702');
INSERT INTO `tbl_role_menu` VALUES ('39', '9', '700');
INSERT INTO `tbl_role_menu` VALUES ('52', '7', '101');
INSERT INTO `tbl_role_menu` VALUES ('53', '7', '102');
INSERT INTO `tbl_role_menu` VALUES ('54', '7', '1');
INSERT INTO `tbl_role_menu` VALUES ('55', '7', '100');
INSERT INTO `tbl_role_menu` VALUES ('56', '1', '202');
INSERT INTO `tbl_role_menu` VALUES ('57', '1', '401');
INSERT INTO `tbl_role_menu` VALUES ('58', '1', '402');
INSERT INTO `tbl_role_menu` VALUES ('59', '1', '706');
INSERT INTO `tbl_role_menu` VALUES ('60', '1', '502');
INSERT INTO `tbl_role_menu` VALUES ('61', '1', '601');

-- ----------------------------
-- Table structure for tbl_role_res
-- ----------------------------
DROP TABLE IF EXISTS `tbl_role_res`;
CREATE TABLE `tbl_role_res` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `roleUuid` bigint(20) NOT NULL,
  `resUuid` bigint(20) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_role_res
-- ----------------------------
INSERT INTO `tbl_role_res` VALUES ('13', '1', '4');
INSERT INTO `tbl_role_res` VALUES ('14', '1', '2');
INSERT INTO `tbl_role_res` VALUES ('15', '1', '3');
INSERT INTO `tbl_role_res` VALUES ('16', '1', '1');
INSERT INTO `tbl_role_res` VALUES ('17', '8', '1');
INSERT INTO `tbl_role_res` VALUES ('18', '8', '2');
INSERT INTO `tbl_role_res` VALUES ('19', '8', '3');
INSERT INTO `tbl_role_res` VALUES ('20', '9', '1');

-- ----------------------------
-- Table structure for tbl_store
-- ----------------------------
DROP TABLE IF EXISTS `tbl_store`;
CREATE TABLE `tbl_store` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `empUuid` bigint(20) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_store
-- ----------------------------
INSERT INTO `tbl_store` VALUES ('1', '服装仓库', '北京市海淀区1号', '6');
INSERT INTO `tbl_store` VALUES ('2', '食品仓库', '北京市', '6');
INSERT INTO `tbl_store` VALUES ('3', '3#冷库', '中腾建华1楼', '6');
INSERT INTO `tbl_store` VALUES ('4', '4#冷库', '中关村大街鼎好大厦3楼', '6');
INSERT INTO `tbl_store` VALUES ('5', '1号仓库', '华阳', '17');
INSERT INTO `tbl_store` VALUES ('6', 'rrrtttt', 'rrt', '17');

-- ----------------------------
-- Table structure for tbl_storedetail
-- ----------------------------
DROP TABLE IF EXISTS `tbl_storedetail`;
CREATE TABLE `tbl_storedetail` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `storeUuid` bigint(20) NOT NULL,
  `goodsUuid` bigint(20) NOT NULL,
  `num` int(11) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_storedetail
-- ----------------------------
INSERT INTO `tbl_storedetail` VALUES ('1', '1', '6', '75');
INSERT INTO `tbl_storedetail` VALUES ('2', '3', '6', '16');
INSERT INTO `tbl_storedetail` VALUES ('3', '2', '6', '29');
INSERT INTO `tbl_storedetail` VALUES ('4', '1', '4', '58');
INSERT INTO `tbl_storedetail` VALUES ('5', '2', '4', '22');
INSERT INTO `tbl_storedetail` VALUES ('6', '1', '1', '22');
INSERT INTO `tbl_storedetail` VALUES ('7', '1', '2', '14');
INSERT INTO `tbl_storedetail` VALUES ('8', '1', '3', '30');
INSERT INTO `tbl_storedetail` VALUES ('9', '1', '5', '100');
INSERT INTO `tbl_storedetail` VALUES ('10', '1', '8', '17');
INSERT INTO `tbl_storedetail` VALUES ('11', '1', '9', '20');
INSERT INTO `tbl_storedetail` VALUES ('12', '1', '7', '11');

-- ----------------------------
-- Table structure for tbl_supplier
-- ----------------------------
DROP TABLE IF EXISTS `tbl_supplier`;
CREATE TABLE `tbl_supplier` (
  `uuid` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `contact` varchar(30) NOT NULL,
  `tele` varchar(30) NOT NULL,
  `needs` int(1) NOT NULL COMMENT '1送货自提0',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_supplier
-- ----------------------------
INSERT INTO `tbl_supplier` VALUES ('1', '成都小食品批发总公司', '成都辣条街1号', '王辣条', '11111111', '1');
INSERT INTO `tbl_supplier` VALUES ('2', '中关村鼎好302号摊', '中关村大街鼎好大厦3楼', '刘电脑', '88888888', '0');
INSERT INTO `tbl_supplier` VALUES ('3', '北京特产批发总公司', '北京王府井大街4号', '赵特产', '89898989', '1');
INSERT INTO `tbl_supplier` VALUES ('4', '中腾建华楼下小卖店', '中腾建华1楼', '老王头', '12345678', '1');
INSERT INTO `tbl_supplier` VALUES ('5', 'eeeee2', '1112', 'e2', '111', '1');
INSERT INTO `tbl_supplier` VALUES ('20', '778', '78', '78', '7', '1');
INSERT INTO `tbl_supplier` VALUES ('21', '1', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `uuid` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
