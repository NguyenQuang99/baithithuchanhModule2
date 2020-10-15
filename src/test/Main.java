package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice =scanner.nextInt();
        if(!scanner.hasNextInt()) {
            throw new NullPointerException();
        }

    }
}
