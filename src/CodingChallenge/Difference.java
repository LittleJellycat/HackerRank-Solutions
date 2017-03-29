package CodingChallenge;

public class Difference {
    private int[] elements;

    Difference(int[] elements){
        this.elements = elements;
    }

    void computeDifference() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : elements) {
            if (element < min) min = element;
            if (element > max) max = element;
        }
        int maximumDifference = max - min;
    }
}
