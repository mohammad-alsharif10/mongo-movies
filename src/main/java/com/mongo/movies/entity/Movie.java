package com.mongo.movies.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document("movies")
public class Movie {

    @JsonProperty("_id")
    private String id;
    private String title;
    private int year;
    private List<String> cast;
    private String plot;
    private String fullPlot;
    private Date lastUpdated;
    private String type;
    private String poster;
    private List<String> directors;
    private List<String> writers;
    private IMDB imdb;
    private List<String> countries;
    private List<String> genres;
    private RottenTomatoes tomatoes;
}
