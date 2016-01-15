package com.thoughtbot.whatdoesfoxsay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * For making presorted lists
 */
public class AlphabeticalListBuilder {
    private List<String> mList = new ArrayList<>();

    public AlphabeticalListBuilder() {

    }

    public AlphabeticalListBuilder(String[] array) {
        mList = new ArrayList<String>(Arrays.asList(array));
    }

    public AlphabeticalListBuilder with(String word) {
        mList.add(word);
        return this;
    }

    public List<String> build() {
        Collections.sort(mList);
        return mList;
    }
}
