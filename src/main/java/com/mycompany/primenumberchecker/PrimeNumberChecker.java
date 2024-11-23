/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumberchecker;
import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class PrimeNumberChecker extends numberChecker {
     public PrimeNumberChecker(int number) {
        super(number);
    }
    public boolean isPrime() {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        numberChecker checker = new PrimeNumberChecker(number);
        if (checker.isPrime()) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
    }

