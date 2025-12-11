
import java.util.ArrayList;

class Account {

    private int accountNumber;
    private double balance;
    private Bank bank;

    public Account(int accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class Customer {

    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void viewBalance() {
        System.out.println("\nBalances of " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getAccountNumber()
                    + " Balance: " + acc.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class Bank {

    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Account openAccount(Customer customer, int accNo) {
        Account newAcc = new Account(accNo, this);
        customer.addAccount(newAcc);
        System.out.println(customer.getName() + " opened account "
                + accNo + " in " + bankName);
        return newAcc;
    }
}

public class BankManagement {

    public static void main(String[] args) {
        Bank SBI = new Bank("Swiss bank");
        Customer c1 = new Customer("Dev");
        Customer c2 = new Customer("Rahul");

        Account a1 = SBI.openAccount(c1, 101);
        Account a2 = SBI.openAccount(c2, 102);

        a1.deposit(5000);
        a2.deposit(15000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
