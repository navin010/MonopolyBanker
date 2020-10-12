package com.example.monopolybanker;

public class BankAccount {

    //vars
    public String nameOPlayer;
    public int balance;

    //constructor
    public BankAccount(String nameOfField, int balance){
        this.nameOPlayer = nameOPlayer;
        this.balance = balance;
    }

    public String getNameOPlayer() {
        return nameOPlayer;
    }

    public void setNameOPlayer(String nameOPlayer) {
        this.nameOPlayer = nameOPlayer;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }


}
