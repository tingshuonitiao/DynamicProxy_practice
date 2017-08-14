package com.dynamicproxy.tsnt;

import com.google.gson.Gson;

/**
 * Created by ting说你跳 on 2017/8/14.
 */

public class DefaultNetExecutor implements INetExecutor {

    private static final Gson sGson = new Gson();

    @Override
    public <T> T execute(IRequest request) {
        String response = NetWorkHelper.request(request.url(), request.params());
        return (T) sGson.fromJson(response, request.responseCls());
    }
}
