package com.example.backend;

import org.springframework.data.annotation.Id;

public record OrganizeIt(

        @Id
        String id,
        String name
) {

}
