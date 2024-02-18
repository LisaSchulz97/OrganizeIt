package com.example.backend.organizeIt;

import com.example.backend.organizeIt.OrganizeIt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrganizeItRepoInterface extends MongoRepository<OrganizeIt, String> {
}
