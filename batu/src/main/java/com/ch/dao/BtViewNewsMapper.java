package com.ch.dao;

import com.ch.entity.BtViewNews;
import com.ch.entity.BtViewNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtViewNewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Wed Mar 13 15:56:17 CST 2019
     */
    long countByExample(BtViewNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Wed Mar 13 15:56:17 CST 2019
     */
    int deleteByExample(BtViewNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Wed Mar 13 15:56:17 CST 2019
     */
    int insert(BtViewNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Wed Mar 13 15:56:17 CST 2019
     */
    int insertSelective(BtViewNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Wed Mar 13 15:56:17 CST 2019
     */
    List<BtViewNews> selectByExample(BtViewNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Wed Mar 13 15:56:17 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtViewNews record, @Param("example") BtViewNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Wed Mar 13 15:56:17 CST 2019
     */
    int updateByExample(@Param("record") BtViewNews record, @Param("example") BtViewNewsExample example);
}