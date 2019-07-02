package com.zyl.award.business.entity.po;

import com.zyl.award.commons.model.po.BasePO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "base_project")
public class BaseProject extends BasePO<Integer> {


    @Column(name = "project_name")
    private String projectName;

    /**
     * 评审年份
     */
    @Column(name = "award_year")
    private Integer awardYear;

    @Column(name = "cat_id")
    private Integer catId;

    @Column(name = "cat_name")
    private String catName;

    @Column(name = "award_type_id")
    private Integer awardTypeId;

    /**
     * 项目参评奖项名称
     */
    @Column(name = "award_type_name")
    private String awardTypeName;

    /**
     * 项目代码
     */
    @Column(name = "project_code")
    private String projectCode;

    /**
     * 项目文件数
     */
    @Column(name = "project_file_num")
    private Integer projectFileNum;

    @Column(name = "recommend_prize_id")
    private Integer recommendPrizeId;

    /**
     * 推荐奖项名称
     */
    @Column(name = "recommend_prize_name")
    private String recommendPrizeName;

    /**
     * 推荐单位
     */
    @Column(name = "recommend_agency_name")
    private String recommendAgencyName;

    /**
     * 主要完成单位
     */
    @Column(name = "main_agency_name")
    private String mainAgencyName;

    /**
     * 主要完成人员
     */
    @Column(name = "main_user_name")
    private String mainUserName;

    @Column(name = "result_type_id")
    private Integer resultTypeId;

    /**
     * 成果类型
     */
    @Column(name = "result_type_name")
    private String resultTypeName;

    /**
     * 经济效益分
     */
    @Column(name = "project_score")
    private Short projectScore;

    /**
     * 0 -> 启用 1->使用
     */
    @Column(name = "status")
    private Integer status;

    @Column(name = "sort")
    private Integer sort;

    @Column(name = "first_prize_id")
    private Integer firstPrizeId;

    @Column(name = "first_prize_name")
    private String firstPrizeName;

    /**
     * 0 -> 初评未获奖 1-> 初评获奖
     */
    @Column(name = "first_prize_result")
    private Integer firstPrizeResult;

    @Column(name = "final_prize_id")
    private Integer finalPrizeId;

    @Column(name = "final_prize_name")
    private String finalPrizeName;

    /**
     * 0 -> 终评未获奖 1-> 终评获奖
     */
    @Column(name = "final_prize_result")
    private Integer finalPrizeResult;

    /**
     * 0->初评会议 1->终评会议
     */
    @Column(name = "meeting_type")
    private Integer meetingType;

    /**
     * 项目简介
     */
    @Column(name = "project_info")
    private String projectInfo;



    /**
     * @return project_name
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * 获取评审年份
     *
     * @return award_year - 评审年份
     */
    public Integer getAwardYear() {
        return awardYear;
    }

    /**
     * 设置评审年份
     *
     * @param awardYear 评审年份
     */
    public void setAwardYear(Integer awardYear) {
        this.awardYear = awardYear;
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
     * @return cat_name
     */
    public String getCatName() {
        return catName;
    }

    /**
     * @param catName
     */
    public void setCatName(String catName) {
        this.catName = catName;
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
     * 获取项目参评奖项名称
     *
     * @return award_type_name - 项目参评奖项名称
     */
    public String getAwardTypeName() {
        return awardTypeName;
    }

    /**
     * 设置项目参评奖项名称
     *
     * @param awardTypeName 项目参评奖项名称
     */
    public void setAwardTypeName(String awardTypeName) {
        this.awardTypeName = awardTypeName;
    }

    /**
     * 获取项目代码
     *
     * @return project_code - 项目代码
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 设置项目代码
     *
     * @param projectCode 项目代码
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    /**
     * 获取项目文件数
     *
     * @return project_file_num - 项目文件数
     */
    public Integer getProjectFileNum() {
        return projectFileNum;
    }

    /**
     * 设置项目文件数
     *
     * @param projectFileNum 项目文件数
     */
    public void setProjectFileNum(Integer projectFileNum) {
        this.projectFileNum = projectFileNum;
    }

    /**
     * @return recommend_prize_id
     */
    public Integer getRecommendPrizeId() {
        return recommendPrizeId;
    }

    /**
     * @param recommendPrizeId
     */
    public void setRecommendPrizeId(Integer recommendPrizeId) {
        this.recommendPrizeId = recommendPrizeId;
    }

    /**
     * 获取推荐奖项名称
     *
     * @return recommend_prize_name - 推荐奖项名称
     */
    public String getRecommendPrizeName() {
        return recommendPrizeName;
    }

    /**
     * 设置推荐奖项名称
     *
     * @param recommendPrizeName 推荐奖项名称
     */
    public void setRecommendPrizeName(String recommendPrizeName) {
        this.recommendPrizeName = recommendPrizeName;
    }

    /**
     * 获取推荐单位
     *
     * @return recommend_agency_name - 推荐单位
     */
    public String getRecommendAgencyName() {
        return recommendAgencyName;
    }

    /**
     * 设置推荐单位
     *
     * @param recommendAgencyName 推荐单位
     */
    public void setRecommendAgencyName(String recommendAgencyName) {
        this.recommendAgencyName = recommendAgencyName;
    }

    /**
     * 获取主要完成单位
     *
     * @return main_agency_name - 主要完成单位
     */
    public String getMainAgencyName() {
        return mainAgencyName;
    }

    /**
     * 设置主要完成单位
     *
     * @param mainAgencyName 主要完成单位
     */
    public void setMainAgencyName(String mainAgencyName) {
        this.mainAgencyName = mainAgencyName;
    }

    /**
     * 获取主要完成人员
     *
     * @return main_user_name - 主要完成人员
     */
    public String getMainUserName() {
        return mainUserName;
    }

    /**
     * 设置主要完成人员
     *
     * @param mainUserName 主要完成人员
     */
    public void setMainUserName(String mainUserName) {
        this.mainUserName = mainUserName;
    }

    /**
     * @return result_type_id
     */
    public Integer getResultTypeId() {
        return resultTypeId;
    }

    /**
     * @param resultTypeId
     */
    public void setResultTypeId(Integer resultTypeId) {
        this.resultTypeId = resultTypeId;
    }

    /**
     * 获取成果类型
     *
     * @return result_type_name - 成果类型
     */
    public String getResultTypeName() {
        return resultTypeName;
    }

    /**
     * 设置成果类型
     *
     * @param resultTypeName 成果类型
     */
    public void setResultTypeName(String resultTypeName) {
        this.resultTypeName = resultTypeName;
    }

    /**
     * 获取经济效益分
     *
     * @return project_score - 经济效益分
     */
    public Short getProjectScore() {
        return projectScore;
    }

    /**
     * 设置经济效益分
     *
     * @param projectScore 经济效益分
     */
    public void setProjectScore(Short projectScore) {
        this.projectScore = projectScore;
    }

    /**
     * 获取0 -> 启用 1->使用
     *
     * @return status - 0 -> 启用 1->使用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0 -> 启用 1->使用
     *
     * @param status 0 -> 启用 1->使用
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * @return first_prize_id
     */
    public Integer getFirstPrizeId() {
        return firstPrizeId;
    }

    /**
     * @param firstPrizeId
     */
    public void setFirstPrizeId(Integer firstPrizeId) {
        this.firstPrizeId = firstPrizeId;
    }

    /**
     * @return first_prize_name
     */
    public String getFirstPrizeName() {
        return firstPrizeName;
    }

    /**
     * @param firstPrizeName
     */
    public void setFirstPrizeName(String firstPrizeName) {
        this.firstPrizeName = firstPrizeName;
    }

    /**
     * 获取0 -> 初评未获奖 1-> 初评获奖
     *
     * @return first_prize_result - 0 -> 初评未获奖 1-> 初评获奖
     */
    public Integer getFirstPrizeResult() {
        return firstPrizeResult;
    }

    /**
     * 设置0 -> 初评未获奖 1-> 初评获奖
     *
     * @param firstPrizeResult 0 -> 初评未获奖 1-> 初评获奖
     */
    public void setFirstPrizeResult(Integer firstPrizeResult) {
        this.firstPrizeResult = firstPrizeResult;
    }

    /**
     * @return final_prize_id
     */
    public Integer getFinalPrizeId() {
        return finalPrizeId;
    }

    /**
     * @param finalPrizeId
     */
    public void setFinalPrizeId(Integer finalPrizeId) {
        this.finalPrizeId = finalPrizeId;
    }

    /**
     * @return final_prize_name
     */
    public String getFinalPrizeName() {
        return finalPrizeName;
    }

    /**
     * @param finalPrizeName
     */
    public void setFinalPrizeName(String finalPrizeName) {
        this.finalPrizeName = finalPrizeName;
    }

    /**
     * 获取0 -> 终评未获奖 1-> 终评获奖
     *
     * @return final_prize_result - 0 -> 终评未获奖 1-> 终评获奖
     */
    public Integer getFinalPrizeResult() {
        return finalPrizeResult;
    }

    /**
     * 设置0 -> 终评未获奖 1-> 终评获奖
     *
     * @param finalPrizeResult 0 -> 终评未获奖 1-> 终评获奖
     */
    public void setFinalPrizeResult(Integer finalPrizeResult) {
        this.finalPrizeResult = finalPrizeResult;
    }

    /**
     * 获取0->初评会议 1->终评会议
     *
     * @return meeting_type - 0->初评会议 1->终评会议
     */
    public Integer getMeetingType() {
        return meetingType;
    }

    /**
     * 设置0->初评会议 1->终评会议
     *
     * @param meetingType 0->初评会议 1->终评会议
     */
    public void setMeetingType(Integer meetingType) {
        this.meetingType = meetingType;
    }

    /**
     * 获取项目简介
     *
     * @return project_info - 项目简介
     */
    public String getProjectInfo() {
        return projectInfo;
    }

    /**
     * 设置项目简介
     *
     * @param projectInfo 项目简介
     */
    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }
}