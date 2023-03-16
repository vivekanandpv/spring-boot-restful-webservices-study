package com.vivekanandpv.springbootrestfulwebservicesstudy.apis;

import com.vivekanandpv.springbootrestfulwebservicesstudy.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/books")
public class BooksApi {
    @GetMapping("foo")
    public ResponseEntity<Book> getQueryV1(@RequestParam Optional<String> title) {
        Book book = new Book();
        book.setId(125);
        book.setTitle(title.orElse("Default title"));
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(755);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    @GetMapping("bar")
    public ResponseEntity<Book> getQueryV2(@RequestParam(name = "title") String varTitle, @RequestParam Optional<Integer> pages) {
        Book book = new Book();
        book.setId(125);
        book.setTitle(varTitle != null ? varTitle : "Default title");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(pages.orElse(250));
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    @GetMapping("baz")
    public ResponseEntity<Book> getQueryV3(@RequestParam Map<String, String> params) {
        Book book = new Book();
        book.setId(125);
        book.setTitle(params.getOrDefault("title", "Default title"));
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription(params.getOrDefault("description", "Default description"));
        book.setPages(755);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    @GetMapping("qux")
    public ResponseEntity<Book> getQueryV4(@RequestParam(defaultValue = "Default title") String title, @RequestParam Optional<Integer> pages) {
        Book book = new Book();
        book.setId(125);
        book.setTitle(title);
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(pages.orElse(250));
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    //  ?descriptions=good,book,here
    @GetMapping("quux")
    public ResponseEntity<Book> getQueryV5(@RequestParam List<String> descriptions) {
        Book book = new Book();
        book.setId(125);
        book.setTitle("Learning Spring");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription(String.join(";", descriptions));
        book.setPages(250);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }
}
