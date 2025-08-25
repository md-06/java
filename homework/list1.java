//check whether the two list is equal or not without using size method.

import java.util.*;//import this for HashSet
public class list1
{
    public static boolean isSubset(HashSet<Integer> a, HashSet<Integer> b)
    {
        for(int i:a)
        {
            if(!b.contains(i))
            {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        HashSet<Integer>hs1 =new HashSet<>();
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        
        HashSet<Integer>hs2 = new HashSet();
        hs2.add(2);
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);//if uncomment this and below one it will give you equal
        hs2.add(6);
        
        
        if(isSubset(hs1,hs2) && isSubset(hs2,hs1))
        {
            System.err.println("Equal");
        }
        else
        {
            System.err.println("Not Equal");
        }
    }
}