package kr.hs.dgsw.java.BinarySearch;

public class BinarySearch implements Searcher{
    @Override
    public int search(int[] sortedValues, int value) {
        int low = 0;
        int high = sortedValues.length - 1;
        int index;

        while(low <= high) {
            index = (low + high) / 2;

            if (sortedValues[index] == value)
                return index;
            else if (sortedValues[index] > value)
                high = index - 1;
            else
                low = index + 1;
        }
        return -1;
    }
}
