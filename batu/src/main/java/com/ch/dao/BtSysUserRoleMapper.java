package com.ch.dao;

import com.ch.entity.BtSysUserRole;
import com.ch.entity.BtSysUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Repository
public interface BtSysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user_role
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    long countByExample(BtSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user_role
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    int deleteByExample(BtSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user_role
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    int insert(BtSysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user_role
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    int insertSelective(BtSysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user_role
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    List<BtSysUserRole> selectByExample(BtSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user_role
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    int updateByExampleSelective(@Param("record") BtSysUserRole record, @Param("example") BtSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bt_sys_user_role
     *
     * @mbg.generated Wed Mar 13 11:39:16 CST 2019
     */
    int updateByExample(@Param("record") BtSysUserRole record, @Param("example") BtSysUserRoleExample example);


    @Select("select * from bt_sys_user_role where user_id = #{userId}")
    List<BtSysUserRole> findByUserId(@Param("userId") String userId);
}