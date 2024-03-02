package com.example.coolweather.db;


import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;

/**
 * @version: V1.0
 * @author: WenyiYin
 * @className: County
 * @packageName: com.example.coolweather.db
 * @description: 县级数据库
 * @date: 2024/3/1 15:44
 **/
public class County extends LitePalSupport {

    private int id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}
