public class BankAccount {
    String ownerName;
    int accountNumber;
    double balance;

    BankAccount(String name, int accNo, double initialBalance) {
        ownerName = name;
        accountNumber = accNo;
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" Amount must be greater than 0!");
        } else {
            balance = balance + amount;
            System.out.println(" Rs." + amount + " deposited successfully.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Amount must be greater than 0!");
        } else if (amount > balance) {
            System.out.println(" Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println(" Rs." + amount + " withdrawn successfully.");
        }
    }

    void checkBalance() {
        System.out.println(" Current Balance: Rs." + balance);
    }

    void showDetails() {
        System.out.println("-----------------------------");
        System.out.println(" Account Holder : " + ownerName);
        System.out.println(" Account Number : " + accountNumber);
        System.out.println(" Balance        : Rs." + balance);
        System.out.println("-----------------------------");
    }
}