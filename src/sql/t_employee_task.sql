DROP TABLE IF EXISTS t_employee_task;
create table t_employee_task (
  id int(12) not null comment "任务编号",
  emp_id int(12) not null comment "雇员编号",
  task_id int (12) not null comment "任务编号",
  task_name VARCHAR(64)  not null comment "任务名称",
  note VARCHAR(256) not null comment "备注",
  PRIMARY KEY (id),
  CONSTRAINT `emp_id_ET`
  FOREIGN KEY (`emp_id`)
  REFERENCES `t_employee` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
  CONSTRAINT `task_id_ET`
  FOREIGN KEY (`task_id`)
  REFERENCES `t_task` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '雇员任务表'
PACK_KEYS = Default;