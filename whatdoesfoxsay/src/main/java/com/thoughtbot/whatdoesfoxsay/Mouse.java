package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Mouse goes squeak
 */
public class Mouse extends Animal {
    public Mouse() {
        this("mouse", new AlphabeticalListBuilder().with("squeak").build());
    }

    public Mouse(String name, List<String> responses) {
        super(name, responses);
    }
}
