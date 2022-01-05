package de.dominikschadow.springvalidation.topics;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Data
public class Topic {
    @NotBlank
    @Size(min = 5, max = 20)
    private String name;
    @NotBlank
    @Size(min = 10, max = 200)
    private String description;
    @Min(1)
    @Max(1000)
    private int messages;
    @NotNull
    @Size(min = 1, max = 10)
    @Valid
    private List<SubTopic> subtopics;
    @NotNull
    @Valid
    private Admin admin;
}
