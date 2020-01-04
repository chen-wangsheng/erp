package cn.erp.mappers;

import cn.erp.pojo.TblRoleMenu;
import cn.erp.pojo.TblRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRoleMenuMapper {
    int countByExample(TblRoleMenuExample example);

    int deleteByExample(TblRoleMenuExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblRoleMenu record);

    int insertSelective(TblRoleMenu record);

    List<TblRoleMenu> selectByExample(TblRoleMenuExample example);

    TblRoleMenu selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblRoleMenu record, @Param("example") TblRoleMenuExample example);

    int updateByExample(@Param("record") TblRoleMenu record, @Param("example") TblRoleMenuExample example);

    int updateByPrimaryKeySelective(TblRoleMenu record);

    int updateByPrimaryKey(TblRoleMenu record);
}