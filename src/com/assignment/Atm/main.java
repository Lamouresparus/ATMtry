package com.assignment.Atm;

import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        AcctDetails user1 = new AcctDetails(1234, "aaaa");
        AcctDetails user2 = new AcctDetails(2345, "bbbb");
        AcctDetails user3 = new AcctDetails(3456, "cccc");

        float user1Bal = 50000;
        float user2Bal = 3400;
        float user3Bal = 25000;



        //Scanner kb = new Scanner(System.in);
        //System.out.println("Welcome!\n Please enter your account number\n\n Press 0 to exit");
        //int acctN0 = kb.nextInt();
        String AcctN0 = JOptionPane.showInputDialog("Welcome!\nPlease enter your account number\nPress 0 to exit");
        int acctN0 = Integer.parseInt(AcctN0);
        if(acctN0==0){
           // System.out.println("Goodbye!");
            JOptionPane.showMessageDialog(null, "Goodbye!");}
        else{
            if(acctN0==user1.getAcctNumber() || acctN0==user2.getAcctNumber() || acctN0==user3.getAcctNumber()){
                //System.out.println("Please enter your four digit pin");
                String acctps = JOptionPane.showInputDialog("Please enter your 4 digit pin");

                AcctDetails user4 = new AcctDetails(acctN0, acctps);

                if(user4.isEqual(user1) || user4.isEqual(user2) || user4.isEqual(user3)){
                    if(user4.isEqual(user1)) {
                        transaction(user1Bal);
                    }
                    if(user4.isEqual(user2)){
                        transaction(user2Bal);
                    }
                    if(user4.isEqual(user3)){
                        transaction(user3Bal);
                    }
                }
                else{
                   // System.out.println("Wrong password!!!");
                    JOptionPane.showMessageDialog(null, "Wrong password!");
                }
            }

            else{
                //System.out.println("Ooops! it seems you do not have an account with us.\nGoodbye.");
                JOptionPane.showMessageDialog(null, "Ooops! it seems you do not have an account with us.\nGoodbye.");
            }
        }


    }

    public static void Withdraw(float balance){
        System.out.println("Please enter amount to withdraw");
        Scanner kb = new Scanner(System.in);
        float amount = kb.nextInt();
        if(balance<amount){
            //System.out.println("Sorry you do not have sufficient funds for this transaction");
            JOptionPane.showMessageDialog(null, "Sorry you do not have sufficient funds for this transaction!");
            transaction(balance);
        }
        else{
            balance = balance-amount;
            System.out.println("Your account has been debited with $"+amount+"\nYour new balance is $"+balance+"\n\n" +
                    "Press 1 to perform another transaction or 0 to exit");
            int result = kb.nextInt();
            if (result == 1){
                transaction(balance);
            }
            else{
                System.out.println("Thank you for choosing us!");
            }
        }
    }



    public static void Deposit(float balance){
        System.out.println("Please enter amount to deposit");
        Scanner kb = new Scanner(System.in);
        float amount = kb.nextInt();
        balance = balance+amount;
        System.out.println("Your account has been credited with $"+amount+"\nYour new balance is $"+balance+"\n\n" +
                "Press 1 to perform another transaction or another number to exit");
        int result = kb.nextInt();
        if (result == 1){
            transaction(balance);
        }
        else{
            System.out.println("Thank you for choosing us!");
        }
    }




    public static void CheckBal(float balance){
        System.out.println("Your account balance is "+ balance + "To perform another transaction press 1, or press anyother number to exit.");
        Scanner kb = new Scanner(System.in);
        int result = kb.nextInt();
        if (result == 1){
            transaction(balance);
        }
        else{
            System.out.println("Thank you for choosing us!");
        }
    }





    public static void transaction(float userBal){
        System.out.println("What would you like to do?\n Please select an option\n\n[1] Withdraw\n[2] Deposit\n" +
                "[3] Check Balance\n\n\tPress any other number to exit");
        Scanner kb = new Scanner(System.in);
        int MenuChoice = kb.nextInt();

        if (MenuChoice==1){
            Withdraw(userBal);
        }
        if (MenuChoice==2){
            Deposit((userBal));
        }
        if (MenuChoice==3){
            CheckBal(userBal);

        }
    }}

