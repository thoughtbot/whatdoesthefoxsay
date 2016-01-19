package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Bear goes rawr
 */
public class Bear extends Animal {
    public Bear() {
        this("bear", new AlphabeticalListBuilder().with("rawr").build());
    }

    public Bear(String name, List<String> responses) {
        super(name, responses);
    }
}
