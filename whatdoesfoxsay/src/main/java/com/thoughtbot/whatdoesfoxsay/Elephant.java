package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Elephant goes toot
 */
public class Elephant extends Animal {
    public Elephant() {
        this("elephant", new AlphabeticalListBuilder().with("toot").build());
    }

    public Elephant(String name, List<String> responses) {
        super(name, responses);
    }
}
