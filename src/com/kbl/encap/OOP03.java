package com.kbl.encap;

public class OOP03 {
    public static void main(String[] args) {
        Account account = new Account("mike", 100, "test12");
        System.out.println(account);
    }
}

class Account {
    private String name;
    private double balance;
    private String pass;

    public Account() {
    }

    public Account(String name, double balance, String pass) {
        setName(name);
        setBalance(balance);
        setPass(pass);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("name must be 2 to 4 characters");
            this.name = "unknown";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("balance must be greater than 20");
            balance = 0;
        }
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        if (pass.length() == 6) {
            this.pass = pass;
        } else {
            System.out.println("password must be 6 characters");
            this.pass = "000000";
        }
    }

    @Override
    public String toString() {
        return "Account{" + "name='" + name + '\'' + ", balance=" + balance + ", pass='" + pass + '\'' + '}';
    }
}