package com.mongo.movies.service;

import com.mongo.movies.entity.User;
import com.mongo.movies.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public ResponseEntity<User> findByID(String id) {
        return userRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.ok(null));
    }

    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
