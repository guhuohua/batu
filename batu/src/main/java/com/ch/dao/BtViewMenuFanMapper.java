package com.ch.dao;

import com.ch.entity.BtViewMenuEng;
import com.ch.entity.BtViewMenuFan;
import com.ch.entity.BtViewMenuFanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BtViewMenuFanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu_fan
     *
     * @mbg.generated Fri Mar 22 17:10:53 CST 2019
     */
    long countByExample(BtViewMenuFanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu_fan
     *
     * @mbg.generated Fri Mar 22 17:10:53 CST 2019
     */
    int deleteByExample(BtViewMenuFanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu_fan
     *
     * @mbg.generated Fri Mar 22 17:10:53 CST 2019
     */
    int insert(BtViewMenuFan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu_fan
     *
     * @mbg.generated Fri Mar 22 17:10:53 CST 2019
     */
    int insertSelective(BtViewMenuFan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu_fan
     *
     * @mbg.generated Fri Mar 22 17:10:53 CST 2019
     */
    List<BtViewMenuFan> selectByExample(BtViewMenuFanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu_fan
     *
     * @mbg.generated Fri Mar 22 17:10:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtViewMenuFan record, @Param("example") BtViewMenuFanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_menu_fan
     *
     * @mbg.generated Fri Mar 22 17:10:53 CST 2019
     */
    int updateByExample(@Param("record") BtViewMenuFan record, @Param("example") BtViewMenuFanExample example);
    int deleteByPrimaryKey(String id);
    @Select("select * from bt_view_menu_fan where id = #{id}")
    BtViewMenuFan findById(@Param("id") String id);

    int updateByPrimaryKey(BtViewMenuFan btViewMenuFan);
}