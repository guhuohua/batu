package com.ch.dao;

import com.ch.entity.BtViewMenu;
import com.ch.entity.BtViewMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BtViewMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu
     *
     * @mbg.generated Wed Mar 13 17:29:02 CST 2019
     */
    long countByExample(BtViewMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu
     *
     * @mbg.generated Wed Mar 13 17:29:02 CST 2019
     */
    int deleteByExample(BtViewMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu
     *
     * @mbg.generated Wed Mar 13 17:29:02 CST 2019
     */
    int insert(BtViewMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu
     *
     * @mbg.generated Wed Mar 13 17:29:02 CST 2019
     */
    int insertSelective(BtViewMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu
     *
     * @mbg.generated Wed Mar 13 17:29:02 CST 2019
     */
    List<BtViewMenu> selectByExample(BtViewMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu
     *
     * @mbg.generated Wed Mar 13 17:29:02 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtViewMenu record, @Param("example") BtViewMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu
     *
     * @mbg.generated Wed Mar 13 17:29:02 CST 2019
     */
    int updateByExample(@Param("record") BtViewMenu record, @Param("example") BtViewMenuExample example);
}