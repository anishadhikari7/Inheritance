class Animal{
    public void eat(){
        System.out.println("animal eats.....");
    }
}
class Dog extends Animal{
    public void barks()
    {
        System.out.println("the dog barks.....");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.barks();
    }
}