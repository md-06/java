import java.util.*;//import this for hashset
public class Main
{
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
        
        int flag=0;
        for(int i:hs1)
        {
            if(!hs2.contains(i))
            {
                flag=1;
                break;
            }
        }
        if(flag==0 && hs1.size() == hs2.size()){
            System.err.println("Equal");
        }
        else
        {
            System.err.println("Not Equal");
        }
    }
}