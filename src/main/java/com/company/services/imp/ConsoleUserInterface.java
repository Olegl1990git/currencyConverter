package com.company.services.imp;

import com.company.model.CurrencyRates;
import com.company.services.UserInterface;

import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface {

   private Scanner scanner = new Scanner(System.in);

    @Override
    public String getCurrency(CurrencyRates rates) {
        String currency;

        do{
            System.out.println("To what currency do you want to convert");
            System.out.println(rates.getRates().keySet());
            currency = scanner.next();
            currency = currency.toUpperCase();

        }while(!rates.getRates().containsKey(currency));
        return currency;
    }

    @Override
    public double getAmount() {
        double amount;
        do{
            System.out.println("How much money do you want to convert");
            while (!scanner.hasNextDouble()){
                System.out.println("How much money do you want to convert");
                scanner.next();
            }
            amount = scanner.nextDouble();
        } while(amount<=0);
        return amount;
    }

    @Override
    public void showResult(String currency,double amount,double result) {
        System.out.println(amount + " RUB = " + result + " " + currency);
    }
}
