package com.bootcamp.onlinebookstore.Service;


import com.bootcamp.onlinebookstore.Model.Book;
import com.bootcamp.onlinebookstore.Repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    BookService bookService;

    @MockBean
    BookRepository bookRepository;
    @Test
    void shouldBeAbleToGiveAllBooksWhenRequested() {
        List<Book> books = new ArrayList<>();
        Mockito.when(bookRepository.getAllBooks()).thenReturn(books);

        bookService.getAllBooks();
    }
}
