package com.vkonstdev.hyperskill.asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input the file path:");
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        try {
            sc = new Scanner(new File(filePath));
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
    }

    public static void printCow() {
        System.out.println("            ^__^");
        System.out.println("    _______/(oo)");
        System.out.println("/\\/(       /(__)");
        System.out.println("   | w----||    ");
        System.out.println("   ||     ||    ");
    }
}
