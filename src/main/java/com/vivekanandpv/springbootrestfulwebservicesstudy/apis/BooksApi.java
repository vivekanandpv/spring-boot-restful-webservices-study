package com.vivekanandpv.springbootrestfulwebservicesstudy.apis;

import com.vivekanandpv.springbootrestfulwebservicesstudy.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksApi {
    //  http://localhost:8080/api/v1/books
    @GetMapping
    public ResponseEntity<Book> getSingleV1() {
        Book book = new Book();
        book.setId(125);
        book.setTitle("Learning Spring Boot");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(826);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    //  http://localhost:8080/api/v1/books/single
    @GetMapping("single")
    public ResponseEntity<Book> getSingleV2() {
        Book book = new Book();
        book.setId(125);
        book.setTitle("Learning Spring Boot");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(826);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    //  http://localhost:8080/api/v1/books/foo
    //  http://localhost:8080/api/v1/books/bar
    @GetMapping({"foo", "bar"})
    public ResponseEntity<Book> getSingleV3() {
        Book book = new Book();
        book.setId(125);
        book.setTitle("Learning Spring Boot");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(826);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }
}
