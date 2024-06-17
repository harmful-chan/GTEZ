CREATE DATABASE IF NOT EXISTS `db_aliexpress` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `db_aliexpress`;

CREATE TABLE IF NOT EXISTS `t_access_token` (
    `id` bigint(20) unsigned NOT NULL,
    `refresh_token_valid_time` varchar(255) DEFAULT NULL,
    `havana_id` varchar(255) DEFAULT NULL,
    `code` varchar(255) DEFAULT NULL,
    `expire_time` varchar(255) DEFAULT NULL,
    `locale` varchar(255) DEFAULT NULL,
    `user_nick` varchar(255) DEFAULT NULL,
    `access_token` varchar(255) DEFAULT NULL,
    `refresh_token` varchar(255) DEFAULT NULL,
    `account_id` varchar(255) DEFAULT NULL,
    `user_id` varchar(255) DEFAULT NULL,
    `account_platform` varchar(255) DEFAULT NULL,
    `refresh_expires_in` varchar(255) DEFAULT NULL,
    `expires_in` varchar(255) DEFAULT NULL,
    `sp` varchar(255) DEFAULT NULL,
    `request_id` varchar(255) DEFAULT NULL,
    `seller_id` varchar(255) DEFAULT NULL,
    `account` varchar(255) DEFAULT NULL,
    `create_time` datetime DEFAULT NULL,
    `opt_time` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

USE `db_admin`;

CREATE TABLE IF NOT EXISTS `t_platform` (
    `id` bigint(20) unsigned NOT NULL,
    `platform` varchar(100)  DEFAULT NULL COMMENT '平台',
    `create_time` datetime DEFAULT NULL,
    `opt_time` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE IF NOT EXISTS `t_platform_user` (
    `id` bigint(20) unsigned NOT NULL,
    `platform_id` bigint(20)  unsigned NOT NULL COMMENT '平台ID',
    `user_id` bigint(20)  unsigned NOT NULL COMMENT '用户ID',
    `create_time` datetime DEFAULT NULL,
    `opt_time` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

CREATE TABLE IF NOT EXISTS `t_platform_menu` (
    `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
    `platform_id` bigint(20)  unsigned NOT NULL COMMENT '平台ID',
    `menu_id` bigint(20)  unsigned NOT NULL COMMENT '菜单ID',
    `create_time` datetime DEFAULT NULL,
    `opt_time` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

INSERT IGNORE INTO `t_platform` (`id`, `platform`, `create_time`, `opt_time`) VALUES (1, 'free', '2024-06-09 04:54:23', '2024-06-09 04:54:23');
INSERT IGNORE INTO `t_platform` (`id`, `platform`, `create_time`, `opt_time`) VALUES (2, 'all', '2024-06-09 04:54:23', '2024-06-09 04:54:23');
INSERT IGNORE INTO `t_platform` (`id`, `platform`, `create_time`, `opt_time`) VALUES (3, 'amazon', '2024-06-09 04:54:23', '2024-06-09 04:54:23');
INSERT IGNORE INTO `t_platform` (`id`, `platform`, `create_time`, `opt_time`) VALUES (4, 'aliexpress', '2024-06-09 04:54:23', '2024-06-09 04:54:23');

INSERT IGNORE INTO `t_platform_user` (`id`, `platform_id`, `user_id`, `create_time`, `opt_time`) VALUES (1, 2, 26138972975759242, '2024-06-09 00:00:00', '2024-06-09 00:00:00');

INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (1, 3, 35, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (2, 3, 102, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (3, 3, 24, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (4, 3, 1061, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (5, 3, 39, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (6, 3, 43, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (7, 3, 106, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (8, 3, 114, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (9, 3, 163, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (10, 3, 38, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (12, 3, 41, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (13, 3, 79, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (14, 3, 115, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (15, 3, 14, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (16, 3, 20, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (17, 3, 116, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (18, 3, 401, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (19, 3, 402, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (10, 3, 403, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (21, 3, 971, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (22, 3, 972, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (23, 3, 973, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (24, 3, 100, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (25, 3, 66, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (26, 3, 92, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (27, 3, 131, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (28, 3, 134, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (29, 3, 74, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (30, 3, 97, NULL, NULL);
INSERT IGNORE INTO `t_platform_menu` (`id`, `platform_id`, `menu_id`, `create_time`, `opt_time`) VALUES (31, 3, 101, NULL, NULL);

USE `db_admin`;
ALTER TABLE `t_sys_menu` ADD `platform_id` bigint(20) unsigned DEFAULT NULL COMMENT '平台ID';
# UPDATE `t_user` SET `platform_id` = 2 WHERE `id` = 26138972975759242;

REPLACE INTO `t_sys_menu` (`id`, `name`, `parent_id`, `apppath`, `path`, `component`, `icon`, `appicon`, `sort`, `visible`, `redirect`, `runui`, `runapp`, `gmt_create`, `gmt_modified`, `oldid`) VALUES (98, '产品管理', 126, NULL, '/erp/product/localproduct', 'erp/baseinfo/material/index', NULL, '', 51, 1, '/pages/inventory/material/material_list.jsp', b'1', NULL, NULL, NULL, 'b97ed6fc-2211-49b8-b641-20e0043200ad');

