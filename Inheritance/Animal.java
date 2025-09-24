
public class Animal {

    void eat() {
        System.out.println("The animal can eat food");
    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
        obj.eat();
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("The dog can bark");
    }
}
