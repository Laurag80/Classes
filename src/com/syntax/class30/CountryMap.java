package com.syntax.class30;

import java.util.*;
/*
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.
 */
public class CountryMap {
    public static void main(String[] args) {
        // Create a map of countries with their capital cities
        Map<String, String> countryCapitalMap = new TreeMap<>();

        // Add some countries to the map
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Australia", "Canberra");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("Canada", "Ottawa");

        // Print all keys and values using for-each loop
        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

        // Print all keys and values using iterator
        Iterator<Map.Entry<String, String>> iterator = countryCapitalMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

        // Print all values using for-each loop
        for (String capital : countryCapitalMap.values()) {
            System.out.println(capital);
        }

        // Print all values using iterator
        Iterator<String> valueIterator = countryCapitalMap.values().iterator();
        while (valueIterator.hasNext()) {
            System.out.println(valueIterator.next());
        }
    }
}
