package com.example.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrganizeItService {

   private final OrganizeItRepoInterface organizeRepo;

    // Version with Exception
//    public List<OrganizeIt> getAllOrganize() {
//        List<OrganizeIt> organize = organizeRepo.findAll();
         // Add later an Exception here
//        return organize;
//    }

    public List<OrganizeIt> listOrganizations() { return organizeRepo.findAll(); }


    public OrganizeIt addOrganize(OrganizeIt organizeItToAdd) {
        return organizeRepo.save(organizeItToAdd);
    }
}
