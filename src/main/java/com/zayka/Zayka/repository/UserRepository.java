package com.zayka.Zayka.repository;

import com.zayka.Zayka.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User , Object> {

        Optional<User> findByEmail(String email);
}
