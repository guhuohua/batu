package com.ch.dao;

import com.ch.entity.BtSysRole;
import com.ch.entity.BtSysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BtSysRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_role
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    long countByExample(BtSysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_role
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int deleteByExample(BtSysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_role
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int insert(BtSysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_role
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int insertSelective(BtSysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_role
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    List<BtSysRole> selectByExample(BtSysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_role
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtSysRole record, @Param("example") BtSysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_role
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int updateByExample(@Param("record") BtSysRole record, @Param("example") BtSysRoleExample example);
}