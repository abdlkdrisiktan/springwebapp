package com.guru.springframework.springwebapp.controllers;

import com.guru.springframework.springwebapp.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookControlller {

    private BookRepository bookRepository;

    public BookControlller(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    private String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll());

        return "books";
    }
}
