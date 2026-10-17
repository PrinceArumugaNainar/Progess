package Revision;

public class Amount {

    private double balance = 5000;

    public double withdraw(double amount)
            throws InSuffecientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount must be greater than zero"
            );
        }

        if (amount > balance) {
            throw new InSuffecientBalanceException(
                "Insufficient balance"
            );
        }

        balance = balance - amount;
        return balance;
    }

    public static void main(String[] args) {
        Amount account = new Amount();

        try {
            double remainingBalance = account.withdraw(2000);

            System.out.println(
                "Remaining balance: " + remainingBalance
            );

        } catch (IllegalArgumentException |
                 InSuffecientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }
}



/*
 
 
 Throws IllegalArgumentException if amount is zero or negative.



Throws a custom checked exception called InsufficientBalanceException if the withdrawal amount exceeds the available balance.



Otherwise, deducts the amount from the balance



 */


