package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Duck goes quack
 */
public class Duck extends Animal {
    public Duck() {
        this("duck", new AlphabeticalListBuilder().with("quack").build());
    }

    public Duck(String name, List<String> responses) {
        super(name, responses);
    }
}
