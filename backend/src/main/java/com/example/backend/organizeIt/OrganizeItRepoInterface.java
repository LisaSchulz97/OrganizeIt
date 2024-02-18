package com.example.backend.organizeIt;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizeItRepoInterface extends MongoRepository<OrganizeIt, String> {
}
