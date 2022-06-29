import java.util.Scanner;
public class BankAccount {

    private double balance;
    private String name;
    public double getBalance()
    {
        return balance;
    }
    public String getName()
    {
        return name;
    }
    public BankAccount() {
    }
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount) {
        this.balance = getBalance();
        if (amount <= 5000 && amount > 0) {
            balance += amount;
            System.out.println("You have successfully deposited " + amount + " USD into your account.");
            System.out.println("Your current account balance is " + balance + " USD.");
        } else {
            System.out.println("ERROR! Amount to deposit is not valid.");
        }
    }

    }
