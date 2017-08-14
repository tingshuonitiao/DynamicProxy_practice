package com.dynamicproxy.tsnt;

/**
 * Created by ting说你跳 on 2017/8/15.
 */

@URL("http://tsnt.dynamicproxy.com")
public interface LoginApi {
    User login(@Param("username") String username,
               @Param("password") String password);
}
