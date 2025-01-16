package day1;
import day1.BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount myacc = new BankAccount();

        myacc.setBalance(10000);

        myacc.deposit(1000);
        myacc.withdraw(500);

        System.out.println("Created BankAccount object...");
        System.out.println("Account Balance: " + myacc.getBalance());
        System.out.println("Account name: " + myacc.getName());
        System.out.println("Account age: " + myacc.getAge());
        System.out.println("Account email: " + myacc.getEmail());
        System.out.println("Program End.");

    }
}
