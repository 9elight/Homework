package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposit(10000.0);


        while (true) {
            try {
                b1.withDraw(6000);
                System.out.println(b1.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    b1.withDraw(b1.getAmount());
                    System.out.println(b1.getAmount());
                } catch (LimitException ex) {
                    ex.getMessage();
                }
                break;
            }
        }

    }
}

