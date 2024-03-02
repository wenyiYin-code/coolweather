package com.example.coolweather.until;


import android.text.TextUtils;

import com.example.coolweather.db.City;
import com.example.coolweather.db.County;
import com.example.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @version: V1.0
 * @author: WenyiYin
 * @className: Utility
 * @packageName: com.example.coolweather.until
 * @description: 这是Utility类,主要实现一些功能逻辑代码
 * @date: 2024/3/1 15:39
 **/
public class Utility {

    /**
    * @author:  WenyiYin
    * @methodsName: handleProvinceResponse
    * @description: 解析和处理服务器返回的省级数据
    * @param:  response
    * @return: boolean
    * @throws: JSONException
    * @date: 2024/3/1 14:44
    */
    public static boolean handleProvinceResponse(String response) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
    * @author:  WenyiYin
    * @methodsName: handleCityResponse
    * @description: 解析和处理服务器返回的市级数据
    * @param:  response、provinceId
    * @return: boolean
    * @throws: JSONException
    * @date: 2024/3/1 14:47
    */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCities = new JSONArray(response);
                for (int i = 0; i < allCities.length(); i++) {
                    JSONObject cityObject = allCities.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /**
    * @author:  WenyiYin
    * @methodsName: handleCountyResponse
    * @description: 解析和处理服务器返回的县级数据
    * @param:  response、cityId
    * @return: boolean
    * @throws: JSONException
    * @date: 2024/3/1 15:24
    */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!TextUtils.isEmpty(response)) {
            try {
                JSONArray allCounties = new JSONArray(response);
                for (int i = 0; i < allCounties.length(); i++) {
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}
