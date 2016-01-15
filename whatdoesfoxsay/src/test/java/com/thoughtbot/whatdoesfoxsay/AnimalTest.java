package com.thoughtbot.whatdoesfoxsay;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class AnimalTest {
    @Test
    public void goes_isAscendingOrder() throws Exception {
        Animal animal = new Animal.Builder()
                .withResponse("tweet")
                .withResponse("aroooo")
                .withResponse("croak")
                .build();

        List<String> expected = new ArrayList<>();
        expected.add("aroooo");
        expected.add("croak");
        expected.add("tweet");

        List<String> actual = animal.goes();
        assertThat(actual).isSorted();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void goes_startsWith_isFirstOrder() throws Exception {
        Animal animal = new Animal.Builder()
                .withResponse("tweet")
                .withResponse("aroooo")
                .withResponse("croak")
                .withResponse("caw")
                .withResponse("ka-caw")
                .build();

        List<String> expected = new ArrayList<>();
        expected.add("caw");
        expected.add("ka-caw");

        String searchTerm = "ca";

        List<String> actual = animal.goes(searchTerm);

        assertThat(actual).isEqualTo(expected);
    }
}
