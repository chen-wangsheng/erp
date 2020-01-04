package cn.erp.mappers;

import cn.erp.pojo.TblOperdetail;
import cn.erp.pojo.TblOperdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblOperdetailMapper {
    int countByExample(TblOperdetailExample example);

    int deleteByExample(TblOperdetailExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblOperdetail record);

    int insertSelective(TblOperdetail record);

    List<TblOperdetail> selectByExample(TblOperdetailExample example);

    TblOperdetail selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblOperdetail record, @Param("example") TblOperdetailExample example);

    int updateByExample(@Param("record") TblOperdetail record, @Param("example") TblOperdetailExample example);

    int updateByPrimaryKeySelective(TblOperdetail record);

    int updateByPrimaryKey(TblOperdetail record);
}