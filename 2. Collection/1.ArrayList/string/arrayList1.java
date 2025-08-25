import java.util.ArrayList;

//different from array because of dynamic size(resizeable).

//create a ArrayList of fruit names & print the list using add() to insert each fruit.
public class arrayList1 {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();//creating obj of Arraylist
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Date");//add() function doing push back(i.e append).
        fruit.add("Elderberry");
        fruit.add("Fig");

        System.out.println("Fruit List: "+fruit);

    }
}
