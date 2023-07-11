package com.bootcamp.onlinebookstore.Repository;

import com.bootcamp.onlinebookstore.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    private List<Book> books;

    public List<Book> getAllBooks() {
        return books;
    }
}
