package com.felix.FelixApi;

/**
 * Created by felixlin on 2016/12/11.
 */
public class Travel {

    public Travel(){

    }

    private String areaName;
    private String areaInfo;


    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaInfo() {
        return areaInfo;
    }

    public void setAreaInfo(String areaInfo) {
        this.areaInfo = areaInfo;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "areaName='" + areaName + '\'' +
                ", areaInfo='" + areaInfo + '\'' +
                '}';
    }
}
