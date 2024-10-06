package io.datajek.spring.basics.movierecommendersystem.lesson3;


public class CollaborativeFilter implements Filter {
    @Override
    public String[] getRecommendations(String movie) {
        // logic of collaborative filter
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
