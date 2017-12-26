DROP TABLE IF EXISTS t_work_card;
create table t_work_card (
  id int(12) not null comment "编号",
  emp_id int(12) not null comment "雇员编号",
  vocation VARCHAR (64) not null comment "职位",
  department VARCHAR (64) not null comment "部门",
  note VARCHAR(256) not null comment "备注",
  PRIMARY KEY (id),
   CONSTRAINT `emp_id_WC`
  FOREIGN KEY (`emp_id`)
  REFERENCES `t_employee` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '工牌表'
PACK_KEYS = Default;