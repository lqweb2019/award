package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "award_meeting")
public class AwardMeeting extends BasePO<Integer> {


    @Column(name = "meeting_name")
    private String meetingName;

    @Column(name = "award_year")
    private Short awardYear;

    /**
     * 0：初评；1：终评
     */
    @Column(name = "meeting_type")
    private Byte meetingType;

    @Column(name = "meeting_type_name")
    private String meetingTypeName;

    @Column(name = "award_type_id")
    private Integer awardTypeId;

    /**
     * 奖项名称
     */
    @Column(name = "award_type_name")
    private String awardTypeName;

    @Column(name = "cat_id")
    private Integer catId;

    /**
     * 专业组名称，专业划分
     */
    @Column(name = "cat_name")
    private String catName;

    @Column(name = "meeting_info")
    private String meetingInfo;

    /**
     * 登录验证码
     */
    @Column(name = "meeting_verify")
    private String meetingVerify;

    @Column(name = "round_id")
    private Integer roundId;

    @Column(name = "round_index")
    private Short roundIndex;

    /**
     * 当前轮次状态
     */
    @Column(name = "round_status_id")
    private Byte roundStatusId;

    @Column(name = "round_status_name")
    private String roundStatusName;

    @Column(name = "sort")
    private Byte sort;

    /**
     * 0->人员 1->项目
     */
    @Column(name = "award_type_type")
    private Byte awardTypeType;

    /**
     * 项目代表应评特等奖数，人员代表应评人数
     */
    @Column(name = "prize0_num")
    private Short prize0Num;

    /**
     * 一等奖应评
     */
    @Column(name = "prize1_num")
    private Short prize1Num;

    /**
     * 二等奖应评
     */
    @Column(name = "prize2_num")
    private Short prize2Num;

    /**
     * 三等奖应评
     */
    @Column(name = "prize3_num")
    private Short prize3Num;

    /**
     * 项目代表特等奖已评出，人员代表已评出人数
     */
    @Column(name = "prize0_ret")
    private Short prize0Ret;

    /**
     * 一等奖已评出
     */
    @Column(name = "prize1_ret")
    private Short prize1Ret;

    /**
     * 二等奖已评出
     */
    @Column(name = "prize2_ret")
    private Short prize2Ret;

    /**
     * 三等奖已评出
     */
    @Column(name = "prize3_ret")
    private Short prize3Ret;

    /**
     * 评奖开始时间
     */
    @Column(name = "meeting_start_time")
    private Date meetingStartTime;

    /**
     * 评奖结束时间
     */
    @Column(name = "meeting_end_time")
    private Date meetingEndTime;

    @Column(name = "meeting_status_id")
    private Byte meetingStatusId;

    @Column(name = "meeting_status_name")
    private String meetingStatusName;



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
     * 获取0：初评；1：终评
     *
     * @return meeting_type - 0：初评；1：终评
     */
    public Byte getMeetingType() {
        return meetingType;
    }

    /**
     * 设置0：初评；1：终评
     *
     * @param meetingType 0：初评；1：终评
     */
    public void setMeetingType(Byte meetingType) {
        this.meetingType = meetingType;
    }

    /**
     * @return meeting_type_name
     */
    public String getMeetingTypeName() {
        return meetingTypeName;
    }

    /**
     * @param meetingTypeName
     */
    public void setMeetingTypeName(String meetingTypeName) {
        this.meetingTypeName = meetingTypeName;
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
     * 获取奖项名称
     *
     * @return award_type_name - 奖项名称
     */
    public String getAwardTypeName() {
        return awardTypeName;
    }

    /**
     * 设置奖项名称
     *
     * @param awardTypeName 奖项名称
     */
    public void setAwardTypeName(String awardTypeName) {
        this.awardTypeName = awardTypeName;
    }

    /**
     * @return cat_id
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * @param catId
     */
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    /**
     * 获取专业组名称，专业划分
     *
     * @return cat_name - 专业组名称，专业划分
     */
    public String getCatName() {
        return catName;
    }

    /**
     * 设置专业组名称，专业划分
     *
     * @param catName 专业组名称，专业划分
     */
    public void setCatName(String catName) {
        this.catName = catName;
    }

    /**
     * @return meeting_info
     */
    public String getMeetingInfo() {
        return meetingInfo;
    }

    /**
     * @param meetingInfo
     */
    public void setMeetingInfo(String meetingInfo) {
        this.meetingInfo = meetingInfo;
    }

    /**
     * 获取登录验证码
     *
     * @return meeting_verify - 登录验证码
     */
    public String getMeetingVerify() {
        return meetingVerify;
    }

    /**
     * 设置登录验证码
     *
     * @param meetingVerify 登录验证码
     */
    public void setMeetingVerify(String meetingVerify) {
        this.meetingVerify = meetingVerify;
    }

    /**
     * @return round_id
     */
    public Integer getRoundId() {
        return roundId;
    }

    /**
     * @param roundId
     */
    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
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
     * 获取当前轮次状态
     *
     * @return round_status_id - 当前轮次状态
     */
    public Byte getRoundStatusId() {
        return roundStatusId;
    }

    /**
     * 设置当前轮次状态
     *
     * @param roundStatusId 当前轮次状态
     */
    public void setRoundStatusId(Byte roundStatusId) {
        this.roundStatusId = roundStatusId;
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

    /**
     * 获取项目代表应评特等奖数，人员代表应评人数
     *
     * @return prize0_num - 项目代表应评特等奖数，人员代表应评人数
     */
    public Short getPrize0Num() {
        return prize0Num;
    }

    /**
     * 设置项目代表应评特等奖数，人员代表应评人数
     *
     * @param prize0Num 项目代表应评特等奖数，人员代表应评人数
     */
    public void setPrize0Num(Short prize0Num) {
        this.prize0Num = prize0Num;
    }

    /**
     * 获取一等奖应评
     *
     * @return prize1_num - 一等奖应评
     */
    public Short getPrize1Num() {
        return prize1Num;
    }

    /**
     * 设置一等奖应评
     *
     * @param prize1Num 一等奖应评
     */
    public void setPrize1Num(Short prize1Num) {
        this.prize1Num = prize1Num;
    }

    /**
     * 获取二等奖应评
     *
     * @return prize2_num - 二等奖应评
     */
    public Short getPrize2Num() {
        return prize2Num;
    }

    /**
     * 设置二等奖应评
     *
     * @param prize2Num 二等奖应评
     */
    public void setPrize2Num(Short prize2Num) {
        this.prize2Num = prize2Num;
    }

    /**
     * 获取三等奖应评
     *
     * @return prize3_num - 三等奖应评
     */
    public Short getPrize3Num() {
        return prize3Num;
    }

    /**
     * 设置三等奖应评
     *
     * @param prize3Num 三等奖应评
     */
    public void setPrize3Num(Short prize3Num) {
        this.prize3Num = prize3Num;
    }

    /**
     * 获取项目代表特等奖已评出，人员代表已评出人数
     *
     * @return prize0_ret - 项目代表特等奖已评出，人员代表已评出人数
     */
    public Short getPrize0Ret() {
        return prize0Ret;
    }

    /**
     * 设置项目代表特等奖已评出，人员代表已评出人数
     *
     * @param prize0Ret 项目代表特等奖已评出，人员代表已评出人数
     */
    public void setPrize0Ret(Short prize0Ret) {
        this.prize0Ret = prize0Ret;
    }

    /**
     * 获取一等奖已评出
     *
     * @return prize1_ret - 一等奖已评出
     */
    public Short getPrize1Ret() {
        return prize1Ret;
    }

    /**
     * 设置一等奖已评出
     *
     * @param prize1Ret 一等奖已评出
     */
    public void setPrize1Ret(Short prize1Ret) {
        this.prize1Ret = prize1Ret;
    }

    /**
     * 获取二等奖已评出
     *
     * @return prize2_ret - 二等奖已评出
     */
    public Short getPrize2Ret() {
        return prize2Ret;
    }

    /**
     * 设置二等奖已评出
     *
     * @param prize2Ret 二等奖已评出
     */
    public void setPrize2Ret(Short prize2Ret) {
        this.prize2Ret = prize2Ret;
    }

    /**
     * 获取三等奖已评出
     *
     * @return prize3_ret - 三等奖已评出
     */
    public Short getPrize3Ret() {
        return prize3Ret;
    }

    /**
     * 设置三等奖已评出
     *
     * @param prize3Ret 三等奖已评出
     */
    public void setPrize3Ret(Short prize3Ret) {
        this.prize3Ret = prize3Ret;
    }

    /**
     * 获取评奖开始时间
     *
     * @return meeting_start_time - 评奖开始时间
     */
    public Date getMeetingStartTime() {
        return meetingStartTime;
    }

    /**
     * 设置评奖开始时间
     *
     * @param meetingStartTime 评奖开始时间
     */
    public void setMeetingStartTime(Date meetingStartTime) {
        this.meetingStartTime = meetingStartTime;
    }

    /**
     * 获取评奖结束时间
     *
     * @return meeting_end_time - 评奖结束时间
     */
    public Date getMeetingEndTime() {
        return meetingEndTime;
    }

    /**
     * 设置评奖结束时间
     *
     * @param meetingEndTime 评奖结束时间
     */
    public void setMeetingEndTime(Date meetingEndTime) {
        this.meetingEndTime = meetingEndTime;
    }

    /**
     * @return meeting_status_id
     */
    public Byte getMeetingStatusId() {
        return meetingStatusId;
    }

    /**
     * @param meetingStatusId
     */
    public void setMeetingStatusId(Byte meetingStatusId) {
        this.meetingStatusId = meetingStatusId;
    }

    /**
     * @return meeting_status_name
     */
    public String getMeetingStatusName() {
        return meetingStatusName;
    }

    /**
     * @param meetingStatusName
     */
    public void setMeetingStatusName(String meetingStatusName) {
        this.meetingStatusName = meetingStatusName;
    }
}