package xiaoluo.modules.security.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import xiaoluo.modules.security.dao.SysUserTokenDao;
import xiaoluo.modules.security.entity.SysUserTokenEntity;
import xiaoluo.modules.security.service.ShiroService;
import xiaoluo.modules.sys.dao.SysUserDao;
import xiaoluo.modules.sys.entity.SysUserEntity;

@AllArgsConstructor
@Service
public class ShiroServiceImpl implements ShiroService {
    private final SysUserDao sysUserDao;
    private final SysUserTokenDao sysUserTokenDao;

    @Override
    public SysUserTokenEntity getByToken(String token) {
        return sysUserTokenDao.getByToken(token);
    }

    @Override
    public SysUserEntity getUser(Long userId) {
        return sysUserDao.selectById(userId);
    }
}