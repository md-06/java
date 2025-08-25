//Getter and setter help to access private variable outside the class
public class person {
    private String name;
    private int marks;
    //Getter for name
    public String getName()
    {
        return name;
    }
    //setter for name
    public void setname(String name1)
    {
        this.name=name1;
    }
    //Getter marks
    public int getmarks()
    {
        return marks;
    }
    //setter  marks
    public void setmarks(int marks1)
    {
        this.marks=marks1;
    }
    void display()
    {
        System.out.println("Name: "+name+", Marks: "+marks);
    }
}