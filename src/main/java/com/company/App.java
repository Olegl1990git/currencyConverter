package com.company;


import java.util.HashMap;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) {

        HashMap<Integer, String> currencyCodes = new HashMap<>();
        currencyCodes.put(1, "CAD");
        currencyCodes.put(2, "EUR");
        currencyCodes.put(3, "GBP");
        currencyCodes.put(4, "JPY");
        currencyCodes.put(5, "USD");

        JsonParser parser = new GsonJsonParser();

        CurrencyRatesModel rates = new CurrencyRatesModel();
        rates = parser.parse("conversionRates.json", rates);

        int codeKey;
        String codeValue;
        double amount;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("To what currency do you want to convert");
            System.out.println("1:CAD\t 2:EUR\t 3:GBP\t 4:JPY\t 5:USD\t ");
            while (!scanner.hasNextInt()){
                System.out.println("Please choose a valid currency");
                System.out.println("1:CAD\t 2:EUR\t 3:GBP\t 4:JPY\t 5:USD\t ");
                scanner.next();
            }
            codeKey = scanner.nextInt();
        } while (codeKey<1 || codeKey>5);

        codeValue = currencyCodes.get(codeKey);


        do{
            System.out.println("How much money do you want to convert");
            while (!scanner.hasNextDouble()){
                System.out.println("How much money do you want to convert");
                scanner.next();
            }
            amount = scanner.nextDouble();
        } while(amount<=0);

        System.out.println(amount + " RUB = " + amount*rates.getRates().get(codeValue) + " " + codeValue);

    }
}
