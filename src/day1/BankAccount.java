package day1;

public class BankAccount {
    private double balance;
    private String name = "Aziz";
    private int age = 29;
    private String email = "abc@gmail.com";

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposit) {
        this.balance = this.balance + deposit;
    }

    public void withdraw(double withdraw) {
        this.balance = this.balance - withdraw;
    }
}
