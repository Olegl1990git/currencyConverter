package com.company.services.imp;

import com.company.exeptions.ParsingExeption;
import com.company.model.CurrencyRates;
import com.company.services.JsonParser;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class GsonJsonParser implements JsonParser {


    private String filename;
    @Override
    public CurrencyRates parse() {
        Gson gson = new Gson();
        try(FileReader reader = new FileReader(filename)){

           return gson.fromJson(reader,CurrencyRates.class);

        } catch (IOException e) {
            throw new ParsingExeption("Parsing error");
        }

    }

    public GsonJsonParser(String filename) {
        this.filename = filename;
    }

}
