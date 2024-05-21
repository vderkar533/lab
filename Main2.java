class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawal not allowed. Base class method called.");
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(double initialBalance, double withdrawalLimit) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

   
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful from Savings Account. New balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed from Savings Account. Either exceeds withdrawal limit or insufficient funds.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftFee;

    public CheckingAccount(double initialBalance, double overdraftFee) {
        super(initialBalance);
        this.overdraftFee = overdraftFee;
    }

   
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful from Checking Account. New balance: $" + balance);
        } else {
            balance -= overdraftFee;
            System.out.println("Withdrawal of $" + amount + " exceeds balance. Overdraft fee of $" + overdraftFee + " charged. New balance: $" + balance);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 500);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(300);
        savingsAccount.withdraw(700);

        CheckingAccount checkingAccount = new CheckingAccount(2000, 50);
        checkingAccount.deposit(300);
        checkingAccount.withdraw(2500);
        checkingAccount.withdraw(1500);
    }
}
