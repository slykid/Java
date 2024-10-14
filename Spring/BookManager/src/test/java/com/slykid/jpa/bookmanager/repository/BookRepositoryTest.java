package com.slykid.jpa.bookmanager.repository;

import com.slykid.jpa.bookmanager.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    void bookTest() {
        Book book = new Book();
        book.setName("JPA 초격차 패키지");
        book.setAuthor("slykid");

        bookRepository.save(book);

        System.out.println(bookRepository.findAll());
    }

}
