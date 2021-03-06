package com.flycode.sj.mapper;

import com.flycode.sj.entity.SJ;
import com.flycode.sj.entity.SJExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SJMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    int countByExample(SJExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    int deleteByExample(SJExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    int deleteByPrimaryKey(String sjId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    int insert(SJ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    int insertSelective(SJ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    List<SJ> selectByExample(SJExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    SJ selectByPrimaryKey(String sjId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    int updateByExampleSelective(@Param("record") SJ record, @Param("example") SJExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    int updateByExample(@Param("record") SJ record, @Param("example") SJExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    int updateByPrimaryKeySelective(SJ record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project
     *
     * @mbggenerated Wed Oct 14 21:51:50 CST 2015
     */
    int updateByPrimaryKey(SJ record);
}