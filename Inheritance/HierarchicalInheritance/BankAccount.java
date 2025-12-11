
public class BankAccount {

    double accountNumber;
    double balance;

    public BankAccount(double accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount ca = new CheckingAccount(102, 2000, 1000);
        FixedDepositAccount fd = new FixedDepositAccount(103, 10000, 12);

        sa.displayAccountType();
        System.out.println();
        ca.displayAccountType();
        System.out.println();
        fd.displayAccountType();
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    public SavingsAccount(double accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {

    double withdrawalLimit;

    public CheckingAccount(double accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {

    double maturityPeriod;

    public FixedDepositAccount(double accountNumber, double balance, double maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
