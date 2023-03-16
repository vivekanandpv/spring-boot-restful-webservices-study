package com.vivekanandpv.springbootrestfulwebservicesstudy.apis;

import com.vivekanandpv.springbootrestfulwebservicesstudy.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksApi {
    //  http://localhost:8080/api/v1/books
    @GetMapping
    public ResponseEntity<Book> get() {
        Book book = new Book();
        book.setId(125);
        book.setTitle("Learning Spring Boot");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(826);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    //  http://localhost:8080/api/v1/books/<id>
    @GetMapping("{id}")
    public ResponseEntity<Book> getByIdV1(@PathVariable int id) {
        Book book = new Book();
        book.setId(id);
        book.setTitle("Learning Spring Boot");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(826);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    //  http://localhost:8080/api/v1/books/var/<id>
    @GetMapping("var/{id}")
    public ResponseEntity<Book> getByIdV2(@PathVariable("id") int varId) {
        Book book = new Book();
        book.setId(varId);
        book.setTitle("Learning Spring Boot");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(826);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    //  http://localhost:8080/api/v1/books/<id>/<price>
    @GetMapping("{id}/{price}")
    public ResponseEntity<Book> getByIdV3(@PathVariable int id, @PathVariable double price) {
        Book book = new Book();
        book.setId(id);
        book.setTitle("Learning Spring Boot");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(826);
        book.setPrice(price);

        return ResponseEntity.ok(book);
    }
}
