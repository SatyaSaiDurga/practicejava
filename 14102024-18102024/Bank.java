public class Bank {
    private int currentAmount = 2000;

    public static void greeting() {
        System.out.println("Welcome to Bank");
    }

    public void deposit(int amount) {
        if (amount > 0) {
            currentAmount += amount;
            System.out.println("Amount Deposited: " + amount);
            System.out.println("Total Balance: " + currentAmount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(int amount) {
        if (amount > currentAmount) {
            System.out.println("Insufficient funds. Unable to withdraw " + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            currentAmount -= amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Total Balance: " + currentAmount);
        }
    }

    public static void main(String[] args) {
        greeting();
        Bank bank = new Bank();
        bank.deposit(2000);
        bank.withdraw(500);
        bank.withdraw(3000); // Example of insufficient funds
    }
}

