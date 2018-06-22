package com.fundoonotes.noteservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.fundoonotes.noteservice.dao.IUserDao;
import com.fundoonotes.noteservice.model.Note;

public class NoteService {
	
	@Autowired
	IUserDao userDao;
	
	public void register(Note note) {
		
	}

}
