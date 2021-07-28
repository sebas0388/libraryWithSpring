package com.init.app.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.app.Models.authorModel;
import com.init.app.Services.authorService;

@RestController
@RequestMapping("/author")

public class authorController {

	@Autowired
	authorService _authorService;
	
	@GetMapping()
	public ArrayList<authorModel> searchAll(){
		return _authorService.searchAll();
	}
	
	@GetMapping(path="/{id}")
	public Optional<authorModel> searchById(@PathVariable("id") Long id) {
		return _authorService.searchById(id);
    }
	
	@PostMapping()
	public authorModel saveAuthor(@RequestBody authorModel b) {
		return _authorService.saveAuthor(b);
	}	
}
