package com.init.app.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.app.Models.bookModel;
import com.init.app.Repository.bookRepository;


@Service
public class bookService {
	
	@Autowired
	bookRepository _bookRepository;
	
	public ArrayList<bookModel> searchAll(){
		return (ArrayList<bookModel>)_bookRepository.findAll();
	}	

	public Optional<bookModel> searchById(Long id) {
		return _bookRepository.findById(id);
	}
	
	public bookModel saveBook(bookModel b) {
	       return _bookRepository.save(b);
			}
		
	public Optional<bookModel> deleteBook(Long id) {	
		return _bookRepository.findById(id);
	}
	
}
