package com.sharmaamitt16.core;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void findMatch(String string, String regex) {
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }

    public static void findTime(String string) {
        final String timeRegex = "\\d{2}:\\d{2}";

        System.out.println("Time Regex matching in given string: ");
        findMatch(string, timeRegex);
    }

    public static void findDate(String string) {
        final String dateRegex = "\\d{4}-\\d{2}-\\d{2}";

        System.out.println("Date Regex matching in given string: ");
        findMatch(string, dateRegex);
    }

    public static void findSpace(String string) {
        final String spaceRegex = "\\s";

        System.out.println("Space Regex matching in given string: ");
        findMatch(string, spaceRegex);
    }

    static public void countSyllables(String string) {
        final String splitRegex = "e!$|e[?]$|e,|e |e[),]|e$";
        final String vowelsRegex = "[aeiouy]+";

        Integer counter = 0;
        string = string.toLowerCase();
        if (string.contains("the ")) {
            counter++;
        }
        String[] split = string.split(splitRegex);

        ArrayList<String> al = new ArrayList<String>();
        Pattern tokSplitter = Pattern.compile(vowelsRegex);

        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            Matcher m = tokSplitter.matcher(s1);

            while (m.find()) {
                al.add(m.group());
            }
        }

        counter += al.size();

        System.out.println("Syllable counter: " + counter);
    }

    public static void main(String[] args) {
        String string = "Breakfast at 08:30 AM on 2023-06-10 in kitchen area.";
        findTime(string);
        findDate(string);
        findSpace(string);
        countSyllables("Lalalalalalalala");
    }
}
