package de.dominikschadow.springvalidation.topics;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class Admin {
    @NotBlank
    @Size(min = 2, max = 20)
    private String name;
    @NotBlank
    @Email
    private String email;
}
