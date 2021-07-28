package com.init.app.Services;

import java.util.ArrayList;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.app.Models.authorModel;
import com.init.app.Repository.authorRepository;

@Service
public class authorService {

	@Autowired
	authorRepository _authorRepository;
	
	public ArrayList<authorModel> searchAll(){
		return (ArrayList<authorModel>)_authorRepository.findAll();
	}
	
	public Optional<authorModel> searchById(Long id) {
		return _authorRepository.findById(id);
	}
	
	public authorModel saveAuthor(authorModel b) {
	       return _authorRepository.save(b);
    }	
 }
