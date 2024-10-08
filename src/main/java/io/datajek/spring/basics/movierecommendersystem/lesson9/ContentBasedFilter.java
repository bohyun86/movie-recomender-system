package io.datajek.spring.basics.movierecommendersystem.lesson9;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ContentBasedFilter implements Filter{

    private static int instances = 0;

    private final Movie movie;

    public ContentBasedFilter(Movie movie) {
        instances++;
        System.out.println("ContentBasedFilter constructor called");
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public static int getInstances(){
        return ContentBasedFilter.instances;
    }

    //getRecommendations takes a movie as input and returns a list of similar movies
    public String[] getRecommendations(String movie) {
        //calculate similarity between movies
        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
