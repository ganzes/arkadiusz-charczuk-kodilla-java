package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoresGo {
    public static void main (String [] args){
        MovieStore movieStore = new MovieStore();

        //System.out.println(movieStore.getMovies());

        String challengeMovieStore = movieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!"));


        System.out.println(challengeMovieStore);

    }
}
