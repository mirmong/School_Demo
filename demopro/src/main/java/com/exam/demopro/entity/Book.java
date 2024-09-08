package com.exam.demopro.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "BookTbl")
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	// DB에서의 자동 증가값 설정
	private Long bookId;
	
	@Column(length = 50)
	private String title;
	
	@Column(length = 20)
	private String author;
	
	private Integer price;
	
	@CreationTimestamp
	private LocalDateTime readDateTime;
}
