package com.ronfederman.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;


@Service
public class JokeService {

    private final ChuckNorrisQuotes quote;
    private String joke;

    public JokeService(ChuckNorrisQuotes quote) {
        this.quote = quote;
    }

    public String getJoke() {
        joke = quote.getRandomQuote();
        return joke;

    }
}
