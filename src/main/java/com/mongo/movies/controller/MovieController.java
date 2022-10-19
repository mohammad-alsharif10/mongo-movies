package com.mongo.movies.controller;


import com.mongo.movies.entity.Movie;
import com.mongo.movies.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/getPage")
    public ResponseEntity<Page<Movie>> getPage(@RequestParam int pageNumber, @RequestParam int pageSize) {
        return movieService.getPage(pageNumber,pageSize);
    }

    @GetMapping("/findByID")
    public ResponseEntity<Movie> findByID(@RequestParam String ID) {
        return movieService.findByID(ID);
    }
}
