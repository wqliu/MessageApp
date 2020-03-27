package com.wenqing.MessageApp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository; 
import com.wenqing.MessageApp.model.ChatHistoryData;

@Repository
public interface ChatHistoryDatadao extends MongoRepository<ChatHistoryData, Integer> {
	
}