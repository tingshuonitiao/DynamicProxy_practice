package com.dynamicproxy.tsnt;

import com.google.gson.Gson;

import java.util.Map;

/**
 * Created by ting说你跳 on 2017/8/14.
 */

public class NetWorkHelper {
    private static final Gson sGson = new Gson();

    public static String request(String url, Map<String, Object> params) {
        if (params != null) {
            if ("ting说你跳".equals(params.get("username"))
                    && "123456".equals(params.get("password"))) {

                User user = new User();
                user.address = "上海";
                user.sex = "男";
                user.name = "ting说你跳";
                return sGson.toJson(user);
            }
        }
        return null;
    }
}
