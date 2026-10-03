-- 小洛品牌迁移：将数据库中的 xiaozhi 品牌数据更新为 xiaoluo
-- 新增变更集（不改动历史变更集，避免 liquibase checksum 校验失败）

-- 1. 系统名称
UPDATE `sys_params` SET `param_value` = 'xiaoluo-esp32-server' WHERE `param_code` = 'server.name' AND `param_value` = 'xiaozhi-esp32-server';

-- 2. param_code 'xiaozhi' -> 'xiaoluo'（欢迎消息配置段，与 config.yaml 的 xiaoluo: 段对应）
UPDATE `sys_params` SET `param_code` = 'xiaoluo' WHERE `param_code` = 'xiaozhi';

-- 3. 控制面板地址
UPDATE `sys_params` SET `param_value` = 'http://xiaoluo.server.com' WHERE `param_code` = 'server.fronted_url' AND `param_value` = 'http://xiaozhi.server.com';

-- 4. 系统其他默认参数值中的 xiaozhi 字符串
UPDATE `sys_params` SET `param_value` = REPLACE(`param_value`, 'xiaozhi', 'xiaoluo') WHERE `param_code` IN ('server.name', 'server.fronted_url') AND `param_value` LIKE '%xiaozhi%';
