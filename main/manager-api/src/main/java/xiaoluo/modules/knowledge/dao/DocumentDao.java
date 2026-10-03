package xiaoluo.modules.knowledge.dao;

import org.apache.ibatis.annotations.Mapper;
import xiaoluo.common.dao.BaseDao;
import xiaoluo.modules.knowledge.entity.DocumentEntity;

/**
 * 文档 DAO
 */
@Mapper
public interface DocumentDao extends BaseDao<DocumentEntity> {
}
