package com.fundoonotes.noteservice.service;

import java.util.List;

import com.fundoonotes.noteservice.model.Note;

public interface INoteService {
	
	void createNote(Note note);
	
	void updateNote();
	
	void deleteNote();
	
	List<Note> getAllNotes();

}
