package com.company.model;

import java.util.HashMap;

public class CurrencyRates {
    String base;
    HashMap<String, Double> rates;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public HashMap<String, Double> getRates() {
        return rates;
    }

    public void setRates(HashMap<String, Double> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "CurrencyRatesModel{" +
                "base='" + base + '\'' +
                ", rates=" + rates +
                '}';
    }


}
