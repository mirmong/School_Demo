package com.exam.demopro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.exam.demopro.entity.Book;
import com.exam.demopro.service.BookService;

@Controller
public class BookController {

	// @ModelAttribute <T> 변수명 : view 영역에서 데이터를 받을 때 사용
	// Model 객체 : 이 곳 Controller에서 view로 데이터를 줄 때 사용
	// model.addAttribute("key",value) 
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";	// hello.html
	}
	
	@Autowired
	BookService bookServ;
	
//	처음 화면
	@GetMapping("/")
	public String index() {
		return "index";	// index.html
	}
	
//	책 목록 화면
	@GetMapping("/bList")
	public String viewBookList(Model model) {
		List<Book> books = bookServ.getAllBooks();
		model.addAttribute("allBooks", books);
		return "/book/bList";	// /book/bList.html
	}
	
//	책 수정 화면	
	@GetMapping("/bUpdate/{id}")
	public String bUpdate(@PathVariable("id") Long id, Model model) {
		model.addAttribute("book", bookServ.getBookById(id));
		return "/book/bUpdate";	// /book/bUpdate.html
	}
	
//	책 상세 화면
	@GetMapping("/bRead/{id}")
	public String bRead(@PathVariable("id") Long id, Model model) {
		model.addAttribute("book", bookServ.getBookById(id));
		return "/book/bRead";	// /book/bRead.html
	}
	
//	책 등록 화면
	@GetMapping("/bCreate")
	public String bCreate() {
		return "/book/bCreate";	// /book/bCreate.html
	}
	
//	책 등록 처리
	@PostMapping("/bCreate")
	public String createBook(@ModelAttribute Book book) {
		bookServ.saveBook(book);
		return "redirect:/bList";	// /book/bList.html
	}
	
//	책 수정 처리
	@PostMapping("/bUpdate/{id}")
	public String updateBook(@PathVariable("id") Long id, @ModelAttribute Book book) {
		bookServ.updateBook(book);
		return "redirect:/bList";	// /book/bList.html
	}
	
//	책 삭제 처리
	@GetMapping("/bDelete/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		bookServ.delteBook(id);
		return "redirect:/bList";	// /book/bList.html
	}
}
