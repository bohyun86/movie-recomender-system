package io.datajek.spring.basics.movierecommendersystem.lesson16;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode=ScopedProxyMode.TARGET_CLASS)
@Data
public class Movie {
    //for keeping track of instances created

    private int id;
    private String name;
    private String genre;
    private String producer;

    public double movieSimilarity(Movie movie2) {

        double similarity = 0.0;
        //if genres are same add 0.3 to similarity
        //if producers are same add 0.5 to similarity
        return similarity;
    }
}