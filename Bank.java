public class Bank {
    double amount; // instance variable

    // Parameterized constructor
    Bank(double amount) {
        this.amount = amount;
    }

    // Withdraw method using ternary operator
    void withdraw(double withdrawalAmount) {

        String message = (withdrawalAmount <= amount)
                ? "Withdraw successful"
                : "Insufficient balance";

        System.out.println(message);

        // update amount only if sufficient balance
        if (withdrawalAmount <= amount) {
            amount = amount - withdrawalAmount;
        }
    }

    // Deposit method
    void deposit(double depositAmount) {
        amount = amount + depositAmount;
        System.out.println("after deposit, available balance: " + amount);
    }

    public static void main(String[] args) {
        // Initial amount = 10000
        Bank b = new Bank(10000);

        // withdraw 5000
        b.withdraw(5000);

        // deposit 5000
        b.deposit(5000);
    }
}
 
