package io.datajek.spring.basics.movierecommendersystem.lesson6;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //Filter is a dependency of RecommenderImplementation
    @Qualifier("CBF")
    private final Filter contentBasedFilter;

    public RecommenderImplementation(Filter contentBasedFilter) {
        this.contentBasedFilter = contentBasedFilter;
    }

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + contentBasedFilter + "\n");

        String[] results = contentBasedFilter.getRecommendations("Finding Dory");

        return results;
    }

}
