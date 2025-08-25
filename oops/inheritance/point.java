//this class show that with printing the object we can print the attributes of object.
public class point {
    int x,y;
    public point(){
        this.x=0;
        this.y=0;
    }
    public point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return ("x coordinate is "+x+" and y coordinate is "+y);
    }
    public static void main(String[] args) {
        point p1=new point();
        point p2=new point(3,4);
        System.out.println("p1= "+p1);
        System.out.println("p2= "+p2);

}
}