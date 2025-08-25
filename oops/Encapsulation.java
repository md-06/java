//Getter and setter help to access private variable outside the class
public class Encapsulation {
    private String name;
    private int marks;
    public Encapsulation(String name, int marks)
    {
        this.name=name;
        this.marks=marks;
    }
    //Getter
    public String getName()
    {
        return name;
    }
    //setter
    public void setname(String name1)
    {
        this.name=name1;
    }
    //Getter
    public int getmarks()
    {
        return marks;
    }
    //setter
    public void setmarks(int marks1)
    {
        this.marks=marks1;
    }
    void display()
    {
        System.out.println("Name: "+name+", Marks: "+marks);
    }
    public static void main(String[] args) {
        Encapsulation e= new Encapsulation("md", 90);
        e.display();
        e.setmarks(99);
        e.display();
    }
}
