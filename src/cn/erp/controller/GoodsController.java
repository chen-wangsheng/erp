package cn.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.erp.dto.GoodsDto;
import cn.erp.pojo.TblGoodstype;
import cn.erp.pojo.TblSupplier;
import cn.erp.service.GoodsService;
import cn.erp.service.GoodstypeService;
import cn.erp.service.SupplierService;

/**
 * 商品
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/goods")
public class GoodsController {

	@Autowired
	private SupplierService supplierService;
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private GoodstypeService goodstypeService;
	
	
	
	//到商品列表//待调整
	@RequestMapping(value="/goodsList.do")
	public String goodsList(ModelMap model,Long gysId,String name,String producer,String unit){
		List<TblSupplier> suppliers = supplierService.selAllSupplier();
		List<GoodsDto> goods = goodsService.selGoods(gysId,name,producer,unit);
		model.addAttribute("suppliers", suppliers);
		model.addAttribute("goods", goods);
		return "goods/list";
	}
	//到新增页面
	@RequestMapping(value="/toAddGoods.do")
	public String toAddGoods(ModelMap model){
		//获得所有供应商
		List<TblSupplier> supplierAll = supplierService.selAllSupplier();
		//获得所有商品类别
		List<TblGoodstype> goodstypeAll = goodstypeService.selAll();
		model.addAttribute("supplierAll", supplierAll);
		model.addAttribute("goodstypeAll", goodstypeAll);
		return "goods/input";
	}
	//新增前台页面需要改为供应商联动
	@RequestMapping(value="/addGoods.do")
	public String addGoods(Long supplier,Long goodstype,String name,String origin,String producer,String unit,
			Double inPrice,Double outPrice,Integer useNum){
		goodsService.addGoods(supplier,goodstype,name,origin,producer,unit,inPrice,outPrice,useNum);
		
		return "redirect:/goods/goodsList.do";
	}
	//到修改页面
	@RequestMapping(value="/toGoodsEdit.do")
	public String toGoodsEdit(ModelMap model,Long uuid){
		//所有供应商
		List<TblSupplier> supplierAll = supplierService.selAllSupplier();
		//所有商品类别
		List<TblGoodstype> goodstypeAll = goodstypeService.selAll();
		model.addAttribute("supplierAll", supplierAll);
		model.addAttribute("goodstypeAll", goodstypeAll);
		GoodsDto goods = goodsService.selGoodsById(uuid);
		model.addAttribute("goods", goods);
		return "goods/edit";
	}
	//修改//前台页面带调整
	@RequestMapping(value="/GoodsEdit.do")
	public String GoodsEdit(ModelMap model,Long supplier,Long goodstype,String name,String origin,String producer,String unit,
			Double inPrice,Double outPrice,Integer useNum,Long uuid){
		goodsService.updateGoods(supplier,goodstype,name,origin,producer,unit,inPrice,outPrice,useNum,uuid);
		return "redirect:/goods/goodsList.do";
	}
	
	
}
