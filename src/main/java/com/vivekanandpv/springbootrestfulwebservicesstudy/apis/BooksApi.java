package com.vivekanandpv.springbootrestfulwebservicesstudy.apis;

import com.vivekanandpv.springbootrestfulwebservicesstudy.models.Book;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksApi {

    //  By default, the response type is JSON
    //  To produce an XML response, install the dependency:
    //  https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-xml

    //  If the accept header is passed with a different value (say application/json)
    //  406 Not Acceptable is returned
    @GetMapping(path = "xml", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<Book> getXML() {
        Book book = new Book();
        book.setId(125);
        book.setTitle("Learning Spring Boot");
        book.setAuthors(List.of("John Doe", "Mark David"));
        book.setDescription("Spring Boot for beginners");
        book.setPages(826);
        book.setPrice(1250.00);

        return ResponseEntity.ok(book);
    }

    //  Multiple output formats can be defined; this helps in content negotiation
    //  If no accept header is present, the first in the list will take the precedence

    //  If the accept header is passed with a different value (say application/ecmascript)
    //  406 Not Acceptable is returned
    @GetMapping(path = "multi", produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE }
    )
    public ResponseEntity<Book> getMulti() {
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
