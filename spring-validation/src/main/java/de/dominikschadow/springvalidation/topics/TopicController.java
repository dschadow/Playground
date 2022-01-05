package de.dominikschadow.springvalidation.topics;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
public class TopicController {
    @PostMapping(path = "topics")
    public ResponseEntity<Void> createTopic(@RequestBody @Valid Topic topic) {
        log.info("Topic: {}", topic);

        return ResponseEntity.ok().build();
    }
}
