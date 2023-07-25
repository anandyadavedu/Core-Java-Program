package BasicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class ReadingInputFromKeyboard {
    public static void main(String[] args) throws IOException {
        System.out.println("What is your name?"); // what is your name
        String name = System.console().readLine(); // blink for user input
        System.out.println(name); // print which you have input through keyboard

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name2 = br.readLine(); // blink for user input
        System.out.println(name2); // print

        // taking input from Scanner class
        Scanner sc = new Scanner(System.in);
        String name3 = sc.nextLine(); // blink for user input
        sc.close();
        System.out.println(name3); // print

    }
}
