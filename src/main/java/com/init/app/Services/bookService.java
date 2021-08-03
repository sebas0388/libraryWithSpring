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
		ArrayList<bookModel> books = (ArrayList<bookModel>)_bookRepository.findAll();	
		books.removeIf(b -> b.getActive() == false);
		return books;
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
	
	public boolean desactivatedbook(Long id) {
		Optional<bookModel> b = _bookRepository.findById(id);
		
		if(b.isPresent()) {
			b.get().setActive(false);
			_bookRepository.save(b.get());
			return true;
		}
		
		return false;
	}

	public boolean activedbook(Long id) {
			Optional<bookModel> b = _bookRepository.findById(id);
			
			if(b.isPresent()) {
				b.get().setActive(true);
				_bookRepository.save(b.get());
				return true;
			}
			
			return false;
		}		
		 
	}
