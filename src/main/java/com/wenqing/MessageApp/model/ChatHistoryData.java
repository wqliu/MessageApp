package com.wenqing.MessageApp.model;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.data.annotation.*;

public class ChatHistoryData{
	@Id
	private int id;
	public ChatMessage chatMessage;
	//private String name;
	//public LocalDate date;
	//public LocalTime time;
	
	public ChatHistoryData() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
