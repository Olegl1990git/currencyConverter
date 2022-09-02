package com.company;


import com.company.exeptions.DivisionByZeroException;
import com.company.exeptions.ParsingException;
import com.company.services.*;
import com.company.services.imp.CalculationImp;
import com.company.services.imp.ConsoleUserInterface;
import com.company.services.imp.GsonJsonParser;

import java.util.logging.Level;
import java.util.logging.Logger;


public class App {
    static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.WARNING);

        JsonParser parser = new GsonJsonParser("conversionRates.json");
        UserInterface userInterface = new ConsoleUserInterface();
        Calculation calc = new CalculationImp();
        MainService mainService = new MainService(parser, userInterface, calc);

        try {
            mainService.execute();
        } catch (DivisionByZeroException e) {
            System.out.println("There was an error during calculation");
            logger.log(Level.WARNING, e.getMessage());

        } catch (ParsingException e) {
            System.out.println("There was and error during parsing");
            logger.log(Level.WARNING, e.getMessage());
            logger.log(Level.WARNING, e.getCause().toString());
        }


    }
}
