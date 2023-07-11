package com.bootcamp.onlinebookstore.Service;

import com.bootcamp.onlinebookstore.Configuration.FeatureToggle;
import com.bootcamp.onlinebookstore.Model.Book;
import com.bootcamp.onlinebookstore.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private BookRepository repository;
    private FeatureToggle toggles;

    public BookService(BookRepository repository, FeatureToggle toggles) {
        this.repository = repository;
        this.toggles = toggles;
    }

    public List<Book> getAllBooks() {
        if(toggles.isEnabled("safeToShow")) {
            return repository.getAllBooks();
        }
        return null;
    }
}
