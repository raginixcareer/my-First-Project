public class Bank {
    BankAccount[] accounts;
    int totalAccounts;

    Bank() {
        accounts = new BankAccount[10]; // max 10 accounts
        totalAccounts = 0;
    }

    void createAccount(String name, int accNo, double initialBalance) {
        if (totalAccounts >= 10) {
            System.out.println(" Bank is full! Cannot create more accounts.");
        } else {
            accounts[totalAccounts] = new BankAccount(name, accNo, initialBalance);
            totalAccounts++;
            System.out.println(" Account created successfully!");
        }
    }

    BankAccount findAccount(int accNo) {
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].accountNumber == accNo) {
                return accounts[i];
            }
        }
        return null;
    }

    void showAllAccounts() {
        if (totalAccounts == 0) {
            System.out.println(" No accounts found!");
        } else {
            System.out.println("\n=== All Accounts ===");
            for (int i = 0; i < totalAccounts; i++) {
                accounts[i].showDetails();
            }
        }
    }
}
