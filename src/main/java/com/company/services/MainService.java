package com.company.services;


import com.company.model.CurrencyRates;

import java.util.Locale;

public class MainService {

    private final JsonParser parser;
    private final UserInterface userInterface;
    private final Calculation calculation;

    public MainService(JsonParser parser, UserInterface userInterface, Calculation calculation) {
        this.parser = parser;
        this.userInterface = userInterface;
        this.calculation = calculation;
    }

    public void execute() {
        CurrencyRates currencyRates;
        currencyRates = parser.parse();
        String currency;
        do {
            System.out.println("To what currency do you want to convert");
            System.out.println(currencyRates.getRates().keySet());
            currency = userInterface.getString();
            currency = currency.toUpperCase(Locale.ROOT);
        } while (!currencyRates.getRates().containsKey(currency));
        double amount;
        do {
            System.out.println("How much money do you want to convert");
            amount = userInterface.getDouble();
        } while (amount <= 0);

        double result = calculation.divide(amount, currencyRates.getRates().get(currency));
        userInterface.showString(amount + " RUB = " + result + " " + currency);
    }
}

