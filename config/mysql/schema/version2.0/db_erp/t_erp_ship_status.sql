USE `db_amazon`;

INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('CANCELLED', '卖家在货件发送至亚马逊配送中心后取消了货件', '已取消');
INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('CHECKED_IN', '货件已在亚马逊配送中心的收货装卸地点登记', '已登记');
INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('CLOSED', '货件已到达亚马逊配送中心，但有部分商品尚未标记为已收到', '已完成');
INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('DELETED', '卖家在将货件发送到亚马逊配送中心之前取消了货件', '已删除');
INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('DELIVERED', '承运人已将货件配送至亚马逊配送中心', '已接受');
INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('ERROR', '货件出错，但不是由亚马逊处理的', '货件出错');
INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('IN_TRANSIT', '承运人已通知亚马逊配送中心其已知晓货件的存在', '在途');
INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('READY_TO_SHIP', '货件准备发货', '准备发货');
INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('RECEIVING', '货件已到达亚马逊配送中心，但有部分商品尚未标记为已收到', '正在接受');
INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('SHIPPED', '承运人已取件', '已发货');
INSERT IGNORE INTO `t_erp_ship_status` (`status`, `content`, `name`) VALUES ('WORKING', '卖家已创建货件，但未发货', '正在配货装箱');
