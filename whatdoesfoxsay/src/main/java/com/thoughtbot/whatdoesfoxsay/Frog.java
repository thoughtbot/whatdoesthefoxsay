package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Frog goes croak
 */
public class Frog extends Animal {
    public Frog() {
        this("frog", new AlphabeticalListBuilder().with("croak").build());
    }

    public Frog(String name, List<String> responses) {
        super(name, responses);
    }
}
