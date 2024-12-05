import java.util.ArrayList;
import java.util.List;

public class BankAccount implements Reportable {
        private String accountNumber;
        private String accountHolderName;
        private double balance;
        private List<String> transactions;

        public BankAccount(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
            this.transactions = new ArrayList<>();
            this.transactions.add("Account created with balance: " + balance);
        }

        // Getter and Setter Methods (Encapsulation)
        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public void setAccountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public List<String> getTransactions() {
            return transactions;
        }

        // Method to display account details
        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }

        // Deposit method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                transactions.add("Deposited: " + amount);
                System.out.println("Deposit Successful! New balance: " + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Withdrawal method with exception handling
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                transactions.add("Withdrew: " + amount);
                System.out.println("Withdrawal Successful! New balance: " + balance);
            } else if (amount > balance) {
                System.out.println("money not enough for withdrawal.");
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }

        // Method to view transaction history
        public void viewTransactionHistory() {
            System.out.println("Transaction History for Account: " + accountNumber);
            for (String transaction : transactions) {
                System.out.println(transaction);
            }
        }

        // Method to generate a summary report (Interface Implementation)
        @Override
        public String generateReport() {
            return "Account Report for " + accountHolderName + "\n" +
                    "Account Number: " + accountNumber + "\n" +
                    "Balance: " + balance + "\n";
        }
    }


