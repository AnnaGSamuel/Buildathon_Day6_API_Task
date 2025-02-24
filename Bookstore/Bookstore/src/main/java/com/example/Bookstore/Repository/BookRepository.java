package com.example.Bookstore.Repository;

import com.example.Bookstore.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Books, Long> {
}
/*
{
    "bookTitle" : "Murder on the Orient Express",
    "author" : "Agatha Christie",
    "publishDate" : "10-02-1970",
    "publisher" : "Penguin",
    "edition" : "10",
    "category" : "mystery",
    "language" : "English",
    "format" : "Paperback",
    "synopsis" : "A train mystery",
    "rating" : "9",
    "price" : "499"
}
 */
