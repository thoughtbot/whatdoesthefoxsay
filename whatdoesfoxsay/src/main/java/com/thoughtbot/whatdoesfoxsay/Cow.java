package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Cow goes moo
 */
public class Cow extends Animal {
    public Cow() {
        this("cow", new AlphabeticalListBuilder().with("moo").build());
    }

    public Cow(String name, List<String> responses) {
        super(name, responses);
    }
}
