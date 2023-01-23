package com.vkonstdev.hyperskill.asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        System.out.println("Input the file path:");
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        try {
            sc = new Scanner(new File(filePath));
            while (sc.hasNext()) {
                //System.out.println(sc.nextLine());
                list.add(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
        formTwoPictures(list);
    }

    private static void formTwoPictures(List<String> list) {
        String maxString = list.stream().max(Comparator.comparing(String::length)).orElse(null);
        for (String el : list) {
            if (el.length() < maxString.length()) {
                el += " ".repeat(maxString.length() - el.length());
            }
            el = el + " | " + reverseString(el);
            System.out.println(el);
        }
    }

    private static String reverseString(String in) {
        char[] letters = in.toCharArray();
        for (int i = 0; i < letters.length / 2; i++) {
            char temp = letters[i];
            letters[i] = letters[letters.length - 1 - i];
            letters[letters.length - 1 - i] = temp;
        }
        for (int i = 0; i < letters.length; i++) {
            switch (letters[i]) {
                case '(' -> letters[i] = ')';
                case ')' -> letters[i] = '(';
                case '>' -> letters[i] = '<';
                case '<' -> letters[i] = '>';
                case '[' -> letters[i] = ']';
                case ']' -> letters[i] = '[';
                case '{' -> letters[i] = '}';
                case '}' -> letters[i] = '{';
                case '/' -> letters[i] = '\\';
                case '\\' -> letters[i] = '/';
                default -> letters[i] = letters[i];
            }
        }
        return String.valueOf(letters);
    }

    /*public static void printCow() {
        System.out.println("            ^__^");
        System.out.println("    _______/(oo)");
        System.out.println("/\\/(       /(__)");
        System.out.println("   | w----||    ");
        System.out.println("   ||     ||    ");
    }*/
}
