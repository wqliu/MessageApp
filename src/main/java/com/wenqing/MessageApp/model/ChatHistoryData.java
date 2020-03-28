package com.wenqing.MessageApp.model;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ChatHistoryData")
public class ChatHistoryData{
	@Id
	private int id;
	public ChatMessage chatMessage;
	public LocalDate date;
	public LocalTime time;
	
	public ChatHistoryData() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
