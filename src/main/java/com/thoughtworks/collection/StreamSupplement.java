package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {

        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public double getAverage(List<Integer> numbers) {
        double total = numbers.stream().reduce((a, b) -> a + b).orElse(0);
        return total/numbers.size();
    }

    public int getMaxValue(List<Integer> numbers) {
        int i;
        return numbers.stream().reduce((a,b)->a>b ? a:b).orElse(null);
    }

}
