package org.example;

import java.util.Scanner;

/*Напиши программу, которая для любого целого числа выводит все числа от 0 до этого числа включительно.

При этом, если выводимое число делится на 3, то вместо него программа выводит слово fizz,
если выводимое число делится на 5, то вместо него программа выводит слово buzz,
а если делится и на то и на то, то программа должна вывести fizzbuzz.*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a > 0) {
            for(int i = 0; i <= a; i++) {
                if (i == 0) {
                    System.out.print(i + " ");
                } else if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.print("fizzbuzz" + " ");
                } else if (i % 5 == 0) {
                    System.out.print("buzz" + " ");
                } else if (i % 3 == 0) {
                    System.out.print("fizz" + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
        } else {
            for(int j = 0; j >= a; j--) {
                if (j == 0) {
                    System.out.print(j + " ");
                } else if ((j % 3 == 0) && (j % 5 == 0)) {
                    System.out.print("fizzbuzz" + " ");
                } else if (j % 5 == 0) {
                    System.out.print("buzz" + " ");
                } else if (j % 3 == 0) {
                    System.out.print("fizz" + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
        }
        scanner.close();
    }
}