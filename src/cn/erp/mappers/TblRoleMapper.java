package cn.erp.mappers;

import cn.erp.pojo.TblRole;
import cn.erp.pojo.TblRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRoleMapper {
    int countByExample(TblRoleExample example);

    int deleteByExample(TblRoleExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblRole record);

    int insertSelective(TblRole record);

    List<TblRole> selectByExample(TblRoleExample example);

    TblRole selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblRole record, @Param("example") TblRoleExample example);

    int updateByExample(@Param("record") TblRole record, @Param("example") TblRoleExample example);

    int updateByPrimaryKeySelective(TblRole record);

    int updateByPrimaryKey(TblRole record);
}