package com.exercise;

import java.util.*;

public class VowelCount {
    public static void main(String[] args) {
        if (args.length >= 4) {
            System.out.println("Extra arguments passed.");
        } else {
            Map<String, Integer> vowelCount = new HashMap<>();
            Map<String, Integer> ConsonantCount = new HashMap<>();  // extended for consonants
            List<String> argumentList = Arrays.asList(args);
            List<String> argumentListConst = Arrays.asList(args); // for consonants
            argumentList.forEach(argument -> vowelCount.put(argument, getVowelCount(argument)));
            //for consonants
            argumentListConst.forEach(argument -> ConsonantCount.put(argument, getConsonantCount(argument)));
            //System.out.println("----------");
            System.out.println(vowelCount);
            System.out.println(ConsonantCount);
        }
    }

    private static Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }

    private static Integer getConsonantCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[^aeiou]")).count();
    }
}

