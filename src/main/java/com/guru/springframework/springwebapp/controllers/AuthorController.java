package com.guru.springframework.springwebapp.controllers;

import com.guru.springframework.springwebapp.repository.AuthorReporsitory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private AuthorReporsitory authorReporsitory;

    public AuthorController(AuthorReporsitory authorReporsitory) {
        this.authorReporsitory = authorReporsitory;
    }

    @RequestMapping("/authors")
    public String getAuthos(Model model){
        model.addAttribute("authors",authorReporsitory.findAll());
        return "authors";
    }
}
