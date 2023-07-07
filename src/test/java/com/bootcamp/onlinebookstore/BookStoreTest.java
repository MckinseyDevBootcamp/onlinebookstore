package com.bootcamp.onlinebookstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class BookStoreTest {
    @Test
    void shouldBeAbleToIssueBook() {
        BookStore bookStore = new BookStore();
        Book book = new Book();
        Boolean isBookIssued = bookStore.issue(book);

        assertFalse(isBookIssued);
    }
}
