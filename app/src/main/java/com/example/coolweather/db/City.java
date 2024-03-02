package com.example.coolweather.db;


import org.litepal.crud.LitePalSupport;

/**
 * @version: V1.0
 * @author: WenyiYin
 * @className: City
 * @packageName: com.example.coolweather.db
 * @description: 市级数据库
 * @date: 2024/3/1 15:44
 **/
public class City extends LitePalSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}
