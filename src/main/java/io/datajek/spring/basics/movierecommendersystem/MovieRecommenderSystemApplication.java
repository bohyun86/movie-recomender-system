package io.datajek.spring.basics.movierecommendersystem;

import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

    public static void main(String[] args) {
//        SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        RecommenderImplementation recommender = new RecommenderImplementation();
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println("Recommended movies: " + Arrays.toString(result));

    }

}
