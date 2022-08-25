package com.company.services;

import com.company.model.CurrencyRates;

public interface Calculation {
    double calculate(String currency, double amount, CurrencyRates rates);
}
