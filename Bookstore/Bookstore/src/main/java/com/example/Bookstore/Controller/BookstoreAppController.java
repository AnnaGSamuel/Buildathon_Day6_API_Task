package com.example.Bookstore.Controller;

import com.example.Bookstore.Models.Books;
import com.example.Bookstore.Repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookstoreAppController {

    @Autowired
    private BookRepository bookRepo;

    @Transactional
    @PostMapping("/addBook")
    public ResponseEntity <Map<String,String>> addBook(@RequestBody Books book) {
        Books bookObj = bookRepo.save(book);

        Map<String,String> response = new HashMap<>();

        response.put("Status","Book added successfully");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/retrieveBooks")
    public ResponseEntity <List<Books>> retrieveBooks(){
        List<Books> books = bookRepo.findAll();

        return ResponseEntity.ok(books);
    }
}
