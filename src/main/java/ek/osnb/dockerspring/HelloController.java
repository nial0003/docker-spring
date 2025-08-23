package ek.osnb.dockerspring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public record Message(String msg) {}

    @GetMapping
    public ResponseEntity<Message> hello() {
        return ResponseEntity.ok(new Message("Hello, Docker!"));
    }
}
