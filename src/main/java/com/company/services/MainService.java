package com.company.services;


import com.company.model.CurrencyRates;
import lombok.RequiredArgsConstructor;

import java.util.Locale;

@RequiredArgsConstructor
public class MainService {

    private final JsonParser parser;
    private final UserInterface userInterface;
    private final Calculation calculation;


    public void execute() {
        CurrencyRates currencyRates = parser.parse();
        String currency;
        do {
            userInterface.showString("To what currency do you want to convert");
            userInterface.showString(currencyRates.getRates().keySet().toString());
            currency = userInterface.getString();
            currency = currency.toUpperCase(Locale.ROOT);
        } while (!currencyRates.getRates().containsKey(currency));
        double amount;
        do {
            userInterface.showString("How much money do you want to convert");
            amount = userInterface.getDouble();
        } while (amount <= 0);

        double result = calculation.divide(amount, currencyRates.getRates().get(currency));
        userInterface.showString(amount + " RUB = " + result + " " + currency);
    }
}
