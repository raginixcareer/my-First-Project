import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        int choice = 0;
        while (choice != 6) {
            System.out.println("\n=== Simple Bank Menu ===");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                sc.nextLine();
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter account number: ");
                int accNo = sc.nextInt();
                System.out.print("Enter initial deposit: Rs.");
                double amount = sc.nextDouble();
                bank.createAccount(name, accNo, amount);

            } else if (choice == 2) {
                System.out.print("Enter account number: ");
                int accNo = sc.nextInt();
                BankAccount acc = bank.findAccount(accNo);
                if (acc == null) {
                    System.out.println("❌ Account not found!");
                } else {
                    System.out.print("Enter deposit amount: Rs.");
                    double amount = sc.nextDouble();
                    acc.deposit(amount);
                }

            } else if (choice == 3) {
                System.out.print("Enter account number: ");
                int accNo = sc.nextInt();
                BankAccount acc = bank.findAccount(accNo);
                if (acc == null) {
                    System.out.println("❌ Account not found!");
                } else {
                    System.out.print("Enter withdraw amount: Rs.");
                    double amount = sc.nextDouble();
                    acc.withdraw(amount);
                }

            } else if (choice == 4) {
                System.out.print("Enter account number: ");
                int accNo = sc.nextInt();
                BankAccount acc = bank.findAccount(accNo);
                if (acc == null) {
                    System.out.println("❌ Account not found!");
                } else {
                    acc.checkBalance();
                }

            } else if (choice == 5) {
                bank.showAllAccounts();

            } else if (choice == 6) {
                System.out.println("👋 Goodbye!");

            } else {
                System.out.println("❌ Invalid choice!");
            }
        }

        sc.close();
    }
}