import java.util.Scanner;

class BankAccount {
    int balance;

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " credited. Current balance = " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. Current balance = " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class SavingAccount extends BankAccount {
   
    void withdraw(int amount) {
        if (amount < 100) {
            System.out.println("Minimum withdrawal amount is 100!");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully (Savings). Current balance = " + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        BankAccount ba = new BankAccount();
        SavingAccount sa = new SavingAccount();

        System.out.print("Enter amount to deposit: ");
        int depositAmount = s.nextInt();
        ba.deposit(depositAmount);

        System.out.print("Enter amount to withdraw from BankAccount: ");
        int withdrawAmount = s.nextInt();
        ba.withdraw(withdrawAmount);

        System.out.print("Enter amount to withdraw from SavingAccount: ");
        int withdrawSavings = s.nextInt();
        sa.deposit(ba.balance); 
        sa.withdraw(withdrawSavings);

       
    }
}

    
    

