package xiaoluo.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import xiaoluo.common.dao.BaseDao;
import xiaoluo.modules.sys.entity.SysUserEntity;

/**
 * 系统用户
 */
@Mapper
public interface SysUserDao extends BaseDao<SysUserEntity> {

}