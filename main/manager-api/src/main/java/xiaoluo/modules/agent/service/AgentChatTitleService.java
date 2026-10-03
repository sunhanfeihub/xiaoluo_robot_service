package xiaoluo.modules.agent.service;

import xiaoluo.modules.agent.entity.AgentChatTitleEntity;

public interface AgentChatTitleService {

    void saveOrUpdateTitle(String sessionId, String title);

    String getTitleBySessionId(String sessionId);
}