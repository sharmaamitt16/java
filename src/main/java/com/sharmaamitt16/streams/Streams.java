package com.sharmaamitt16.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Streams {

    public static void collections() {
        String countryArray[] = { "India", "Pakistan", "Afghanistan", "Sri Lanka" };

        List<String> countryList = new ArrayList<>();
        Collections.addAll(countryList, countryArray);

        System.out.println("Converted ArrayList elements: " + countryList);
    }

    public static void main(String[] args) {
        collections();
    }
}
