DROP TABLE IF EXISTS t_employee;
create table t_employee (
  id int(12) not null comment "任务编号",
  real_name VARCHAR (20) not null comment "姓名",
  sex int (2) not null comment "性别: 1-男 0-女",
  birthdate DATE  not null comment "出生日期",
  mobile VARCHAR(64)  not null comment "手机",
  email VARCHAR(64)  not null comment "邮箱",
  note VARCHAR(256) not null comment "备注",
  PRIMARY KEY (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '雇员表'
PACK_KEYS = Default;