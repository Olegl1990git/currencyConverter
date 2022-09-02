package com.company.services.imp;

import com.company.exeptions.ParsingException;
import com.company.model.CurrencyRates;
import com.company.services.JsonParser;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;

import java.io.FileReader;
import java.io.IOException;

@AllArgsConstructor
public class GsonJsonParser implements JsonParser {

    private final String filename;


    @Override
    public CurrencyRates parse() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(filename)) {

            return gson.fromJson(reader, CurrencyRates.class);

        } catch (IOException e) {
            throw new ParsingException("File not found", e);
        }

    }


}