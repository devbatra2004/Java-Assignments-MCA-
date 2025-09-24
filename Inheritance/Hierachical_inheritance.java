
public class Hierachical_inheritance {

    void a() {
        System.out.println("method from parent class");
    }

    public static void main(String[] args) {
        b obj = new b();
        obj.a();
        obj.b();
        c obj2 = new c();
        obj2.a();
        obj2.c();
    }
}

class b extends Hierachical_inheritance {

    void b() {
        System.out.println("method from child1 class");
    }
}

class c extends Hierachical_inheritance {

    void c() {
        System.out.println("method from child2 class");
    }
}
