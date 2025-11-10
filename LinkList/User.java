
import java.util.*;

class User {

    int userId;
    String name;
    int age;
    String friends;
    User next;

    User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = "";
        this.next = null;
    }
}

class Main {

    static User head = null;

    static void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    static void addFriend(int userId, int friendId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                temp.friends += friendId + " ";
                break;
            }
            temp = temp.next;
        }
        System.out.println("Friend connection added between User " + userId + " and User " + friendId);
    }

    static void removeFriend(int userId, int friendId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                temp.friends = temp.friends.replace(friendId + " ", "");
                break;
            }
            temp = temp.next;
        }
        System.out.println("Friend connection removed between User " + userId + " and User " + friendId);
    }

    static void countFriends() {
        User temp = head;
        while (temp != null) {
            if (temp.friends.isEmpty()) {
                System.out.println(temp.name + " has 0 friends.");
            } else {
                String[] list = temp.friends.trim().split(" ");
                System.out.println(temp.name + " has " + list.length + " friends.");
            }
            temp = temp.next;
        }
    }

    static void displayAllUsers() {
        User temp = head;
        System.out.println("\nAll Users:");
        while (temp != null) {
            System.out.println("User ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addUser(1, "Dev", 20);
        addUser(2, "Rohan", 21);
        addUser(3, "Simran", 19);

        displayAllUsers();

        addFriend(1, 2);
        addFriend(1, 3);
        addFriend(2, 3);

        displayFriends(1);
        displayFriends(2);
        displayFriends(3);

        countFriends();

        removeFriend(1, 3);
        displayFriends(1);
        countFriends();
    }
}
