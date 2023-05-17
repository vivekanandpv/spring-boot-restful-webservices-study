package com.vivekanandpv.springbootrestfulwebservicesstudy.apis;

import com.vivekanandpv.springbootrestfulwebservicesstudy.models.Book;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksApi {

    //  For XML support
    //  https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-xml

    //  For XML deserialization we need:
    //  https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.15.0
    @GetMapping
    public ResponseEntity<?> getSingle() {
        return ResponseEntity.ok().build();
    }

    //  Content-Type in the request must now be explicit
    //  Either application/json or application/xml
    //  415 Unsupported media-type if neither
    @PostMapping(
            consumes = {
                    MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE
            }
    )
    public ResponseEntity<?> create(@RequestBody Book book) {
        return ResponseEntity.ok().build();
    }

    //  XML body for testing
    //  <Book>
    //      <id>125</id>
    //      <title>Learning Spring Boot</title>
    //      <description>Spring Boot for beginners</description>
    //      <authors>
    //          <authors>John Doe</authors>
    //          <authors>Mark David</authors>
    //      </authors>
    //      <pages>826</pages>
    //      <price>1250.0</price>
    //  </Book>
}
