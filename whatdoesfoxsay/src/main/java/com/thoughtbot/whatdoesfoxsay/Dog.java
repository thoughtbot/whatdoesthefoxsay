package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Dog goes woof
 */
public class Dog extends Animal {
    public Dog() {
        this("dog", new AlphabeticalListBuilder().with("woof").build());
    }

    public Dog(String name, List<String> responses) {
        super(name, responses);
    }
}
