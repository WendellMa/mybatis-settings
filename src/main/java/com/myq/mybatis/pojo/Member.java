package com.myq.mybatis.pojo;


import com.google.gson.Gson;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户类
 *
 * @author romens
 * @version 1.0
 */
public class Member {
    private String memberId;
    private String mobile;
    private String cardNum;
    private String nickName;
    private Date birthDate;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String print() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("memberId", getMemberId());
        map.put("mobile", getMobile());
        map.put("cardNum", getCardNum());
        map.put("nickName", getNickName());
        String birthDateStr = "";
        if (getBirthDate() != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            birthDateStr = simpleDateFormat.format(getBirthDate());
        }
        map.put("birthDate", birthDateStr);
        return new Gson().toJson(map);
    }
}
