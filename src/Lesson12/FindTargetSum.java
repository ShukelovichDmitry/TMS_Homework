package Lesson12;

import java.util.*;

public class FindTargetSum {
    public static List<Integer[]> findTargetSum(Integer[] numbers, Integer target) {
        List<Integer[]> pairs = new ArrayList<>();
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    pairs.add(new Integer[]{numbers[i], numbers[j]});
                }
            }
        }
        return pairs;
    }
}
