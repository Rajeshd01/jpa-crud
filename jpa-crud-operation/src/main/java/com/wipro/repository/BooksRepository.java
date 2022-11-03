package com.wipro.repository;

import org.springframework.data.repository.CrudRepository;  
import com.wipro.model.Books;  
 
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  
