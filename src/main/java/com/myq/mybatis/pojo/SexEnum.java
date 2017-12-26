package com.myq.mybatis.pojo;

/**
 * created on 17/12/26
 *
 * @author romens
 * @version 1.0
 */
public enum SexEnum {
    MALE(0, "女"), FEMALE(1, "男");
    private String name;
    private int id;

    private SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SexEnum getSexById(int id) {
        for (SexEnum sex : SexEnum.values()) {
            if (sex.getId() == id)
                return sex;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
