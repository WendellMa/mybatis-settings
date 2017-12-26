package com.myq.mybatis.mapper;

import com.myq.mybatis.pojo.EmployeeTask;

import java.util.List;

/**
 * created on 17/12/26
 *
 * @author romens
 * @version 1.0
 */
public interface EmployeeTaskMapper {
    public List<EmployeeTask> getEmployeeTaskByEmpId(long empId);
}
