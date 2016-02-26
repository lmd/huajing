
CREATE TABLE `sys_user` (
  `id` bigint(64) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `company_id` bigint(64) NOT NULL COMMENT '归属公司',
  `office_id` bigint(64) NOT NULL COMMENT '归属部门',
  `login_name` varchar(100) NOT NULL COMMENT '登录名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) 

insert into sys_user values('1','1','1','lmd','sorry');