interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    double balance;
    double rate = 0.04;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance!");
    }

    public void calculateInterest() {
        balance += balance * rate;
        System.out.println("Interest added.");
    }

    public void viewBalance() {
        System.out.println("Savings Balance: " + balance);
    }
}

class CurrentAccount implements Account {
    double balance;
    double overdraft = 5000;

    CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraft)
            balance -= amount;
        else
            System.out.println("Overdraft limit exceeded!");
    }

    public void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }

    public void viewBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Interface4 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(10000);
        CurrentAccount c = new CurrentAccount(5000);

        s.deposit(2000);
        s.calculateInterest();
        s.viewBalance();

        c.withdraw(6000);
        c.viewBalance();
    }
}

