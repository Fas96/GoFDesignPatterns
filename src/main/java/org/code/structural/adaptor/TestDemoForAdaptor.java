package org.code.structural.adaptor;

import java.util.Arrays;

public class TestDemoForAdaptor {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 5};

        Sorter sorter = new SortListAdaptor(new NumberSorter());
        int[] sortedNumbers = sorter.sort(numbers);

        System.out.println("Sorted numbers");
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
