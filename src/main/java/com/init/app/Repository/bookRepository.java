package com.init.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.init.app.Models.bookModel;

@Repository
public interface bookRepository extends CrudRepository<bookModel, Long>  {

}
