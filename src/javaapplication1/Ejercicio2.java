/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, suma, resta, multiplicacion, division,mod;

        System.out.println("Ingrese el primer numero:");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        num2 = scanner.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        mod = num1 % num2;

        System.out.println("La Suma es: " + suma);
        System.out.println("La Resta es: " + resta);
        System.out.println("La Multiplicacion es: " + multiplicacion);
        System.out.println("La Division es: " + division);
        System.out.println("el modulo es: " + mod);
    }
}

