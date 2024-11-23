/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primenumberchecker;

/**
 *
 * @author Peter
 */
abstract class numberChecker {
     protected int number;

    public numberChecker(int number) {
        this.number = number;
    }

    public abstract boolean isPrime();
}
