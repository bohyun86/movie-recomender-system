package io.datajek.spring.basics.movierecommendersystem.lesson16;

import lombok.Data;
import org.springframework.stereotype.Service;


@Service
@Data
public class RecommenderImplementation {

    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");

        return filter.getRecommendations(movie);
    }

}
