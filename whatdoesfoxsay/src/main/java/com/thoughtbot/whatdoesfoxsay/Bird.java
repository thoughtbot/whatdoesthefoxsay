package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Bird goes tweet
 */
public class Bird extends Animal {
    public Bird() {
        this("bird", new AlphabeticalListBuilder().with("tweet").build());
    }

    public Bird(String name, List<String> responses) {
        super(name, responses);
    }
}
