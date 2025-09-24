
public class method_overriding {

    void dog() {
        System.out.println("the dog can bark");
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.dog();
    }
}

class B extends method_overriding {

    void dog() {
        System.out.println("the dog can't meoou");
    }
}
