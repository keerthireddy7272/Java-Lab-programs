import java.util.Scanner;

class Account {
    String name;
    String number; 
    String type;
    double balance;

    Account(String name, String number, String type, double balance) { 
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class CurrentAccount extends Account {
    final double MIN_BALANCE = 1000;
    final double PENALTY = 100;

    CurrentAccount(String name, String number, double balance) { 
        super(name, number, "Current", balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;  
        if (balance < MIN_BALANCE) {
            System.out.println("Minimum balance requirement not met. Penalty applied.");
            balance -= PENALTY;
        }

        showBalance();
    }

    void writeCheck(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Check written for: " + amount);
        } else {
            System.out.println("Insufficient balance to write the check.");
        }
        showBalance();
    }
}

class SavingsAccount extends Account {
    double interestRate = 0.04;

    SavingsAccount(String name, String number, double balance) {
        super(name, number, "Savings", balance);
    }

    void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added. New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        showBalance();
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account holder's name: ");
        String name = scanner.next();
        System.out.print("Enter account number: ");
        String number = scanner.next(); // Keep as String
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter account type (1 for Savings, 2 for Current): ");
        int accountType = scanner.nextInt();

        Account account = (accountType == 1) ? new SavingsAccount(name, number, balance) : new CurrentAccount(name, number, balance);

        while (true) {
            System.out.println("\n--- Action Menu ---");
            System.out.println("1. Deposit 2. Withdraw 3. Check Balance 4. Write Check (Current only) 5. Exit");
            System.out.print("Select an action: ");
            int action = scanner.nextInt();

            if (action == 5) {
                System.out.println("Exiting...");
                scanner.close();
                return;
            }

            if (action == 1) {
                System.out.print("Amount to deposit: ");
                account.deposit(scanner.nextDouble());
            } else if (action == 2) {
                System.out.print("Amount to withdraw: ");
                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).withdraw(scanner.nextDouble());
                } else {
                    ((CurrentAccount) account).withdraw(scanner.nextDouble());
                }
            } else if (action == 3) {
                account.showBalance();
            } else if (action == 4 && account instanceof CurrentAccount) {
                System.out.print("Amount for check: ");
                ((CurrentAccount) account).writeCheck(scanner.nextDouble());
            } else {
                System.out.println("Invalid action. Try again.");
            }
        }
    }
}
