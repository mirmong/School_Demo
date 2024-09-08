package com.exam.demopro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exam.demopro.entity.Book;
import com.exam.demopro.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor	// final로 정의된 객체의 생성자 자동 생성
public class BookService {

	private final BookRepository bookRepo;
	
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}
	
	public Book getBookById(Long id) {
		// Optional<T> 는 NPE를 방지해준다.
		Optional<Book> book = bookRepo.findById(id);
		return book.get();
	}
	
	public void saveBook(Book book) {
		bookRepo.save(book);
	}
	
	public void updateBook(Book book) {
		bookRepo.save(book);
	}
	
	public void delteBook(Long id) {
		bookRepo.deleteById(id);
	}
}