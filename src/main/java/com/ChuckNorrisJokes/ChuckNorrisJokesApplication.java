package com.ChuckNorrisJokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class ChuckNorrisJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisJokesApplication.class, args);
	}

	public String getQuote(){

		ArrayList jokes= new ArrayList();
		jokes.add("Chuck Norris meets a snake. the snake went to the vet for being poisoned");
		jokes.add("Chuck Norris can code from his mind");
		jokes.add("Chuck Norris can strangle you with a cordless phone");
		jokes.add("Chuck Norris can beat you with a cordless controller on PS1");

		return jokes.get(ThreadLocalRandom.current().nextInt(1,jokes.size())).toString();
	}
}