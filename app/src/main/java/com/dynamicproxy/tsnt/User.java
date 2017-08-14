package com.dynamicproxy.tsnt;

/**
 * Created by ting说你跳 on 2017/8/14.
 */

public class User {
    public String name;
    public String sex;
    public String address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
