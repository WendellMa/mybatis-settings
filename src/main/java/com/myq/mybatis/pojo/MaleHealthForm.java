package com.myq.mybatis.pojo;

/**
 * 男性体检表
 *
 * @author romens
 * @version 1.0
 */
public class MaleHealthForm extends HealthForm{
    private String prostate;

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }
}
