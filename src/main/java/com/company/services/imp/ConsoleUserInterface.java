package com.company.services.imp;

import com.company.model.CurrencyRates;
import com.company.services.UserInterface;

import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String getString() {
        String currency;
        currency = scanner.next();
        return currency;
    }

    @Override
    public double getDouble() {
        double doubleInput;
        while (!scanner.hasNextDouble()) {
            System.out.println("Input must be double");
            scanner.next();
        }
        doubleInput = scanner.nextDouble();
        return doubleInput;
    }

    @Override
    public void showString(String sting) {
        System.out.println(sting);
    }
}
