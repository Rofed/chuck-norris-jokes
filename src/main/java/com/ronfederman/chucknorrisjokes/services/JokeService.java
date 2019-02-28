package com.ronfederman.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;


@Service
public class JokeService{

        private ChuckNorrisQuotes quote;
        private String joke;

        public JokeService() {
            this.quote = new ChuckNorrisQuotes();
        }

//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        joke = quote.getRandomQuote();
//
//    }

        public String getJoke() {
            joke = quote.getRandomQuote();
            return joke;
        }
}
