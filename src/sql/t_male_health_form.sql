DROP TABLE IF EXISTS t_male_health_form;
create table t_male_health_form (
  id int(12) not null comment "编号",
  emp_id int(12) not null comment "雇员编号",
  heart VARCHAR (64) not null comment "心",
  liver VARCHAR (64) not null comment "肝",
  spleen VARCHAR(64) not null comment "脾",
  lung VARCHAR(64) not null comment "肺",
  kidney VARCHAR(64) not null comment "肾",
  prostate VARCHAR(64) not null comment "前列腺",
  note VARCHAR(256) not null comment "备注",
  PRIMARY KEY (id),
  CONSTRAINT `emp_id_MHF`
  FOREIGN KEY (`emp_id`)
  REFERENCES `t_employee` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '男性体检表'
PACK_KEYS = Default;