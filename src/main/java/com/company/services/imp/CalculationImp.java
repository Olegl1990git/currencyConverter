package com.company.services.imp;

import com.company.model.CurrencyRates;
import com.company.services.Calculation;

public class CalculationImp implements Calculation {

    @Override
    public double calculate(String currency, double amount, CurrencyRates rates) {
        return amount*rates.getRates().get(currency);
    }
}
