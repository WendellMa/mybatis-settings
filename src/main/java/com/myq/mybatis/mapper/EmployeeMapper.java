package com.myq.mybatis.mapper;

import com.myq.mybatis.pojo.Employee;

/**
 * created on 17/12/26
 *
 * @author romens
 * @version 1.0
 */
public interface EmployeeMapper {
    Employee getEmployee(long id);
}
