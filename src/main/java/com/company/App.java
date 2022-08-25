package com.company;


import com.company.services.*;
import com.company.services.imp.CalculationImp;
import com.company.services.imp.ConsoleUserInterface;
import com.company.services.imp.GsonJsonParser;


public class App 
{
    public static void main( String[] args ) {
        JsonParser parser = new GsonJsonParser("conversionRates.json");
        UserInterface userInterface = new ConsoleUserInterface();
        Calculation calc = new CalculationImp();
        MainService mainService = new MainService(parser,userInterface,calc);

        mainService.execute();


    }
}
