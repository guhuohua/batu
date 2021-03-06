package com.ch.service;

import com.ch.base.ResponseResult;
import com.ch.model.MessageParam;
import com.ch.entity.BtViewMessage;
import com.ch.entity.BtViewMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BtViewMessageService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_message
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    long countByExample(BtViewMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_message
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    int deleteByExample(BtViewMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_message
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    ResponseResult insert(BtViewMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_message
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    int insertSelective(BtViewMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_message
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    List<BtViewMessage> selectByExampleWithBLOBs(BtViewMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_message
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    List<BtViewMessage> selectByExample(BtViewMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_message
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtViewMessage record, @Param("example") BtViewMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_message
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") BtViewMessage record, @Param("example") BtViewMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_message
     *
     * @mbg.generated Wed Mar 13 11:57:15 CST 2019
     */
    int updateByExample(@Param("record") BtViewMessage record, @Param("example") BtViewMessageExample example);

    /**
     * 后台留言列表
     * @return
     */
    ResponseResult findAll(MessageParam param);
}
