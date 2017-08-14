package com.dynamicproxy.tsnt;

import java.util.Map;

/**
 * Created by ting说你跳 on 2017/8/14.
 */

public class Request implements IRequest {
    String              url;
    Map<String, Object> params;
    Class<?>            responseCls;

    public Request(String url, Map<String, Object> params, Class<?> responseCls) {
        this.url = url;
        this.params = params;
        this.responseCls = responseCls;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Map<String, Object> params() {
        return params;
    }

    @Override
    public Class<?> responseCls() {
        return responseCls;
    }
}
