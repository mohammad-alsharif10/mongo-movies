package com.mongo.movies.service;

import com.mongo.movies.entity.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MovieService {
    public ResponseEntity<Page<Movie>> getPage(int pageNumber, int pageSize) {
        return null;
    }

    public ResponseEntity<Movie> findByID(String id) {
        return null;
    }
}
