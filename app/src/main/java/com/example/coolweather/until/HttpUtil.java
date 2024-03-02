package com.example.coolweather.until;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @version: V1.0
 * @author: WenyiYin
 * @className: HttpUtil
 * @packageName: com.example.coolweather.until
 * @description: 这是HttpUtil类，主要用于http相关代码实现
 * @date: 2024/3/1 14:34
 **/
public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();//用于发送HTTP请求类
        Request request = new Request.Builder().url(address).build();//用于构建包含指定地址的HTTP请求
        client.newCall(request).enqueue(callback);//调用client的newCall方法并传入request对象和callback对象来实际发送HTTP请求。
    }

}
