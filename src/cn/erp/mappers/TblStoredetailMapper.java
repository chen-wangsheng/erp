package cn.erp.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.erp.dto.OperDetailsDto;
import cn.erp.pojo.TblStoredetail;
import cn.erp.pojo.TblStoredetailExample;

public interface TblStoredetailMapper {
    int countByExample(TblStoredetailExample example);

    int deleteByExample(TblStoredetailExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblStoredetail record);

    int insertSelective(TblStoredetail record);

    List<TblStoredetail> selectByExample(TblStoredetailExample example);

    TblStoredetail selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblStoredetail record, @Param("example") TblStoredetailExample example);

    int updateByExample(@Param("record") TblStoredetail record, @Param("example") TblStoredetailExample example);

    int updateByPrimaryKeySelective(TblStoredetail record);

    int updateByPrimaryKey(TblStoredetail record);
    /**
     * selOperDetails
     * 操作详情条件仓库name，操作类别，操作时间，操作人，货物名称 
     */
    List<OperDetailsDto> selOperDetails(@Param("ckname")String ckname,@Param("cztype")Integer cztype,
    		@Param("starttime")Long starttime,@Param("endtime")Long endtime,@Param("empuuid")Long empuuid,@Param("goodsname")String goodsname);
}