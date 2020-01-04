package cn.erp.mappers;

import cn.erp.pojo.TblEmpRole;
import cn.erp.pojo.TblEmpRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblEmpRoleMapper {
    int countByExample(TblEmpRoleExample example);

    int deleteByExample(TblEmpRoleExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblEmpRole record);

    int insertSelective(TblEmpRole record);

    List<TblEmpRole> selectByExample(TblEmpRoleExample example);

    TblEmpRole selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblEmpRole record, @Param("example") TblEmpRoleExample example);

    int updateByExample(@Param("record") TblEmpRole record, @Param("example") TblEmpRoleExample example);

    int updateByPrimaryKeySelective(TblEmpRole record);

    int updateByPrimaryKey(TblEmpRole record);
}