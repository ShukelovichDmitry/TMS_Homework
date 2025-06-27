package Lesson11;

import java.util.Iterator;
import java.util.LinkedList;

public class MergeTwoLinkedLists {

    public static LinkedList<Integer> sortAsc(LinkedList<Integer> list1, LinkedList<Integer> list2){
        Integer value1 = null, value2 = null;
        LinkedList<Integer> listRes = new LinkedList<>();
        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();
        while (iterator1.hasNext() || iterator2.hasNext()) {
            if (value1 == null && iterator1.hasNext()) value1 = iterator1.next();
            if (value2 == null && iterator2.hasNext()) value2 = iterator2.next();
            if (value1 < value2) {
                listRes.add(value1);
                value1 = null;
            } else {
                listRes.add(value2);
                value2 = null;
            }
        }
        if (value1 != null) {
            listRes.add(value1);
        } else {
            listRes.add(value2);
        }
        return listRes;
    }

}
