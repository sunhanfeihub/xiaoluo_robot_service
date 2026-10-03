package xiaoluo.modules.device.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import xiaoluo.modules.device.entity.OtaEntity;

/**
 * OTA固件管理
 */
@Mapper
public interface OtaDao extends BaseMapper<OtaEntity> {
    
}