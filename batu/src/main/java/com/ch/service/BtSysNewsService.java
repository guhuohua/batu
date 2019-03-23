package com.ch.service;

import com.ch.base.ResponseResult;
import com.ch.dto.NewsParam;
import com.ch.entity.BtViewNews;
import com.ch.entity.BtViewNewsExample;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface BtSysNewsService  {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Thu Mar 14 09:24:18 CST 2019
     */
    long countByExample(BtViewNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Thu Mar 14 09:24:18 CST 2019
     */
    int deleteByExample(BtViewNewsExample example);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Thu Mar 14 09:24:18 CST 2019
     */
    int insertSelective(BtViewNews record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Thu Mar 14 09:24:18 CST 2019
     */
    List<BtViewNews> selectByExample(BtViewNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_news
     *
     * @mbg.generated Thu Mar 14 09:24:18 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtViewNews record, @Param("example") BtViewNewsExample example);





    /**
     * 分页展示
     *
     * @return
     */

    public ResponseResult findPage(NewsParam newsParam);

    /**
     * 增加
     * @param
     * @return
     */
    public ResponseResult insert(BtViewNews record,String userId);


    /**
     * 批量删除
     * @param ids
     * @return
     */
    public ResponseResult delete(List<String> ids);

    /**
     * 修改
     * @param record
     * @return
     */
    public ResponseResult updateByPrimaryKey(BtViewNews record);
    public ResponseResult updateStatus (String id, int status);
    ResponseResult findById(String Id);


}
