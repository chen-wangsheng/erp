package cn.erp.mappers;

import cn.erp.dto.EmpDep;
import cn.erp.pojo.TblEmp;
import cn.erp.pojo.TblEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblEmpMapper {
    int countByExample(TblEmpExample example);

    int deleteByExample(TblEmpExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(TblEmp record);

    int insertSelective(TblEmp record);

    List<TblEmp> selectByExample(TblEmpExample example);

    TblEmp selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") TblEmp record, @Param("example") TblEmpExample example);

    int updateByExample(@Param("record") TblEmp record, @Param("example") TblEmpExample example);

    int updateByPrimaryKeySelective(TblEmp record);

    int updateByPrimaryKey(TblEmp record);
    /**
     * 获得所有员工所在的部门
     * @return
     */
     List<EmpDep> selectEmpAndDep();
    /**
     * 根基员工id获得员工所在的部门
     */
     EmpDep selectEmpAndDepByEmpId(Long uuid);
     /**
      * 员工id的到对应角色
      */
     List<EmpDep> selEmpAndRoleById(Long uuid);
}