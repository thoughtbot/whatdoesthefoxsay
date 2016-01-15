package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The Seal goes OW OW OW
 */
public class Seal extends Animal {
    public Seal() {
        this("seal", new AlphabeticalListBuilder().with("OW OW OW").build());
    }

    public Seal(String name, List<String> responses) {
        super(name, responses);
    }
}
