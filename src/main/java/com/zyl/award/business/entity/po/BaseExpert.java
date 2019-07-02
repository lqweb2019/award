package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "base_expert")
public class BaseExpert extends BasePO<Integer> {


    @Column(name = "expert_name")
    private String expertName;

    @Column(name = "expert_code")
    private String expertCode;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "award_type_id")
    private Integer awardTypeId;

    @Column(name = "award_type_name")
    private String awardTypeName;

    /**
     * 0->禁用 1->启用
     */
    @Column(name = "status")
    private Short status;

    @Column(name = "sort")
    private Short sort;



    /**
     * @return expert_name
     */
    public String getExpertName() {
        return expertName;
    }

    /**
     * @param expertName
     */
    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    /**
     * @return expert_code
     */
    public String getExpertCode() {
        return expertCode;
    }

    /**
     * @param expertCode
     */
    public void setExpertCode(String expertCode) {
        this.expertCode = expertCode;
    }

    /**
     * @return dept_name
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return award_type_id
     */
    public Integer getAwardTypeId() {
        return awardTypeId;
    }

    /**
     * @param awardTypeId
     */
    public void setAwardTypeId(Integer awardTypeId) {
        this.awardTypeId = awardTypeId;
    }

    /**
     * @return award_type_name
     */
    public String getAwardTypeName() {
        return awardTypeName;
    }

    /**
     * @param awardTypeName
     */
    public void setAwardTypeName(String awardTypeName) {
        this.awardTypeName = awardTypeName;
    }

    /**
     * 获取0->禁用 1->启用
     *
     * @return status - 0->禁用 1->启用
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置0->禁用 1->启用
     *
     * @param status 0->禁用 1->启用
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * @return sort
     */
    public Short getsort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setsort(Short sort) {
        this.sort = sort;
    }
}