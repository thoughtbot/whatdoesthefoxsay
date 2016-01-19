package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Dog goes woof, bow-wow, arf, and bark
 */
public class Dog extends Animal {
    public Dog() {
        this("dog", new AlphabeticalListBuilder()
                .with("bow-wow")
                .with("arf")
                .with("woof")
                .with("bark")
                .build());
    }

    public Dog(String name, List<String> responses) {
        super(name, responses);
    }
}
