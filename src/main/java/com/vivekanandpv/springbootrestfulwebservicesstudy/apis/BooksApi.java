package com.vivekanandpv.springbootrestfulwebservicesstudy.apis;

import com.vivekanandpv.springbootrestfulwebservicesstudy.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksApi {

    //  GET and DELETE methods do not typically process body of the incoming request
    //  Though not recommended, however, you can still consider a GET or DELETE with a body
    //  https://stackoverflow.com/a/983458/3969961
    @GetMapping
    public ResponseEntity<?> getSingle() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Book book) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateWithPut(@PathVariable int id, @RequestBody Book book) {
        return ResponseEntity.ok().build();
    }

    @PatchMapping("{id}")
    public ResponseEntity<?> updateWithPatch(@PathVariable int id, @RequestBody Book book) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }
}
