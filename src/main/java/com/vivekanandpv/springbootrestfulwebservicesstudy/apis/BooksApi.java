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
    @GetMapping
    public ResponseEntity<Book> getSingle() {
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
