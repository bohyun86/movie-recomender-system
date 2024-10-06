package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
        RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
        String[] result = recommender.recommendMovies("Finding Dory");
        System.out.println("Recommended movies: ");
        for (String movie : result) {
            System.out.println(movie);
        }
    }
}
