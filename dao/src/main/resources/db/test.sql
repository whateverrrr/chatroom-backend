CREATE TABLE `user`
(
    `id`    BIGINT(20) NOT NULL COMMENT '主键ID',
    `name`  VARCHAR(30) DEFAULT NULL COMMENT '姓名',
    `age`   INT(11)     DEFAULT NULL COMMENT '年龄',
    `email` VARCHAR(50) DEFAULT NULL COMMENT '邮箱',
    primary key (`id`)
) ENGINE = InnoDB
  DEFAULT charset = utf8;


INSERT INTO USER (id, NAME, age, email)
VALUES (1, 'Jone', 18, 'test1@baomidou.com'),
       (2, 'Jack', 19, 'test2@baomidou.com'),
       (3, 'Tom', 20, 'test3@baomidou.com'),
       (4, 'Sandy', 21, 'test4@baomidou.com'),
       (5, 'Billie', 22, 'test5@baomidou.com');