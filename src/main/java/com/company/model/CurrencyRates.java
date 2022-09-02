package com.company.model;

import lombok.Data;

import java.util.HashMap;

@Data
public class CurrencyRates {
    String base;
    HashMap<String, Double> rates;
}