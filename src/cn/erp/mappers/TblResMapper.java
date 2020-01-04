package cn.erp.mappers;

import cn.erp.pojo.TblRes;
import cn.erp.pojo.TblResExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblResMapper {
    int countByExample(TblResExample example);

    int deleteByExample(TblResExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblRes record);

    int insertSelective(TblRes record);

    List<TblRes> selectByExample(TblResExample example);

    TblRes selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblRes record, @Param("example") TblResExample example);

    int updateByExample(@Param("record") TblRes record, @Param("example") TblResExample example);

    int updateByPrimaryKeySelective(TblRes record);

    int updateByPrimaryKey(TblRes record);
}