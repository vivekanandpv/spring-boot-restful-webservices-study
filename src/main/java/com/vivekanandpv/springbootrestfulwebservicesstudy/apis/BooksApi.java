package com.vivekanandpv.springbootrestfulwebservicesstudy.apis;

import com.vivekanandpv.springbootrestfulwebservicesstudy.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksApi {
    //  endpoints must have unique urls; query is not the part of url
    //  http://localhost:8080/api/v1/books/foo?title=Something&pages=458

    @GetMapping("foo")
    public ResponseEntity<Book> getQueryV1(@RequestParam(required = false) String title, @RequestParam int pages) {
        Book book = new Book();
        book.setId(125);
        book.setTitle(title != null ? title : "Default title");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(pages);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    @GetMapping("bar")
    public ResponseEntity<Book> getQueryV2(@RequestParam(required = false) String title, @RequestParam(required = false) Integer pages) {
        Book book = new Book();
        book.setId(125);
        book.setTitle(title != null ? title : "Default title");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(pages != null ? pages : 250);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }
}
