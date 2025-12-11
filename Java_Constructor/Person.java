
class Person {

    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Dev", 21);
        Person p2 = new Person(p1);          // copy constructor

        System.out.println("Original: " + p1.name + ", " + p1.age);
        System.out.println("Copy: " + p2.name + ", " + p2.age);
    }
}
