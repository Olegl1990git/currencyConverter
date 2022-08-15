package com.company;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class GsonJsonParser implements JsonParser{



    @Override
    public <T> T parse(String filename,T obj) {
        Gson gson = new Gson();
        try(FileReader reader = new FileReader(filename)){

           return gson.fromJson(reader, (Class<T>) obj.getClass());

        } catch (IOException e) {
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}
