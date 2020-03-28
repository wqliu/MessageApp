package com.wenqing.MessageApp.service;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.wenqing.MessageApp.dao.ChatHistoryDatadao;
import com.wenqing.MessageApp.model.ChatHistoryData;

@Service
public class ChatHistoryDataService {
	// The dao repository will use the Mongodb-Repository to perform the database operations.
    @Autowired
    ChatHistoryDatadao dao;
 
    public void createChatHistoryData(List<ChatHistoryData> chd) {
        dao.saveAll(chd);
    }
    
    public Optional<ChatHistoryData> findChatHistoryDataById(int id) {
    	return dao.findById(id);
    }
    
    public void updateChatHistoryData(ChatHistoryData c) {
    	dao.save(c);
    }
    
    public void deleteChatHistoryDataById(int id) {
        dao.deleteById(id);
    }
}
