package com.myq.mybatis.pojo;

/**
 * 男雇员
 *
 * @author romens
 * @version 1.0
 */
public class MaleEmployee extends Employee {
    private MaleHealthForm maleHealthForm = null;

    public MaleHealthForm getMaleHealthForm() {
        return maleHealthForm;
    }

    public void setMaleHealthForm(MaleHealthForm maleHealthForm) {
        this.maleHealthForm = maleHealthForm;
    }
}
