package com.flycode.alliance.entity;

import java.util.Date;

public class CPAlliance {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.ID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.Code
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.Name
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.ForeignName
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private String foreignname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.NodeType
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Integer nodetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.CorpID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Integer corpid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.Status
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.CreateByID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Integer createbyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.CreateTime
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.UpdateByID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Integer updatebyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.UpdateTime
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.Notes
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private String notes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.ForeignNotes
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private String foreignnotes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.Level
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Integer level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.TLeft
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Integer tleft;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.TRight
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Integer tright;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CP_Alliance.ParentID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    private Integer parentid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.ID
     *
     * @return the value of CP_Alliance.ID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.ID
     *
     * @param id the value for CP_Alliance.ID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.Code
     *
     * @return the value of CP_Alliance.Code
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.Code
     *
     * @param code the value for CP_Alliance.Code
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.Name
     *
     * @return the value of CP_Alliance.Name
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.Name
     *
     * @param name the value for CP_Alliance.Name
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.ForeignName
     *
     * @return the value of CP_Alliance.ForeignName
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public String getForeignname() {
        return foreignname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.ForeignName
     *
     * @param foreignname the value for CP_Alliance.ForeignName
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setForeignname(String foreignname) {
        this.foreignname = foreignname == null ? null : foreignname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.NodeType
     *
     * @return the value of CP_Alliance.NodeType
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Integer getNodetype() {
        return nodetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.NodeType
     *
     * @param nodetype the value for CP_Alliance.NodeType
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setNodetype(Integer nodetype) {
        this.nodetype = nodetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.CorpID
     *
     * @return the value of CP_Alliance.CorpID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Integer getCorpid() {
        return corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.CorpID
     *
     * @param corpid the value for CP_Alliance.CorpID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setCorpid(Integer corpid) {
        this.corpid = corpid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.Status
     *
     * @return the value of CP_Alliance.Status
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.Status
     *
     * @param status the value for CP_Alliance.Status
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.CreateByID
     *
     * @return the value of CP_Alliance.CreateByID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Integer getCreatebyid() {
        return createbyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.CreateByID
     *
     * @param createbyid the value for CP_Alliance.CreateByID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setCreatebyid(Integer createbyid) {
        this.createbyid = createbyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.CreateTime
     *
     * @return the value of CP_Alliance.CreateTime
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.CreateTime
     *
     * @param createtime the value for CP_Alliance.CreateTime
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.UpdateByID
     *
     * @return the value of CP_Alliance.UpdateByID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Integer getUpdatebyid() {
        return updatebyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.UpdateByID
     *
     * @param updatebyid the value for CP_Alliance.UpdateByID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setUpdatebyid(Integer updatebyid) {
        this.updatebyid = updatebyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.UpdateTime
     *
     * @return the value of CP_Alliance.UpdateTime
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.UpdateTime
     *
     * @param updatetime the value for CP_Alliance.UpdateTime
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.Notes
     *
     * @return the value of CP_Alliance.Notes
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.Notes
     *
     * @param notes the value for CP_Alliance.Notes
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.ForeignNotes
     *
     * @return the value of CP_Alliance.ForeignNotes
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public String getForeignnotes() {
        return foreignnotes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.ForeignNotes
     *
     * @param foreignnotes the value for CP_Alliance.ForeignNotes
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setForeignnotes(String foreignnotes) {
        this.foreignnotes = foreignnotes == null ? null : foreignnotes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.Level
     *
     * @return the value of CP_Alliance.Level
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.Level
     *
     * @param level the value for CP_Alliance.Level
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.TLeft
     *
     * @return the value of CP_Alliance.TLeft
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Integer getTleft() {
        return tleft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.TLeft
     *
     * @param tleft the value for CP_Alliance.TLeft
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setTleft(Integer tleft) {
        this.tleft = tleft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.TRight
     *
     * @return the value of CP_Alliance.TRight
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Integer getTright() {
        return tright;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.TRight
     *
     * @param tright the value for CP_Alliance.TRight
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setTright(Integer tright) {
        this.tright = tright;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CP_Alliance.ParentID
     *
     * @return the value of CP_Alliance.ParentID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CP_Alliance.ParentID
     *
     * @param parentid the value for CP_Alliance.ParentID
     *
     * @mbggenerated Thu Oct 15 14:23:07 CST 2015
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}