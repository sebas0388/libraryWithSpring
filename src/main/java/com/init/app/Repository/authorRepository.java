package com.init.app.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.init.app.Models.authorModel;

@Repository
public interface authorRepository extends CrudRepository<authorModel, Long> {

}
