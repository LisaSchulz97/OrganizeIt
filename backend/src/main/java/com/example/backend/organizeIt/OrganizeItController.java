package com.example.backend.organizeIt;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class OrganizeItController {

    private final OrganizeItService organizerService;

    @GetMapping
    public List<OrganizeIt> getOrganizer() {
        return organizerService.getAllOrganize();
    }

    @PostMapping
    public OrganizeIt addOrganize(@RequestBody OrganizeIt organizeItToAdd) {
        return organizerService.addOrganize(organizeItToAdd);
    }

}
