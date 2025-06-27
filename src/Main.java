import Lesson11.LastOneStanding;
import Lesson11.MergeTwoLinkedLists;
import Lesson11.MyOneWayLinkedList;
import Lesson12.FindTargetSum;
import Lesson12.FirstRepeatedNumber;
import Lesson12.GroupAnagram;
import Lesson9.Game;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Урок 9 Задание 1
        Game game = new Game();
        game.play();
        //Урок 11 Задание 1
        LinkedList<Integer> participants = new LinkedList<>();
        participants.add(1);
        participants.add(2);
        participants.add(3);
        participants.add(4);
        participants.add(5);
        participants.add(6);
        participants.add(7);
        participants.add(8);
        participants.add(9);
        participants.add(10);
        participants.add(11);
        participants.add(12);
        LastOneStanding.getLastOne(participants);
        //Урок 11 Задание 2
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(8);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(7);
        LinkedList<Integer> listRes = MergeTwoLinkedLists.sortAsc(list1, list2);
        System.out.println(listRes);
        //Урок 11 Задание 3
        MyOneWayLinkedList<Integer> list = new MyOneWayLinkedList<>();
        list.add(1);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(7);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.get(5));
        System.out.println(list.remove(3));
        System.out.println(list);
        //Урок 12 Задание 1
        String[] strs = {"listen", "silent", "enlist", "java", "avaj", "world"};
        System.out.println(GroupAnagram.groupAnagrams(strs));
        //Урок 12 Задание 2
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,7,8,9,9,9,9,9,9,1,2);
        System.out.println(FirstRepeatedNumber.findFirstRepeatedNumber(numbers));
        //Урок 12 Задание 3
        Integer[] numbers2 = new Integer[]{1,1,1,2,3,4,5,6,7,7,8};
        List<Integer[]> pairs = FindTargetSum.findTargetSum(numbers2, 8);
        for (Integer[] pair : pairs) {
            System.out.format("[%d,%d] ", pair[0], pair[1]);
        }

    }
}











