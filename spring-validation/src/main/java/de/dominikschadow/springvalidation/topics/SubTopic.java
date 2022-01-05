package de.dominikschadow.springvalidation.topics;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SubTopic {
    @NotBlank
    @Size(min = 2, max = 20)
    private String name;
    @NotBlank
    @Size(min = 10, max = 200)
    private String description;
    @Min(1)
    @Max(1000)
    private int messages;
}
