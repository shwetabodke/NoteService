package com.fundoonotes.noteservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fundoonotes.noteservice.model.Note;

public interface IUserDao extends JpaRepository<Note, Long> {

}
