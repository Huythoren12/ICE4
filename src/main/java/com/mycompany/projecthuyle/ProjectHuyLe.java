/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projecthuyle;

/**
 *
 * @author HP
 */
public class ProjectHuyLe {
      public double divide(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("Cannot divide by zero");
    }
    return a / b;
}

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
