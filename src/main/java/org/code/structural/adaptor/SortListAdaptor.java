package org.code.structural.adaptor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListAdaptor implements Sorter{
    private NumberSorter numberSorter;

    public SortListAdaptor(NumberSorter numberSorter) {
        this.numberSorter = numberSorter;
    }

    @Override
    public int[] sort(int[] numbers) {
        List<Integer> sortedList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        sortedList = numberSorter.sortList(sortedList);
        return sortedList.stream().mapToInt(i -> i).toArray();
    }
}
