
interface Loanable {

    void applyForLoan();

    void calculateLoanEligibility();
}

abstract class BankAccount {

    private double accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(double accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public abstract void calculateInterest();

    public static void main(String[] args) {
        SavingsAccount sAcc = new SavingsAccount(101, "Dev", 8000);
        CurrentAccount cAcc = new CurrentAccount(102, "Aman", 12000);

        System.out.println("=== Savings Account ===");
        sAcc.deposit(2000);
        sAcc.withdraw(3000);
        sAcc.calculateInterest();
        sAcc.applyForLoan();
        sAcc.calculateLoanEligibility();

        System.out.println("\n=== Current Account ===");
        cAcc.deposit(5000);
        cAcc.withdraw(2000);
        cAcc.calculateInterest();
        cAcc.applyForLoan();
        cAcc.calculateLoanEligibility();
    }
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(double accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public void calculateInterest() {
        double interest = getBalance() * 0.04;
        System.out.println("Savings Account Interest: " + interest);
    }

    public void applyForLoan() {
        System.out.println("Loan applied from Savings Account.");
    }

    public void calculateLoanEligibility() {
        if (getBalance() > 5000) {
            System.out.println("Eligible for loan up to 50,000.");
        } else {
            System.out.println("Not eligible for loan.");
        }
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(double accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public void calculateInterest() {
        double interest = getBalance() * 0.02;
        System.out.println("Current Account Interest: " + interest);
    }

    public void applyForLoan() {
        System.out.println("Loan applied from Current Account.");
    }

    public void calculateLoanEligibility() {
        if (getBalance() > 10000) {
            System.out.println("Eligible for loan up to 1,00,000.");
        } else {
            System.out.println("Not eligible for loan.");
        }
    }
}
