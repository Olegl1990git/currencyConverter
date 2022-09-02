package com.company.services.imp;

import com.company.model.CurrencyRates;
import com.company.services.UserInterface;

import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String getString() {
        return scanner.next();
    }

    @Override
    public double getDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Input must be double");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    @Override
    public void showString(String sting) {
        System.out.println(sting);
    }
}
