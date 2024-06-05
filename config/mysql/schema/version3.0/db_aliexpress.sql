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
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
