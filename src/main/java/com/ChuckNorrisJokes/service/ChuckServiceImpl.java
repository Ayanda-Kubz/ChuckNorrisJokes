package com.ChuckNorrisJokes.service;

import com.ChuckNorrisJokes.ChuckNorrisJokesApplication;
import org.springframework.stereotype.Service;

@Service
public class ChuckServiceImpl implements ChuckService{

    private final ChuckNorrisJokesApplication jokesApplication;

    public ChuckServiceImpl(ChuckNorrisJokesApplication jokesApplication) {
        this.jokesApplication = jokesApplication;
    }

    @Override
    public String getRandomJoke() {
        return jokesApplication.getQuote().toString();
    }
}
