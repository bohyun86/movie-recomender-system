package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {
    public String[] recommendMovies (String movie) {
        // user content based filtering to find similar movies
        ContentBasedFilter filter = new ContentBasedFilter();
        return filter.getRecommendations(movie);
    }
}
