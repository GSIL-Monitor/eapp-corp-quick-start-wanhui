/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HomeMainResp
 * Author:   cretin
 * Date:     12/20/18 18:08
 * Description: 首页调用数据返回model
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.model.response;

/**
 * 〈首页调用数据返回model〉
 *
 * @author cretin
 * @create 12/20/18
 * @since 1.0.0
 */
public class HomeMainResp {
    //今日打卡信息
    private String todayDingInfo;

    //本月迟到次数
    private int lateTimes;

    //本月打卡异常数据
    private int dingErrTimes;

    //头像
    private String avatar;

    //考勤方式
    private String groupName;

    //周五是否提醒
    private boolean weekNotice;

    //昵称
    private String nickname;

    public String getTodayDingInfo() {
        return todayDingInfo;
    }

    public void setTodayDingInfo(String todayDingInfo) {
        this.todayDingInfo = todayDingInfo;
    }

    public int getLateTimes() {
        return lateTimes;
    }

    public void setLateTimes(int lateTimes) {
        this.lateTimes = lateTimes;
    }

    public int getDingErrTimes() {
        return dingErrTimes;
    }

    public void setDingErrTimes(int dingErrTimes) {
        this.dingErrTimes = dingErrTimes;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public boolean isWeekNotice() {
        return weekNotice;
    }

    public void setWeekNotice(boolean weekNotice) {
        this.weekNotice = weekNotice;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}