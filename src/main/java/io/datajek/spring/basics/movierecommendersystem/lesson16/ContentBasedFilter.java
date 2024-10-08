package io.datajek.spring.basics.movierecommendersystem.lesson16;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContentBasedFilter implements Filter {

    private Movie movie;

    //getRecommendations takes a movie as input and returns a list of similar movies
    @Override
    public String[] getRecommendations(String movie) {
        //calculate similarity between movies
        //return movie recommendations
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
