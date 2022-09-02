package com.company;

import com.company.exeptions.DivisionByZeroException;
import com.company.exeptions.ParsingException;
import com.company.services.*;
import com.company.services.imp.CalculationImp;
import com.company.services.imp.ConsoleUserInterface;
import com.company.services.imp.GsonJsonParser;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {


    public static void main(String[] args) {
        JsonParser parser = new GsonJsonParser("conversionRates.json");
        UserInterface userInterface = new ConsoleUserInterface();
        Calculation calc = new CalculationImp();
        MainService mainService = new MainService(parser, userInterface, calc);

        try {
            mainService.execute();
        } catch (DivisionByZeroException e) {
            System.out.println("There was an error during calculation");
            log.error(e.getMessage());

        } catch (ParsingException e) {
            System.out.println("There was and error during parsing");
            log.error(e.getMessage());
            log.error(e.getCause().toString());
        }


    }
}
