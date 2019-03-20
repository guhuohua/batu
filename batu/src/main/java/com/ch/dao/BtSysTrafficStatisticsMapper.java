package com.ch.dao;

import com.ch.entity.BtSysTrafficStatistics;
import com.ch.entity.BtSysTrafficStatisticsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface BtSysTrafficStatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_traffic_statistics
     *
     * @mbg.generated Mon Mar 18 10:11:12 CST 2019
     */
    long countByExample(BtSysTrafficStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_traffic_statistics
     *
     * @mbg.generated Mon Mar 18 10:11:12 CST 2019
     */
    int deleteByExample(BtSysTrafficStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_traffic_statistics
     *
     * @mbg.generated Mon Mar 18 10:11:12 CST 2019
     */
    int insert(BtSysTrafficStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_traffic_statistics
     *
     * @mbg.generated Mon Mar 18 10:11:12 CST 2019
     */
    int insertSelective(BtSysTrafficStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_traffic_statistics
     *
     * @mbg.generated Mon Mar 18 10:11:12 CST 2019
     */
    List<BtSysTrafficStatistics> selectByExample(BtSysTrafficStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_traffic_statistics
     *
     * @mbg.generated Mon Mar 18 10:11:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtSysTrafficStatistics record, @Param("example") BtSysTrafficStatisticsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_traffic_statistics
     *
     * @mbg.generated Mon Mar 18 10:11:12 CST 2019
     */
    int updateByExample(@Param("record") BtSysTrafficStatistics record, @Param("example") BtSysTrafficStatisticsExample example);

    /**
     * 查询该IP下前一个小时记录
     * @param ip
     * @return
     */
    @Select("select * from bt_sys_traffic_statistics where create_date > DATE_SUB(NOW(),INTERVAL  1 HOUR) and ip = #{ip} limit 1")
    BtSysTrafficStatistics findHour(@Param("ip") String ip);


    /**
     * 统计所有访问量
     * @return
     */
    @Select("select count(*) from bt_sys_traffic_statistics")
    Long countAll();

    /**
     * 统计昨天访问量
     * @return
     */
    @Select("select count(*) from bt_sys_traffic_statistics where TO_DAYS( NOW( ) ) - TO_DAYS(create_date) <= 1")
    Long countYesterday();

    /**
     * 统计当天访问量
     * @return
     */
    @Select("select count(*) from bt_sys_traffic_statistics where to_days(create_date) = to_days(now())")
    Long countNow();

    /**
     * 统计当月访问量
     * @return
     */
    @Select("select count(*) from bt_sys_traffic_statistics where DATE_FORMAT(create_date, '%Y%m' ) = DATE_FORMAT(CURDATE( ) ,'%Y%m')")
    Long countMonth();

    @Select("select * from bt_sys_traffic_statistics")
    List<BtSysTrafficStatistics> findAll();
}