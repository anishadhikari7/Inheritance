
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog {
    public void walk() {
        System.out.println("The puppy walks.");
    }
}
public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();   
        p.bark();  
        p.walk();  
    }
}
