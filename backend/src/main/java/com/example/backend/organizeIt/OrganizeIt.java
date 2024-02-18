package com.example.backend.organizeIt;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;

public record OrganizeIt(

        @Id
        String id,
        @NotBlank(message = "Name is required")
        @Size(min = 1, max = 5000)
        String name
) {

}
