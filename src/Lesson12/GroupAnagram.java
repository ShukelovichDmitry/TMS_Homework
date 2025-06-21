package Lesson12;

import java.util.*;

public class GroupAnagram {
    public static Map<Character, Integer> strToMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            Character c = Character.toLowerCase(str.charAt(i));
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }
        return map;

    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        Map<Character, Integer> map1 = strToMap(str1);
        Map<Character, Integer> map2 = strToMap(str2);
        if (map1.size() != map2.size()) return false;
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !map2.get(entry.getKey()).equals(entry.getValue())) return false;
        }
        return true;
    }

    public static List<List<String>> groupAnagrams(String[] stringArr) {
        if (stringArr.length == 0) return null;
        List<String> ungroupedStrings = new ArrayList<>();
        for (String string: stringArr)
            ungroupedStrings.add(string);
        List<List<String>> groups = new ArrayList<>();
        while (ungroupedStrings.size() > 0) {
            List<String> group = new ArrayList<>();
            String str1 = ungroupedStrings.remove(0);
            group.add(str1);
            Iterator<String> stringIterator = ungroupedStrings.iterator();
            while (stringIterator.hasNext()) {
                String str2 = stringIterator.next();
                if (isAnagram(str1, str2)) {
                    stringIterator.remove();
                    group.add(str2);
                }
            }
            groups.add(group);
        }
        return groups;
    }
}
