USE `db_amazon_adv`;

-- 正在导出表  db_wimoor.t_amz_region 的数据：~4 rows (大约)
INSERT IGNORE INTO `t_amz_region` (`code`, `name`, `advname`, `advpoint`, `client_id`, `client_secret`) VALUES
	('EU', '欧洲', 'Europe (EU). Covers UK, FR, IT, ES, DE, and AE marketplaces', 'advertising-api-eu.amazon.com', 'amzn1.application-oa2-client.b1cdd2f11e5677893w3xv1345ab123a1', '43ab21cd9876e543f32109gh87i65d4jk321huv112c123456ef789da23wxy432z'),
	('FE', '远东', 'Far East (FE). Covers JP and AU marketplaces.', 'advertising-api-fe.amazon.com', 'amzn1.application-oa2-client.b1cdd2f11e5677893w3xv1345ab123a1', '43ab21cd9876e543f32109gh87i65d4jk321huv112c123456ef789da23wxy432z'),
	('NA', '北美', 'North America (NA). Covers US and CA marketplaces', 'advertising-api.amazon.com', 'amzn1.application-oa2-client.b1cdd2f11e5677893w3xv1345ab123a1', '43ab21cd9876e543f32109gh87i65d4jk321huv112c123456ef789da23wxy432z'),
	('TT', '测试', 'All Marketplace', 'advertising-api-test.amazon.com', 'amzn1.application-oa2-client.b1cdd2f11e5677893w3xv1345ab123a1', '43ab21cd9876e543f32109gh87i65d4jk321huv112c123456ef789da23wxy432z');
