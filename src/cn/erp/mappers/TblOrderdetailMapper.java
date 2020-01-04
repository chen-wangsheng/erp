package cn.erp.mappers;

import cn.erp.pojo.TblOrderdetail;
import cn.erp.pojo.TblOrderdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblOrderdetailMapper {
    int countByExample(TblOrderdetailExample example);

    int deleteByExample(TblOrderdetailExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblOrderdetail record);

    int insertSelective(TblOrderdetail record);

    List<TblOrderdetail> selectByExample(TblOrderdetailExample example);

    TblOrderdetail selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblOrderdetail record, @Param("example") TblOrderdetailExample example);

    int updateByExample(@Param("record") TblOrderdetail record, @Param("example") TblOrderdetailExample example);

    int updateByPrimaryKeySelective(TblOrderdetail record);

    int updateByPrimaryKey(TblOrderdetail record);
}