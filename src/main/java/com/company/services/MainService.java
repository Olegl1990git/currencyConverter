package com.company.services;


import com.company.model.CurrencyRates;

public class MainService {

   private CurrencyRates currencyRates;
   private JsonParser parser;
   private UserInterface userInterface;
   private Calculation calculation;

   public void execute(){
       currencyRates = parser.parse();
       String currency = userInterface.getCurrency(currencyRates);
       double amount = userInterface.getAmount();
       double result = calculation.calculate(currency,amount,currencyRates);
       userInterface.showResult(currency,amount,result);

   }


    public MainService( JsonParser parser, UserInterface userInterface, Calculation calculation) {
        this.parser = parser;
        this.userInterface = userInterface;
        this.calculation = calculation;
    }
}
