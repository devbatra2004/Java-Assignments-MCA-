
class Hybrid_inheritance {

    void show() {
        System.out.println("Hello from A");
    }

    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}

class B extends Hybrid_inheritance {

    void show() {
        System.out.println("Hello from B");
    }
}

class C extends Hybrid_inheritance {

    void show() {
        System.out.println("Hello from C");
    }
}

class D extends B {

}
