package xiaoluo.modules.agent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xiaoluo.common.dao.BaseDao;
import xiaoluo.modules.agent.entity.AgentTagRelationEntity;

import java.util.List;

@Mapper
public interface AgentTagRelationDao extends BaseDao<AgentTagRelationEntity> {

    int deleteByAgentId(@Param("agentId") String agentId);

    int insertRelation(AgentTagRelationEntity relation);

    int batchInsertRelation(@Param("list") List<AgentTagRelationEntity> relations);
}
