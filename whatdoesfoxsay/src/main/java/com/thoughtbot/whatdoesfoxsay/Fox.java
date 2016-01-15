package com.thoughtbot.whatdoesfoxsay;

import java.util.List;

/**
 * The secret of the fox, ancient mystery.
 * Somewhere deep in the woods, I know you're hiding.
 * What is your sound? Will we ever know?
 * Will always be a mystery what do you say?
 */
public class Fox extends Animal {
    public Fox() {
        this("fox", new AlphabeticalListBuilder()
                .with("Ring-ding-ding-ding-dingeringeding!")
                .with("Gering-ding-ding-ding-dingeringeding!")
                .with("Wa-pa-pa-pa-pa-pa-pow!")
                .with("Hatee-hatee-hatee-ho!")
                .with("Joff-tchoff-tchoff-tchoffo-tchoffo-tchoff!")
                .with("Jacha-chacha-chacha-chow!")
                .with("Fraka-kaka-kaka-kaka-kow!")
                .with("A-hee-ahee ha-hee!")
                .with("A-oo-oo-oo-ooo!")
                .with("Woo-oo-oo-ooo!")
                .build());
    }

    public Fox(String name, List<String> responses) {
        super(name, responses);
    }
}
