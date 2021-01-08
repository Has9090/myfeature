package com.hhhmyrealmcetest;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/**
 * 添乘任务线路
 */
public class PassengerTaskLine extends RealmObject {
    @Ignore
    public boolean shakeFoldStatus = false;
    @Ignore
    public boolean eventFoldStatus = false;

    private String trainNumber;//添乘车次
    private String trainNo;//添乘车号
    private String startStation = "未知";//线路开始车站
    private String endStation = "未知";//线路结束车站
    private String startTime = "--:--";//线路开始时间
    private String endTime = "--:--";//线路结束时间
//    private RealmList<RecordEventEntity> recordEventEntity = new RealmList<>();
//
//    public RealmList<RecordEventEntity> getRecordEventEntity() {
//        return recordEventEntity;
//    }
//
//    public void setRecordEventEntity(RealmList<RecordEventEntity> recordEventEntity) {
//        this.recordEventEntity = recordEventEntity;
//    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getStationStartAndEnd() {
        return new StringBuilder()
                .append(startStation)
                .append("-")
                .append(endStation)
                .toString();
    }

    public String getLineZone() {
        return new StringBuilder()
                .append(startStation)
                .append("(")
                .append(startTime)
                .append(")")
                .append("-")
                .append(endStation)
                .append("(")
                .append(endTime)
                .append(")")
                .toString();
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}