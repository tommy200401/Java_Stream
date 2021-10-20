package com.thoughtworks.collection;

import java.util.List;
import java.util.stream.Collectors;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().filter(number -> number%2==1).reduce((a,b) -> b).orElse(null);
    }

    public String getLongest(List<String> words) {

        return words.stream().reduce("", (word1, word2) -> word1.length() > word2.length() ? word1: word2);
    }

    public int getTotalLength(List<String> words) {

        return words.stream().reduce("", (word1, word2) -> word1 + word2).length();
    }
}
