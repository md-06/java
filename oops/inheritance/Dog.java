
class Animal
{
    String name;
    public Animal(String name)
    {
        this.name=name;
    }
    public void sound()
    {
        System.out.println("Some sound");
    }
    
    
}
class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }
    @Override
    public void sound()
    {
        System.out.println(name+" Says:Woof!");
    }
    public static void main(String[] args) {
        Dog d=new Dog("buddy");
        d.sound();
    }
}