package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "award_base_target")
public class AwardBaseTarget extends BasePO<Integer> {


    @Column(name = "target_name")
    private String targetName;

    /**
     * 最小分值
     */
    @Column(name = "target_min_score")
    private Integer targetMinScore;

    @Column(name = "target_max_score")
    private Integer targetMaxScore;

    /**
     * 奖项说明
     */
    @Column(name = "target_description")
    private String targetDescription;

    /**
     * 属于哪个奖项
     */
    @Column(name = "award_type_id")
    private Integer awardTypeId;

    /**
     * 权重
     */
    @Column(name = "weight")
    private Integer weight;

    @Column(name = "sort")
    private Integer sort;

    /**
     * 0-> 停用 1->启用
     */
    @Column(name = "state")
    private Integer state;



    /**
     * @return target_name
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * @param targetName
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * 获取最小分值
     *
     * @return target_min_score - 最小分值
     */
    public Integer getTargetMinScore() {
        return targetMinScore;
    }

    /**
     * 设置最小分值
     *
     * @param targetMinScore 最小分值
     */
    public void setTargetMinScore(Integer targetMinScore) {
        this.targetMinScore = targetMinScore;
    }

    /**
     * @return target_max_score
     */
    public Integer getTargetMaxScore() {
        return targetMaxScore;
    }

    /**
     * @param targetMaxScore
     */
    public void setTargetMaxScore(Integer targetMaxScore) {
        this.targetMaxScore = targetMaxScore;
    }

    /**
     * 获取奖项说明
     *
     * @return target_description - 奖项说明
     */
    public String getTargetDescription() {
        return targetDescription;
    }

    /**
     * 设置奖项说明
     *
     * @param targetDescription 奖项说明
     */
    public void setTargetDescription(String targetDescription) {
        this.targetDescription = targetDescription;
    }

    /**
     * 获取属于哪个奖项
     *
     * @return award_type_id - 属于哪个奖项
     */
    public Integer getAwardTypeId() {
        return awardTypeId;
    }

    /**
     * 设置属于哪个奖项
     *
     * @param awardTypeId 属于哪个奖项
     */
    public void setAwardTypeId(Integer awardTypeId) {
        this.awardTypeId = awardTypeId;
    }

    /**
     * 获取权重
     *
     * @return weight - 权重
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置权重
     *
     * @param weight 权重
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
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
     * 获取0-> 停用 1->启用
     *
     * @return state - 0-> 停用 1->启用
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0-> 停用 1->启用
     *
     * @param state 0-> 停用 1->启用
     */
    public void setState(Integer state) {
        this.state = state;
    }
}