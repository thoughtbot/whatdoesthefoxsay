package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Cat goes meow
 */
public class Cat extends Animal {
    public Cat() {
        this("cat", new AlphabeticalListBuilder().with("meow").build());
    }

    public Cat(String name, List<String> responses) {
        super(name, responses);
    }
}
