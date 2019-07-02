package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "meeting_round")
public class MeetingRound extends BasePO<Integer> {

    @Column(name = "meeting_id")
    private Integer meetingId;

    @Column(name = "meeting_name")
    private String meetingName;

    @Column(name = "award_year")
    private Short awardYear;

    @Column(name = "round_index")
    private Short roundIndex;

    /**
     * 人员应评数 或 项目特等奖应评
     */
    @Column(name = "prize0_num")
    private Short prize0Num;

    @Column(name = "prize1_num")
    private Short prize1Num;

    @Column(name = "prize2_num")
    private Short prize2Num;

    @Column(name = "prize3_num")
    private Short prize3Num;

    @Column(name = "prize0_ret")
    private Short prize0Ret;

    @Column(name = "prize1_ret")
    private Short prize1Ret;

    @Column(name = "prize2_ret")
    private Short prize2Ret;

    @Column(name = "prize3_ret")
    private Short prize3Ret;

    @Column(name = "round_status")
    private Short roundStatus;

    @Column(name = "round_status_name")
    private String roundStatusName;

    @Column(name = "target_ids")
    private String targetIds;

    @Column(name = "wipe_min_max")
    private Byte wipeMinMax;

    @Column(name = "sort")
    private Byte sort;

    /**
     * 0->人员 1->项目
     */
    @Column(name = "award_type_type")
    private Byte awardTypeType;



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

    /**
     * 获取人员应评数 或 项目特等奖应评
     *
     * @return prize0_num - 人员应评数 或 项目特等奖应评
     */
    public Short getPrize0Num() {
        return prize0Num;
    }

    /**
     * 设置人员应评数 或 项目特等奖应评
     *
     * @param prize0Num 人员应评数 或 项目特等奖应评
     */
    public void setPrize0Num(Short prize0Num) {
        this.prize0Num = prize0Num;
    }

    /**
     * @return prize1_num
     */
    public Short getPrize1Num() {
        return prize1Num;
    }

    /**
     * @param prize1Num
     */
    public void setPrize1Num(Short prize1Num) {
        this.prize1Num = prize1Num;
    }

    /**
     * @return prize2_num
     */
    public Short getPrize2Num() {
        return prize2Num;
    }

    /**
     * @param prize2Num
     */
    public void setPrize2Num(Short prize2Num) {
        this.prize2Num = prize2Num;
    }

    /**
     * @return prize3_num
     */
    public Short getPrize3Num() {
        return prize3Num;
    }

    /**
     * @param prize3Num
     */
    public void setPrize3Num(Short prize3Num) {
        this.prize3Num = prize3Num;
    }

    /**
     * @return prize0_ret
     */
    public Short getPrize0Ret() {
        return prize0Ret;
    }

    /**
     * @param prize0Ret
     */
    public void setPrize0Ret(Short prize0Ret) {
        this.prize0Ret = prize0Ret;
    }

    /**
     * @return prize1_ret
     */
    public Short getPrize1Ret() {
        return prize1Ret;
    }

    /**
     * @param prize1Ret
     */
    public void setPrize1Ret(Short prize1Ret) {
        this.prize1Ret = prize1Ret;
    }

    /**
     * @return prize2_ret
     */
    public Short getPrize2Ret() {
        return prize2Ret;
    }

    /**
     * @param prize2Ret
     */
    public void setPrize2Ret(Short prize2Ret) {
        this.prize2Ret = prize2Ret;
    }

    /**
     * @return prize3_ret
     */
    public Short getPrize3Ret() {
        return prize3Ret;
    }

    /**
     * @param prize3Ret
     */
    public void setPrize3Ret(Short prize3Ret) {
        this.prize3Ret = prize3Ret;
    }

    /**
     * @return round_status
     */
    public Short getRoundStatus() {
        return roundStatus;
    }

    /**
     * @param roundStatus
     */
    public void setRoundStatus(Short roundStatus) {
        this.roundStatus = roundStatus;
    }

    /**
     * @return round_status_name
     */
    public String getRoundStatusName() {
        return roundStatusName;
    }

    /**
     * @param roundStatusName
     */
    public void setRoundStatusName(String roundStatusName) {
        this.roundStatusName = roundStatusName;
    }

    /**
     * @return target_ids
     */
    public String getTargetIds() {
        return targetIds;
    }

    /**
     * @param targetIds
     */
    public void setTargetIds(String targetIds) {
        this.targetIds = targetIds;
    }

    /**
     * @return wipe_min_max
     */
    public Byte getWipeMinMax() {
        return wipeMinMax;
    }

    /**
     * @param wipeMinMax
     */
    public void setWipeMinMax(Byte wipeMinMax) {
        this.wipeMinMax = wipeMinMax;
    }

    /**
     * @return sort
     */
    public Byte getsort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setsort(Byte sort) {
        this.sort = sort;
    }

    /**
     * 获取0->人员 1->项目
     *
     * @return award_type_type - 0->人员 1->项目
     */
    public Byte getAwardTypeType() {
        return awardTypeType;
    }

    /**
     * 设置0->人员 1->项目
     *
     * @param awardTypeType 0->人员 1->项目
     */
    public void setAwardTypeType(Byte awardTypeType) {
        this.awardTypeType = awardTypeType;
    }
}