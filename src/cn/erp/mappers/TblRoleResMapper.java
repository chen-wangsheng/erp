package cn.erp.mappers;

import cn.erp.pojo.TblRoleRes;
import cn.erp.pojo.TblRoleResExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRoleResMapper {
    int countByExample(TblRoleResExample example);

    int deleteByExample(TblRoleResExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblRoleRes record);

    int insertSelective(TblRoleRes record);

    List<TblRoleRes> selectByExample(TblRoleResExample example);

    TblRoleRes selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblRoleRes record, @Param("example") TblRoleResExample example);

    int updateByExample(@Param("record") TblRoleRes record, @Param("example") TblRoleResExample example);

    int updateByPrimaryKeySelective(TblRoleRes record);

    int updateByPrimaryKey(TblRoleRes record);
}