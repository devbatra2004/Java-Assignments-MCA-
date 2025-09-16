
import java.util.Scanner;

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void depositMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        balance += depositAmount;
        System.out.println("₹" + depositAmount + " deposited successfully.");
    }

    void withdrawMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("₹" + withdrawAmount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance! Available: ₹" + balance);
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Dev", 123456789L, 5000.0);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.depositMoney();
                    break;
                case 2:
                    account.withdrawMoney();
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank you! Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
