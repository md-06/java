//using lambda function sorting decending order

import java.util.Collections;
import java.util.LinkedList;
public class sortDecendingLambda
{
    public static void main(String[] args) {
        LinkedList<Integer>num = new LinkedList<>();
        num.add(3);
        num.add(7);
        num.add(5);
        num.add(9);
        num.add(4);

        System.out.println(num);

        Collections.sort(num,(a,b) ->b-a);//lambda function.

        System.out.println(num);
    }
}