DROP TABLE IF EXISTS t_task;
create table t_task (
  id int(12) not null comment "任务编号",
  title VARCHAR (20) not null comment "任务标题",
  content VARCHAR (256) not null comment "任务内容",
  note VARCHAR(256) not null comment "备注",
  PRIMARY KEY (id)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '任务表'
PACK_KEYS = Default;