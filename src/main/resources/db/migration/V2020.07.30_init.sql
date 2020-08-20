-- liquibase formatted sql

-- changeset vpispanen:role-table-1
CREATE TABLE `role_group`
(
    `id`   int(11)      NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    UNIQUE KEY `rg_name_UNIQUE` (`name`),
    PRIMARY KEY (`id`)
);

CREATE TABLE `role`
(
    `id`            int(11)      NOT NULL AUTO_INCREMENT,
    `name`          varchar(255) NOT NULL,
    `role_group_id` int(11) DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `r_name_UNIQUE` (`name`),
    CONSTRAINT `role_role_group_id_fk` FOREIGN KEY (`role_group_id`) REFERENCES `role_group` (`id`) on update cascade
);


-- changeset vpispanen:user-table-1
CREATE TABLE `user`
(
    `id`               int(11)                              NOT NULL AUTO_INCREMENT,
    `login`            varchar(255) COLLATE utf8_unicode_ci NOT NULL,
    `password`         varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
    `type`             char(5) COLLATE utf8_unicode_ci      NOT NULL,
    `facebook_profile` varchar(45) COLLATE utf8_unicode_ci  DEFAULT NULL,
    `google_uid`       varchar(45) COLLATE utf8_unicode_ci  DEFAULT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `u_login_UNIQUE` (`login`)
);

CREATE TABLE `user_roles`
(
    `user_id` int(11) NOT NULL,
    `role_id` int(11) NOT NULL,
    UNIQUE KEY `user_role_UK` (`user_id`, `role_id`),
    KEY `role_id_FK_idx` (`role_id`),
    CONSTRAINT `role_id_FK` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON UPDATE CASCADE,
    CONSTRAINT `user_id_FK` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON UPDATE CASCADE
);