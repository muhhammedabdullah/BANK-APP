# BANK-APP 
Bank management system:

Project Description

This is a simple banking system built with Java. The application allows users to create bank accounts, deposit and withdraw money, check account balances, view transaction histories, and generate account reports. It also supports Savings Accounts with a minimum balance requirement.

Features
Create Account: Create a new bank account by providing an account number and holder's name.

Deposit Money: Deposit a specified amount of money into an account.

Withdraw Money: Withdraw a specified amount from the account, ensuring sufficient funds are available.

Check Balance: View the current balance of the account.

View Transaction History: Display a history of all transactions (deposits and withdrawals).

Generate Account Report: Generate a summary report of the account details.

Savings Account: Allows the creation of savings accounts with a minimum balance enforced.

Project Structure


BankAccount.java: The main class for managing bank accounts.

SavingsAccount.java: A subclass of BankAccount that enforces a minimum balance.

Reportable.java: An interface for generating account summary reports.

BankApp.java: The main application file that drives the program's logic and user interaction.

after run code :

=== Bank Menu ===
1. Create Account
2. Deposit
3. Withdraw
4. Check Balance
5. View Transaction History
6. Generate Account Report
7. Exit
Enter your choice: 1
Enter Account Type (1 for BankAccount, 2 for SavingsAccount): 2

Enter Account Number: 12345

Enter Account Holder Name: John Doe

Enter Initial Balance: 1000

Account Created Successfully!

