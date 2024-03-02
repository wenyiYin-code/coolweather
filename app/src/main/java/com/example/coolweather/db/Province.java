package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * @version: V1.0
 * @author: WenyiYin
 * @className: Province
 * @packageName: com.example.coolweather.db
 * @description: 省级数据库
 * @date: 2024/3/1 15:45
 **/
public class Province extends LitePalSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}