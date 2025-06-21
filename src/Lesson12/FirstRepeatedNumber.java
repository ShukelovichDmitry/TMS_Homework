package Lesson12;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeatedNumber {
    public static Integer findFirstRepeatedNumber(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
        for (Integer number: numbers) {
            if (!set.add(number)) {
                return number;
            }
        }
        return null;
    }
}
