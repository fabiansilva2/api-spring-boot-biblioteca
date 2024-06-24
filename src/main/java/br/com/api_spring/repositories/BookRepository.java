package br.com.api_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api_spring.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}