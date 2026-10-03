package xiaoluo.modules.agent.service;

import xiaoluo.common.page.PageData;
import xiaoluo.common.service.BaseService;
import xiaoluo.modules.agent.dto.AgentSnapshotPageDTO;
import xiaoluo.modules.agent.entity.AgentSnapshotEntity;
import xiaoluo.modules.agent.vo.AgentSnapshotVO;

public interface AgentSnapshotService extends BaseService<AgentSnapshotEntity> {
    void createSnapshot(String agentId, String source);

    PageData<AgentSnapshotVO> page(String agentId, AgentSnapshotPageDTO params);

    AgentSnapshotVO getSnapshot(String agentId, String snapshotId);

    void restoreSnapshot(String agentId, String snapshotId, String currentStateToken);

    void deleteSnapshot(String agentId, String snapshotId);

    Integer getCurrentVersionNo(String agentId);

    void deleteByAgentId(String agentId);

    long redactLegacySnapshots();
}
