import java.util.Scanner;

public class BankApplication {

    private static BankAccount account;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Generate Account Report");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    viewTransactionHistory();
                    break;
                case 6:
                    generateAccountReport();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to create a new account
    private static void createAccount(Scanner scanner) {
        System.out.print("Enter Account Type (1 for BankAccount, 2 for SavingsAccount): ");
        int accountType = scanner.nextInt();
        scanner.nextLine();  // consume newline

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter balance: ");
        double balance = scanner.nextDouble();

        if (accountType == 1) {
            account = new BankAccount(accountNumber, accountHolderName, balance);
        } else if (accountType == 2) {
            account = new SavingsAccount(accountNumber, accountHolderName, balance);
        } else {
            System.out.println("Invalid account type.");
        }
        System.out.println("Account Created Successfully!");
    }

    // Method to deposit money
    private static void deposit(Scanner scanner) {
        if (account == null) {
            System.out.println("No account exists. Please create an account first.");
            return;
        }
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    // Method to withdraw money
    private static void withdraw(Scanner scanner) {
        if (account == null) {
            System.out.println("No account exists. Please create an account first.");
            return;
        }
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

    // Method to check balance
    private static void checkBalance() {
        if (account == null) {
            System.out.println("No account exists. Please create an account first.");
            return;
        }
        System.out.println("Current Balance: " + account.getBalance());
    }

    // Method to view transaction history
    private static void viewTransactionHistory() {
        if (account == null) {
            System.out.println("No account exists. Please create an account first.");
            return;
        }
        account.viewTransactionHistory();
    }

    // Method to generate account report
    private static void generateAccountReport() {
        if (account == null) {
            System.out.println("No account exists. Please create an account first.");
            return;
        }
        System.out.println(account.generateReport());
    }
}
