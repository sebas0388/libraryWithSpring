package com.init.app.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.app.Models.bookModel;
import com.init.app.Services.bookService;

@RestController
@RequestMapping("/book")

public class bookController {

	@Autowired
	bookService _bookService;
	
	@GetMapping()
	public ArrayList<bookModel> searchAll(){
		return _bookService.searchAll();
	}
	
	@GetMapping(path="/{id}")
	public Optional<bookModel> searchById(@PathVariable("id") Long id) {
		return _bookService.searchById(id);
    }
	
	@PostMapping()
	public bookModel saveBook(@RequestBody bookModel b) {
		return _bookService.saveBook(b);
	}	
	
	@DeleteMapping(path="/{id}")
	public Optional<bookModel> deleteBook(@PathVariable("id") Long id) {
		return _bookService.deleteBook(id);		
	}
		
	@PostMapping(path="/desactivated/{id}")
	public String desactivatedbook(@PathVariable("id") Long id) {
			boolean b = _bookService.desactivatedbook(id);
			
			if(b) {
				return "Se desactivo el libro seleccionado";
			}else {
				return "Error al desactivar el libro";
			}
	}
	
	@PostMapping(path="/actived/{id}")
    public String activedbook(@PathVariable("id") Long id) {
				boolean b = _bookService.activedbook(id);
				
				if(b) {
					return "El libro seleccionado está disponible para la venta";
				}else {
					return "Error al activar el libro seleccionado para la venta";
				}
			}
 }
