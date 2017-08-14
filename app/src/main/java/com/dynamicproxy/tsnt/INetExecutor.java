package com.dynamicproxy.tsnt;

/**
 * Created by ting说你跳 on 2017/8/14.
 */

public interface INetExecutor {

    <T> T execute(IRequest request);
}
