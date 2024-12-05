class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100.00; // Minimum balance for savings account

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Withdrawal refused! Minimum balance in account must be " + MIN_BALANCE );
        } else {
            super.withdraw(amount);
        }
    }
}
