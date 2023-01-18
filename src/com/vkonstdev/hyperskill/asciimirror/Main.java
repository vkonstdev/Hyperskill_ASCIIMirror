package com.vkonstdev.hyperskill.asciimirror;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input the file path:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
        printCow();
    }

    public static void printCow() {
        System.out.println("            ^__^");
        System.out.println("    _______/(oo)");
        System.out.println("/\\/(       /(__)");
        System.out.println("   | w----||    ");
        System.out.println("   ||     ||    ");
    }
}
