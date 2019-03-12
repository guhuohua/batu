package com.ch.dao;

import com.ch.entity.BtSysMenu;
import com.ch.entity.BtSysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BtSysMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_menu
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    long countByExample(BtSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_menu
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int deleteByExample(BtSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_menu
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int insert(BtSysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_menu
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int insertSelective(BtSysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_menu
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    List<BtSysMenu> selectByExample(BtSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_menu
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtSysMenu record, @Param("example") BtSysMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_menu
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int updateByExample(@Param("record") BtSysMenu record, @Param("example") BtSysMenuExample example);
}