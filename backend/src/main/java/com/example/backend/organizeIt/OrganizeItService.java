package com.example.backend.organizeIt;

import com.example.backend.organizeIt.OrganizeIt;
import com.example.backend.organizeIt.OrganizeItRepoInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrganizeItService {

   public final OrganizeItRepoInterface organizeItRepoInterface;

    // Version with Exception
//    public List<OrganizeIt> getAllOrganize() {
//        List<OrganizeIt> organize = organizeRepo.findAll();
         // Add later an Exception here
//        return organize;
//    }

    public List<OrganizeIt> getAllOrganize() {
        //List<OrganizeIt> organizer = organizeItRepoInterface.findAll();
        if(organizeItRepoInterface == null) {
            //throw new NoSuchElementException("Nothing to organize found");
            throw new IllegalStateException("OrganizeItRepoInterface wurde nicht initialisiert.");
        }

        return organizeItRepoInterface.findAll();
    }

//    public OrganizeIt addOrganize(OrganizeIt organizeItToAdd) {
//        return organizeItRepoInterface.save(organizeItToAdd);
//    }
}
