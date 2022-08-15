package com.company;

public interface JsonParser {
     <T> T parse(String filename, T obj );
}
