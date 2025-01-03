package com.slykid.jpa.bookmanager.repository;

import com.slykid.jpa.bookmanager.domain.Book;
import com.slykid.jpa.bookmanager.domain.BookReviewInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookReviewInfoRepositoryTest {
    @Autowired
    private BookReviewInfoRepository bookReviewInfoRepository;

    @Autowired
    private BookRepository bookRepository;

    @Test
    void crudTest() {
        BookReviewInfo bookReviewInfo = new BookReviewInfo();
        //bookReviewInfo.setBookId(1L);
        bookReviewInfo.setAverageReviewScore(4.5f);
        bookReviewInfo.setReviewCount(2);

        bookReviewInfoRepository.save(bookReviewInfo);

        System.out.println(">>> " + bookReviewInfoRepository.findAll());
    }

    @Test
    void relationshipTest() {

        //givenBook();
        givenBookReviewInfo();


        // 연관관계 표시
//        Book result = bookRepository.findById(
//                bookReviewInfoRepository
//                        .findById(1L)
//                        .orElseThrow(RuntimeException::new)
//                        .getBookId()
//        ).orElseThrow(RuntimeException::new);  // @OneToOne 연관관계 추가에 따른 주석처리

        Book result = bookReviewInfoRepository
                .findById(1L)
                .orElseThrow(RuntimeException::new)
                .getBook();

        System.out.println(">>> " + result);

    }

    private Book givenBook() {
        Book book = new Book();
        book.setName("초격차 패키지");
        book.setAuthorId(1L);
        book.setPublisherId(1L);

        return bookRepository.save(book);
        //System.out.println(">>> " + bookRepository.findAll());  // @OneToOne 연관관계 추가에 따른 주석처리
    }

    private void givenBookReviewInfo() {
        BookReviewInfo bookReviewInfo = new BookReviewInfo();
        //bookReviewInfo.setBookId(1L);  // @OneToOne 연관관계 추가에 따른 주석처리
        bookReviewInfo.setBook(givenBook());
        bookReviewInfo.setAverageReviewScore(4.5f);
        bookReviewInfo.setReviewCount(2);

        bookReviewInfoRepository.save(bookReviewInfo);
        System.out.println(">>> " + bookReviewInfoRepository.findAll());
    }

}