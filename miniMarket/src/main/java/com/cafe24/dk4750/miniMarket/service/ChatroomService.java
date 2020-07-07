package com.cafe24.dk4750.miniMarket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.dk4750.miniMarket.mapper.ChatroomMapper;
import com.cafe24.dk4750.miniMarket.vo.Chatroom;


@Service
@Transactional
public class ChatroomService {
	@Autowired
	private ChatroomMapper chatroomMapper;
	
	public Chatroom getChatRoomOne(int chatroomNo) {
	      return chatroomMapper.selectChatroomOne(chatroomNo);
	   }
	
	public List<Chatroom> getChatRoomListBymemberId(Chatroom chatroom) {
		List<Chatroom> list = new ArrayList<>();
		list = chatroomMapper.selectChatRoomByMemberId(chatroom);
		return list;
	}
	public int addChatRoom(Chatroom chatRoom) {
		System.out.println(chatRoom);
		int checkRoom = chatroomMapper.selectChatRoomCheck(chatRoom);
		if(checkRoom == 1) {
			return 0;
		}else {
			
			int chatroomNo =  chatroomMapper.selectMaxNum();
			System.out.println(chatroomNo + "<-- chatroomNo service");
			chatRoom.setChatroomNo(chatroomNo);
			
			return chatroomMapper.insertChatRoom(chatRoom);
		}
		 
	}
}