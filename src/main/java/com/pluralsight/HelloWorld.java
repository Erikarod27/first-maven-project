package com.pluralsight;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Name: ");
        System.out.println("Hello " + name.nextLine());
    }

}
