package com.flycode.follow.mapper;

import com.flycode.follow.entity.Condition;
import com.flycode.follow.entity.ConditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConditionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    int countByExample(ConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    int deleteByExample(ConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    int insert(Condition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    int insertSelective(Condition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    List<Condition> selectByExample(ConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    Condition selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    int updateByExampleSelective(@Param("record") Condition record, @Param("example") ConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    int updateByExample(@Param("record") Condition record, @Param("example") ConditionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    int updateByPrimaryKeySelective(Condition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_3
     *
     * @mbggenerated Wed Oct 14 22:01:39 CST 2015
     */
    int updateByPrimaryKey(Condition record);
}