
public class Constructor {

    Constructor() {
        System.out.println("constructor from the parent class");
    }

    public static void main(String[] args) {
        B obj = new B();
    }
}

class B extends Constructor {

    B() {
        super();
        System.out.println("constructor from the child class");
    }
}
