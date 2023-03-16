package com.vivekanandpv.springbootrestfulwebservicesstudy.apis;

import com.vivekanandpv.springbootrestfulwebservicesstudy.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksApi {
    @GetMapping
    public ResponseEntity<?> getSingle() {
        throw new RuntimeException("GET throws RuntimeException");
    }

    @PostMapping
    public ResponseEntity<?> create() {
        throw new RuntimeException("POST throws RuntimeException");
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateWithPut(@PathVariable int id) {
        throw new IllegalArgumentException("PUT throws IllegalArgumentException");
    }

    @PatchMapping("{id}")
    public ResponseEntity<?> updateWithPatch(@PathVariable int id) {
        throw new RuntimeException("PATCH throws RuntimeException");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable int id) throws IOException {
        throw new IOException("DELETE throws IOException");
    }

    @ExceptionHandler
    public ResponseEntity<?> handleRuntimeException(RuntimeException e) {
        return ResponseEntity.status(400).body(String.format("handleRuntimeException: %s", e.getMessage()));
    }

    //  This handler trumps the ControllerAdvice
    @ExceptionHandler
    public ResponseEntity<?> handleIllegalArgumentException(IllegalArgumentException e) {
        return ResponseEntity.status(400).body(String.format("handleIllegalArgumentException: %s", e.getMessage()));
    }
}
