package com.ch.dao;

import com.ch.entity.BtViewBlog;
import com.ch.entity.BtViewBlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BtViewBlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_blog
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    long countByExample(BtViewBlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_blog
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int deleteByExample(BtViewBlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_blog
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int insert(BtViewBlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_blog
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int insertSelective(BtViewBlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_blog
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    List<BtViewBlog> selectByExample(BtViewBlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_blog
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtViewBlog record, @Param("example") BtViewBlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_view_blog
     *
     * @mbg.generated Tue Mar 12 16:01:01 CST 2019
     */
    int updateByExample(@Param("record") BtViewBlog record, @Param("example") BtViewBlogExample example);
}