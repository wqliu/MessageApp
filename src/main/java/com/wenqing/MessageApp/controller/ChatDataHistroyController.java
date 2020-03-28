package com.wenqing.MessageApp.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenqing.MessageApp.model.ChatHistoryData;
import com.wenqing.MessageApp.service.ChatHistoryDataService;

@RestController
@RequestMapping(value= "/api/mongo/ChatHistoryData")
public class ChatDataHistroyController {	 
    @Autowired
    ChatHistoryDataService serv;
 
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
 
    /**
     * Method to save ChatHistoryData in the db.
     * @param chd
     * @return
     */
    @PostMapping(value= "/create")
    public String create(@RequestBody List<ChatHistoryData> chd) {
        logger.debug("Saving ChatHistoryData.");
        serv.createChatHistoryData(chd);
        return "Chat History Data created successfully!";
    }
    
    @GetMapping(value="/read/{chatid}")
    public Optional<ChatHistoryData> read(@PathVariable(value="chatid") int id) {
    	logger.debug("Reading ChatHistoryData. ");
    	System.out.println(id);
    	return serv.findChatHistoryDataById(id);
    }
    
    @PutMapping(value= "/update/{chatid}")
    public String update(@PathVariable(value= "chatid") int id, @RequestBody ChatHistoryData c) {
        logger.debug("Updating ChatHistoryData with id= {}.", id);
        c.setId(id);
        serv.updateChatHistoryData(c);
        return "Chat History Data record for id= " + id + " updated.";
    }
    
    @DeleteMapping(value= "/delete/{chatid}")
    public String delete(@PathVariable(value= "chatid") int id) {
        logger.debug("Deleting Chat History Data with id= {}.", id);
        serv.deleteChatHistoryDataById(id);
        return "Chat History Data record for id= " + id + " deleted.";
    }
}
