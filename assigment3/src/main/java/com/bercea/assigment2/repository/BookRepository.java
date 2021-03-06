package com.bercea.assigment2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bercea.assigment2.model.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {
	List<Book> findByAuthor(String author);
	
	void deleteById(int id);
}
