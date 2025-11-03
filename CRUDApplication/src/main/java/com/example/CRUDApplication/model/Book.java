package com.example.CRUDApplication.model;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {
	
	@SequenceGenerator(
	        name = "book_sequence",
	        sequenceName = "book_sequence",
	        allocationSize = 1
	    )
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "book_sequence")
	private Long id;
	private String title;
	private String author;
	
}
