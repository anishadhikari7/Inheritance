interface A {
    default void walk() {
        System.out.println("he walks");
    }
}

interface B {
    default void sleep() {
        System.out.println("he sleeps");
    }
}

class C implements A, B {
    @Override
    public void walk() {
        System.out.println("walking in the lake..");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping in the bed...");
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.walk();
        c.sleep();
    }
}
