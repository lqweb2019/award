package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "award_obj")
public class AwardObj extends BasePO<Integer> {


    @Column(name = "meeting_id")
    private Integer meetingId;

    @Column(name = "meeting_name")
    private String meetingName;

    /**
     * 人员或者项目id
     */
    @Column(name = "obj_id")
    private Integer objId;

    @Column(name = "obj_name")
    private String objName;

    @Column(name = "obj_code")
    private String objCode;

    @Column(name = "sort")
    private Short sort;

    @Column(name = "award_type_id")
    private Integer awardTypeId;

    @Column(name = "award_type_name")
    private String awardTypeName;

    @Column(name = "award_year")
    private Short awardYear;

    /**
     * 0-人员 1-项目
     */
    @Column(name = "award_type_type")
    private Short awardTypeType;

    /**
     * 最后综合分数
     */
    @Column(name = "award_score")
    private BigDecimal awardScore;

    /**
     * 同意票数
     */
    @Column(name = "agree_num")
    private Short agreeNum;

    /**
     * 不同意票数
     */
    @Column(name = "disagree_num")
    private Short disagreeNum;

    /**
     * 弃权票数
     */
    @Column(name = "back_num")
    private Short backNum;

    /**
     * 0-不通过 1 -通过
     */
    @Column(name = "prize_id")
    private Byte prizeId;

    @Column(name = "prize_name")
    private String prizeName;

    @Column(name = "round_index")
    private Short roundIndex;



    /**
     * @return meeting_id
     */
    public Integer getMeetingId() {
        return meetingId;
    }

    /**
     * @param meetingId
     */
    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * @return meeting_name
     */
    public String getMeetingName() {
        return meetingName;
    }

    /**
     * @param meetingName
     */
    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    /**
     * 获取人员或者项目id
     *
     * @return obj_id - 人员或者项目id
     */
    public Integer getObjId() {
        return objId;
    }

    /**
     * 设置人员或者项目id
     *
     * @param objId 人员或者项目id
     */
    public void setObjId(Integer objId) {
        this.objId = objId;
    }

    /**
     * @return obj_name
     */
    public String getObjName() {
        return objName;
    }

    /**
     * @param objName
     */
    public void setObjName(String objName) {
        this.objName = objName;
    }

    /**
     * @return obj_code
     */
    public String getObjCode() {
        return objCode;
    }

    /**
     * @param objCode
     */
    public void setObjCode(String objCode) {
        this.objCode = objCode;
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
     * @return award_year
     */
    public Short getAwardYear() {
        return awardYear;
    }

    /**
     * @param awardYear
     */
    public void setAwardYear(Short awardYear) {
        this.awardYear = awardYear;
    }

    /**
     * 获取0-人员 1-项目
     *
     * @return award_type_type - 0-人员 1-项目
     */
    public Short getAwardTypeType() {
        return awardTypeType;
    }

    /**
     * 设置0-人员 1-项目
     *
     * @param awardTypeType 0-人员 1-项目
     */
    public void setAwardTypeType(Short awardTypeType) {
        this.awardTypeType = awardTypeType;
    }

    /**
     * 获取最后综合分数
     *
     * @return award_score - 最后综合分数
     */
    public BigDecimal getAwardScore() {
        return awardScore;
    }

    /**
     * 设置最后综合分数
     *
     * @param awardScore 最后综合分数
     */
    public void setAwardScore(BigDecimal awardScore) {
        this.awardScore = awardScore;
    }

    /**
     * 获取同意票数
     *
     * @return agree_num - 同意票数
     */
    public Short getAgreeNum() {
        return agreeNum;
    }

    /**
     * 设置同意票数
     *
     * @param agreeNum 同意票数
     */
    public void setAgreeNum(Short agreeNum) {
        this.agreeNum = agreeNum;
    }

    /**
     * 获取不同意票数
     *
     * @return disagree_num - 不同意票数
     */
    public Short getDisagreeNum() {
        return disagreeNum;
    }

    /**
     * 设置不同意票数
     *
     * @param disagreeNum 不同意票数
     */
    public void setDisagreeNum(Short disagreeNum) {
        this.disagreeNum = disagreeNum;
    }

    /**
     * 获取弃权票数
     *
     * @return back_num - 弃权票数
     */
    public Short getBackNum() {
        return backNum;
    }

    /**
     * 设置弃权票数
     *
     * @param backNum 弃权票数
     */
    public void setBackNum(Short backNum) {
        this.backNum = backNum;
    }

    /**
     * 获取0-不通过 1 -通过
     *
     * @return prize_id - 0-不通过 1 -通过
     */
    public Byte getPrizeId() {
        return prizeId;
    }

    /**
     * 设置0-不通过 1 -通过
     *
     * @param prizeId 0-不通过 1 -通过
     */
    public void setPrizeId(Byte prizeId) {
        this.prizeId = prizeId;
    }

    /**
     * @return prize_name
     */
    public String getPrizeName() {
        return prizeName;
    }

    /**
     * @param prizeName
     */
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    /**
     * @return round_index
     */
    public Short getRoundIndex() {
        return roundIndex;
    }

    /**
     * @param roundIndex
     */
    public void setRoundIndex(Short roundIndex) {
        this.roundIndex = roundIndex;
    }
}