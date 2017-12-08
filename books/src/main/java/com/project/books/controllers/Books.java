package com.project.books.controllers;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.project.books.models.Book;

@Controller
public class Books {
    @RequestMapping("/books")
    public String books(Model model) {
        List<Book> books = new ArrayList(Arrays.asList(
            new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
            new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
            new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
            new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
            new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
            ));
        model.addAttribute("books", books);
        return "books";
    }
    @RequestMapping("/bookslist")
    public String booksList(Model model) {
        List<Book> books = new ArrayList(Arrays.asList(
            new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309),
            new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180),
            new Book("Moby Dick", "The saga of Captain Ahab", "english", 544),
            new Book("Don Quixote", "Life of a retired country gentleman", "english", 150),
            new Book("The Odyssey", "Ancient Greek epic poem", "english", 475)
            ));
        model.addAttribute("books", books);
        return "bookslist";
    }
}