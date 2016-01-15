package com.thoughtbot.whatdoesfoxsay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import ru.lanwen.verbalregex.VerbalExpression;

/**
 * Animal class where you can store the name and responses for different animals. Responses can be
 * returned either by search term or all in alphabetical ascending order.
 */
public class Animal {
    protected List<String> mResponses = new ArrayList<>();

    private String mName = "none";

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Animal(String name, List<String> responses) {
        mResponses = responses;
    }

    public boolean hasResponse(String response) {
        for (String sound : mResponses) {
            if (sound.equals(response)) return true;
        }
        return false;
    }

    public List<String> goes() {
        return mResponses;
    }

    public List<String> goes(String searchTerm) {
        List<String> results = new ArrayList<>();
        HashSet<String> found = new HashSet<>();
        // first priority goes to the results that start with the search term
        VerbalExpression startOfLineTest = VerbalExpression.regex()
                .startOfLine()
                .then(searchTerm)
                .withAnyCase()
                .build();
        for (String sound : mResponses) {
            if (startOfLineTest.test(sound) && !found.contains(sound)) {
                found.add(sound);
                results.add(sound);
            }
        }
        // second priority goes to the results that contain the search term
        VerbalExpression containsTest = VerbalExpression.regex()
                .find(searchTerm)
                .withAnyCase()
                .oneOrMore()
                .build();
        for (String sound : mResponses) {
            if (containsTest.test(sound) && !found.contains(sound)) {
                found.add(sound);
                results.add(sound);
            }
        }

        return results;
    }

    public static class Builder {
        private HashSet<String> mResponses = new HashSet<>();
        private String mName;

        public Builder() {

        }

        public Builder withName(String name) {
            mName = name;
            return this;
        }

        public Builder withResponse(String response) {
            if (mResponses.contains(response)) return this;
            mResponses.add(response);
            return this;
        }

        public Animal build() {
            List<String> result = new ArrayList<>();
            for (String response : mResponses) {
                result.add(response);
            }
            // sort the list before building
            Collections.sort(result);
            return new Animal(mName, result);
        }
    }
}
