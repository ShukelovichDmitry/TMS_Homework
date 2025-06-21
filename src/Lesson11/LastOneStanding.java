package Lesson11;

import java.util.Iterator;
import java.util.LinkedList;

public class LastOneStanding {

    public static void getLastOne(LinkedList<Integer> participants){
        int i = 1;
        while (participants.size() > 1) {
            Iterator<Integer> participant = participants.iterator();
            while (participant.hasNext()) {
                participant.next();
                if (i == 2) {
                    i = 1;
                    participant.remove();
                } else {
                    i++;
                }
            }
        }
        System.out.println(participants.getFirst());
    }

}
