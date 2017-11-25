package com.myq.mybatis.pojo;

import org.apache.ibatis.type.Alias;

/**
 * 用户类
 *
 * @author romens
 * @version 1.0
 */
@Alias("user")
public class User {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
