package com.flycode.amount.mapper;

import com.flycode.amount.entity.Amount;
import com.flycode.amount.entity.AmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    int countByExample(AmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    int deleteByExample(AmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    int deleteByPrimaryKey(String sjId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    int insert(Amount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    int insertSelective(Amount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    List<Amount> selectByExample(AmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    Amount selectByPrimaryKey(String sjId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    int updateByExampleSelective(@Param("record") Amount record, @Param("example") AmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    int updateByExample(@Param("record") Amount record, @Param("example") AmountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    int updateByPrimaryKeySelective(Amount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    int updateByPrimaryKey(Amount record);
}