package com.vivekanandpv.springbootrestfulwebservicesstudy.apis;

import com.vivekanandpv.springbootrestfulwebservicesstudy.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksApi {
    @GetMapping
    public ResponseEntity<?> getSingle() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> create() {
        return ResponseEntity.ok().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateWithPut(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }

    //  The main difference between the PUT and PATCH method is that
    //  the PUT method uses the request URI to supply a modified version
    //  of the requested resource which replaces the original version of
    //  the resource, whereas the PATCH method supplies a set of instructions
    //  to modify the resource. If the PATCH document is larger than
    //  the size of the new version of the resource sent by the PUT method
    //  then the PUT method is preferred.
    @PatchMapping("{id}")
    public ResponseEntity<?> updateWithPatch(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return ResponseEntity.ok().build();
    }
}
