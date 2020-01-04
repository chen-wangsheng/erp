package cn.erp.mappers;

import cn.erp.dto.OrderDetailDto;
import cn.erp.dto.OrderDto;
import cn.erp.dto.OrderNumPriceDto;
import cn.erp.dto.SelOrderByTimeAndCreaterDto;
import cn.erp.pojo.TblOrder;
import cn.erp.pojo.TblOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblOrderMapper {
    int countByExample(TblOrderExample example);

    int deleteByExample(TblOrderExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblOrder record);

    int insertSelective(TblOrder record);

    List<TblOrder> selectByExample(TblOrderExample example);

    TblOrder selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblOrder record, @Param("example") TblOrderExample example);

    int updateByExample(@Param("record") TblOrder record, @Param("example") TblOrderExample example);

    int updateByPrimaryKeySelective(TblOrder record);

    int updateByPrimaryKey(TblOrder record);
    /**
     * 根据订单编号返回订单数据
     */
    List<OrderDto> selOrderByOrderNum(@Param(value="uuid") Long uuid);
    /**@Param("name") String name,@Param("gysname") Long gysname
     * 根据条件动态查询
     */ 
    List<OrderDto> selOrder();
    /**
     * 根据订单id查询出订单详情
     */
    List<OrderDetailDto> selOrderDetailById(@Param(value="uuid") Long uuid);

    /**
     * 查询总数和单价
     * @param uuid
     * @return
     */
	List<OrderNumPriceDto> selNumAndPriceById(@Param(value="uuid")Long uuid);
    /**
     * 订单审核 列表根据下单时间 和下单人查询
     * @param zdrname
     * @param createtime
     * @param createtimeend
     * @return
     */
	List<SelOrderByTimeAndCreaterDto> selOrderByTimeAndCreater(@Param(value="zdrname")Long zdrname,@Param(value="createtime")Long createtime,@Param(value="createtimeend")Long createtimeend);
    
}
