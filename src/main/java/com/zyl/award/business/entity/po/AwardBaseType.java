package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "award_base_type")
public class AwardBaseType extends BasePO<Integer> {


    @Column(name = "award_name")
    private String awardName;

    /**
     * 0-> 人员  1-> 项目
     */
    @Column(name = "award_type")
    private Integer awardType;

    @Column(name = "sort")
    private Integer sort;

    /**
     * 通过比率
     */
    @Column(name = "pass_percentage")
    private Double passPercentage;


    /**
     * @return award_name
     */
    public String getAwardName() {
        return awardName;
    }

    /**
     * @param awardName
     */
    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    /**
     * 获取0-> 人员  1-> 项目
     *
     * @return award_type - 0-> 人员  1-> 项目
     */
    public Integer getAwardType() {
        return awardType;
    }

    /**
     * 设置0-> 人员  1-> 项目
     *
     * @param awardType 0-> 人员  1-> 项目
     */
    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    /**
     * @return sort
     */
    public Integer getsort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setsort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取通过比率
     *
     * @return pass_percentage - 通过比率
     */
    public Double getPassPercentage() {
        return passPercentage;
    }

    /**
     * 设置通过比率
     *
     * @param passPercentage 通过比率
     */
    public void setPassPercentage(Double passPercentage) {
        this.passPercentage = passPercentage;
    }
}