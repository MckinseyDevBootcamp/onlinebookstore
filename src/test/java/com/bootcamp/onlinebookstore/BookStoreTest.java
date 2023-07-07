package com.bootcamp.onlinebookstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookStoreTest {
    @Test
    void shouldBeAbleToIssueBook() {
        BookStore bookStore = new BookStore();
        Book book = new Book();
        Boolean isBookIssued = bookStore.issue(book);

        assertTrue(isBookIssued);
    }
}
