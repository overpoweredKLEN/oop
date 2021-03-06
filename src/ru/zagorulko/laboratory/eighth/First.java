package ru.zagorulko.laboratory.eighth;

import java.io.*;
import java.util.Scanner;


public class First {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");

            Writer out = new BufferedWriter(
                new OutputStreamWriter(
                new FileOutputStream(file),
                "utf-8"
                    )
                );

            Scanner scanner = new Scanner(System.in, "utf-8");

            out.write(scanner.nextLine());

            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
            System.out.println(e.toString());
        }
    }
}
