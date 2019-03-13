package com.ch.dao;

import com.ch.entity.BtSysUser;
import com.ch.entity.BtSysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtSysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    long countByExample(BtSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    int deleteByExample(BtSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    int insert(BtSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    int insertSelective(BtSysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    List<BtSysUser> selectByExample(BtSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtSysUser record, @Param("example") BtSysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    int updateByExample(@Param("record") BtSysUser record, @Param("example") BtSysUserExample example);
}