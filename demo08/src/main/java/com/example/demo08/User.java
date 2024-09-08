package com.example.demo08;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table	(name = "UserTbl")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;
	
	@Column(nullable = false)
	private String username;
	
	private int age;
}
