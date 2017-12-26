package com.myq.mybatis.mapper;

import com.myq.mybatis.pojo.WorkCard;

/**
 * created on 17/12/26
 *
 * @author romens
 * @version 1.0
 */
public interface WorkCardMapper {
    public WorkCard getWorkCardByEmpId(long empId);
}
