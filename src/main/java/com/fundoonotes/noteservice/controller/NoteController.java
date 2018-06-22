package com.fundoonotes.noteservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fundoonotes.noteservice.model.Note;
import com.fundoonotes.noteservice.service.INoteService;
import com.fundoonotes.utilityservice.Response;

@RestController
public class NoteController {
	
	@Autowired
	INoteService noteService;

	@PostMapping(value="/createnote")
	public ResponseEntity<Response> createNote(@RequestBody Note note, @RequestParam("userId") Long userId){
		Response response = new Response();
		response.setMessage("Note Created Successfully..!!");
		response.setStatuscode(200);
		noteService.createNote(note);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
	}
	
	//@PutMapping(value="/updatenote")
	
}