package cn.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.erp.dto.GoodsTransportDto;
import cn.erp.dto.GoodsTymeNameAndGoodsName;
import cn.erp.dto.InfoByOrderuuid;
import cn.erp.dto.SupplierByNeedsDto;
import cn.erp.pojo.TblEmp;
import cn.erp.pojo.TblSupplier;
import cn.erp.service.EmpService;
import cn.erp.service.GoodsService;
import cn.erp.service.GoodstypeService;
import cn.erp.service.SupplierService;

/**
 * 商品运输
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/goodsTransport")
public class GoodsTransportController {

	@Autowired
	private SupplierService supplierService;
	@Autowired
	private GoodstypeService goodstypeService;
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private EmpService empService;
		
		
		//运输任务指派列表//待添加列表查询
	@RequestMapping(value="/index.do")
	public String index(ModelMap map){
		//查询出所有供应商	
		List<TblSupplier> suppliers = supplierService.selAllSupplier();
		map.addAttribute("suppliers", suppliers);
		//运输任务指派列表
		List<GoodsTransportDto> goodsTransportDtos=goodsService.selRenwuZhipaiLiebiao();
		map.addAttribute("goodsTransportDtos", goodsTransportDtos);
			return "order/transport/list";
		}
		
		//指派任务
		@RequestMapping(value="/assignTask.do")
		public String task(ModelMap map,Long orderuuid){
			//System.err.println("是大多数的实打实的所说的。。。。。。。。。。。。。。。。。。。。。。。。。");
			
			//商品类别name，商品name//单据明细
			List<GoodsTymeNameAndGoodsName> goods = goodsService.selGoodsTymeNameAndGoodsName(orderuuid);
			map.addAttribute("goods", goods);
			List<TblEmp> emps = empService.getAllEmp();
			map.addAttribute("emps", emps);
			return "order/transport/assignTask";
		}
		
		//保存派单搁置
		/*@RequestMapping(value="/savePaiDan.do")
		public String savePaiDan(Long orderuuid){
			
			
		}*/
		
		
		
		//运输任务查询,uuid供应商uuid
	@RequestMapping(value="/goodsTransportQuery.do")
	public String query(Long uuid,Integer needs,ModelMap model){
			//
		List<TblSupplier> sup = supplierService.selAllSupplier();
		model.addAttribute("sup", sup);
		
		List<SupplierByNeedsDto> Suppliers=goodsService.selSupplierByNeeds(uuid,needs);
		model.addAttribute("Suppliers", Suppliers);
		
			return "order/transport/tasks";
		}
	
	//到任务详情
	@RequestMapping(value="/taskDetail.do")
	public String taskDetail(Long orderuuid,ModelMap model){
		List<InfoByOrderuuid> infos = goodsService.selInfoByOrderuuid(orderuuid);
		InfoByOrderuuid info = null;
		if(infos != null){
			 info = infos.get(0);
		}
		//任务详情订单明细
		List<GoodsTymeNameAndGoodsName> goodsinfos = goodsService.selGoodsTymeNameAndGoodsName(orderuuid);
		model.addAttribute("goodsinfos", goodsinfos);
		
		model.addAttribute("info", info);
		model.addAttribute("orderuuid", orderuuid);
		return "order/transport/taskDetail";
	}
	
	//结单
	
	
	
		
}
