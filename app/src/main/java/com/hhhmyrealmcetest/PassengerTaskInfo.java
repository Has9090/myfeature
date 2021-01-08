package com.hhhmyrealmcetest;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class PassengerTaskInfo extends RealmObject {

ddd
    @PrimaryKey
    private String taskId;//任务id
    public String taskName = "";
    private String taskDate = "";//添乘任务日期
    public String startStation = "";
    public String endStation = "";
    private String userName = "";//添乘人员名称
    private String userId = "";//添乘人员
    private String taskSummary = "";//添乘总结
    private int state = 0;//任务状态 0新建未开始 1已开始 2已值乘
    private RealmList<PassengerTaskLine> lineList = new RealmList<>();//添乘线路区段

    public String getTaskSummary() {
        return taskSummary;
    }

    public void setTaskSummary(String taskSummary) {
        this.taskSummary = taskSummary;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        userName = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public List<PassengerTaskLine> getLineList() {
        return lineList;
    }

    public void setLineList(RealmList<PassengerTaskLine> lineList) {
        this.lineList = lineList;
    }

    public String getTaskSection() {
        return startStation + "-" + endStation;
    }
}
