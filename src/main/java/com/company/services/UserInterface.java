package com.company.services;

import com.company.model.CurrencyRates;

public interface UserInterface {
    String getCurrency(CurrencyRates rates);
    double getAmount();
    void showResult(String currency,double amount,double result);
}
