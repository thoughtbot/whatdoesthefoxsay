package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Fish goes blub
 */
public class Fish extends Animal {
    public Fish() {
        this("fish", new AlphabeticalListBuilder().with("blub").build());
    }

    public Fish(String name, List<String> responses) {
        super(name, responses);
    }
}
