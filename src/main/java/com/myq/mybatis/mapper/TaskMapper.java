package com.myq.mybatis.mapper;

import com.myq.mybatis.pojo.Task;

/**
 * 任务
 *
 * @author romens
 * @version 1.0
 */
public interface TaskMapper {
    Task getTask(long id);
}
