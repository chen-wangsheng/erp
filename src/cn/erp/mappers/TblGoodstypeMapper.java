package cn.erp.mappers;

import cn.erp.dto.GoodstypeDto;
import cn.erp.pojo.TblGoodstype;
import cn.erp.pojo.TblGoodstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblGoodstypeMapper {
    int countByExample(TblGoodstypeExample example);

    int deleteByExample(TblGoodstypeExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblGoodstype record);

    int insertSelective(TblGoodstype record);

    List<TblGoodstype> selectByExample(TblGoodstypeExample example);

    TblGoodstype selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblGoodstype record, @Param("example") TblGoodstypeExample example);

    int updateByExample(@Param("record") TblGoodstype record, @Param("example") TblGoodstypeExample example);

    int updateByPrimaryKeySelective(TblGoodstype record);

    int updateByPrimaryKey(TblGoodstype record);
    
   
    /**
     * 根据条件查询 
     * @param name
     * @param gysname
     * @return
     */
    List<GoodstypeDto> selGoodstype(@Param("name") String name,@Param("gysname") Long gysname);
    
    
}