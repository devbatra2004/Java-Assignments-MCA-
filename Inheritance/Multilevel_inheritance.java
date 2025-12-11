
public class Multilevel_inheritance {

    void A() {
        System.out.println("method of parent class");
    }

    public static void main(String[] args) {
        Grand obj = new Grand();
        obj.A();
        obj.B();
        obj.C();
    }
}

class Child extends Multilevel_inheritance {

    void B() {
        System.out.println("method of child class");
    }
}

class Grand extends Child {

    void C() {
        System.out.println("method of grand-child class");
    }
}
