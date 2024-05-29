USE `db_amazon_adv`;

-- 正在导出表  db_wimoor.t_marketplace 的数据：~21 rows (大约)
INSERT IGNORE INTO `t_marketplace` (`marketplaceId`, `market`, `name`, `region_name`, `region`, `end_point`, `point_name`, `accessKey`, `secretKey`, `dim_units`, `weight_units`, `currency`, `findex`, `adv_end_point`, `aws_access_key`, `aws_secret_key`, `associate_tag`, `developer_url`, `dev_account_num`, `bytecode`, `sp_api_endpoint`, `aws_region`) VALUES
	('A13V1IB3VIYZZH', 'FR', '法国', '欧洲', 'EU', '', 'Amazon.fr', '', '', 'cm', 'kg', 'EUR', 5, '', '', '', '', '', '', 'Latin1', '', 'eu-west-1'),
	('A17E79C6D8DWNP', 'SA', '沙特', '欧洲', 'EU', '', 'Amazon.sa', '', '', 'cm', 'kg', 'SAR', 17, NULL, NULL, NULL, NULL, '', '', 'UTF-8', '', 'eu-west-1'),
	('A1805IZSGTT6HS', 'NL', '荷兰', '欧洲', 'EU', '', 'Amazon.nl', '', '', 'cm', 'kg', 'EUR', 16, NULL, NULL, NULL, NULL, '', '', 'Latin1', '', 'eu-west-1'),
	('A19VAU5U5O7RUS', 'SG', '新加坡', '远东', 'SG', '', 'Amazon.sg', '', '', NULL, NULL, 'SGD', 16, NULL, NULL, NULL, NULL, NULL, '', 'UTF-8', '', 'us-west-2'),
	('A1AM78C64UM0Y8', 'MX', '墨西哥', '北美', 'NA', '', 'Amazon.com.mx', '', '', 'cm', 'kg', 'MXN', 12, NULL, NULL, NULL, NULL, '', '', 'Latin1', '', 'us-east-1'),
	('A1C3SOZRARQ6R3', 'PL', '波兰', '欧洲', 'EU', '', 'Amazon.pl', '', '', 'cm', 'kg', 'PLN', 19, NULL, NULL, NULL, NULL, NULL, '', 'UTF-8', '', 'eu-west-1'),
	('A1F83G8C2ARO7P', 'UK', '英国', '欧洲', 'UK', '', 'Amazon.co.uk', '', '', 'cm', 'kg', 'GBP', 3, '', '', '', '', '', '', 'Latin1', '', 'eu-west-1'),
	('A1PA6795UKMFR9', 'DE', '德国', '欧洲', 'EU', '', 'Amazon.de', '', '', 'cm', 'kg', 'EUR', 4, '', '', '', '', '', '', 'Latin1', '', 'eu-west-1'),
	('A1RKKUPIHCS9HS', 'ES', '西班牙', '欧洲', 'EU', '', 'Amazon.es', '', '', 'cm', 'kg', 'EUR', 6, '', '', '', '', '', '', 'Latin1', '', 'eu-west-1'),
	('A1VC38T7YXB528', 'JP', '日本', '远东', 'JP', '', 'Amazon.co.jp', '', '', 'cm', 'kg', 'JPY', 8, '', NULL, NULL, NULL, '', '', 'Shift_JIS', '', 'us-west-2'),
	('A21TJRUUN4KGV', 'IN', '印度', '欧洲', 'IN', '', 'Amazon.in', '', '', 'cm', 'kg', 'INR', 10, '', NULL, NULL, '', '', '', 'UTF-8', '', 'eu-west-1'),
	('A2EUQ1WTGCTBG2', 'CA', '加拿大', '北美', 'NA', '', 'Amazon.ca', '', '', 'cm', 'kg', 'CAD', 2, '', NULL, NULL, NULL, '', '', 'UTF-8', '', 'us-east-1'),
	('A2NODRKZP88ZB9', 'SE', '瑞典', '欧洲', 'EU', '', 'Amazon.se', '', '', 'cm', 'kg', 'SEK', 20, NULL, NULL, NULL, NULL, NULL, '', 'UTF-8', '', 'eu-west-1'),
	('A2Q3Y263D00KWC', 'BR', '巴西', '北美', 'BR', '', 'Amazon.com.br', '', '', NULL, NULL, 'BRL', 13, NULL, NULL, NULL, NULL, NULL, '', 'Latin1', '', 'us-east-1'),
	('A2VIGQ35RCS4UG', 'AE', '阿联酋', '欧洲', 'AE', '', 'Amazon.ae', '', '', 'cm', 'kg', 'AED', 14, NULL, NULL, NULL, NULL, '', '', 'Latin1', '', 'eu-west-1'),
	('A33AVAJ2PDY3EV', 'TR', '土耳其', '欧洲', 'EU', '', 'Amazon.com.tr', '', '', NULL, NULL, 'TRY', 15, NULL, NULL, NULL, NULL, '', '', 'Latin1', '', 'eu-west-1'),
	('A39IBJ37TRP1C6', 'AU', '澳大利亚', '远东', 'AU', '	', 'Amazon.com.au', '', '', 'cm', 'kg', 'AUD', 9, '', NULL, NULL, NULL, '', '3484-6862-2072', 'UTF-8', '', 'us-west-2'),
	('AAHKV2X7AFYLW', 'CN', '中国', '远东', 'CN', '', 'Amazon.cn', NULL, '', NULL, NULL, 'CNY', 11, '', NULL, NULL, NULL, NULL, NULL, 'UTF-8', NULL, NULL),
	('APJ6JRA9NG5V4', 'IT', '意大利', '欧洲', 'EU', '', 'Amazon.it', '', '', 'cm', 'kg', 'EUR', 7, '', '', '', 'kuuqastore-21', '', '', 'Latin1', '', 'eu-west-1'),
	('ARBP9OOSHTCHU', 'EG', '埃及', '欧洲', 'EU', '', 'Egypt.souq.com', '', '', NULL, NULL, 'EUR', 18, NULL, NULL, NULL, NULL, NULL, '', 'UTF-8', '', 'eu-west-1'),
	('ATVPDKIKX0DER', 'US', '美国', '北美', 'NA', '', 'Amazon.com', '', '', 'in', 'lb', 'USD', 1, '', '', '', 'Kuuqa20-01', '', '2623-6518-2224', 'Latin1', '', 'us-east-1');
   