package com.generation;

import java.util.Scanner;

public class Main {

    static int num1 = 0;
    static int num2 = 0;

    public static void main(String[] args) {
        entradas("suma");
        int resultado = num1 + num2;
        System.out.println( num1+" + "+num2+" = "+ resultado);

        entradas("resta");
        resultado = num1 - num2;
        System.out.println( num1+" - "+num2+" = "+ resultado);

        entradas("multiplicación");
        resultado = num1 * num2;
        System.out.println( num1+" * "+num2+" = "+ resultado);

        entradas("division");
        resultado = num1 / num2;
        System.out.println( num1+" / "+num2+" = "+ resultado);
    }

    public static void entradas (String selectOperacion){

        String operacion = "";
        if ("suma".equals(selectOperacion)){
            operacion = "addition";
        } else if ("resta".equals(selectOperacion)){
            operacion = "subtraction";
        } else if ("multiplicacion".equals(selectOperacion)){
            operacion = "multiplication";
        } else if ("division".equals(selectOperacion)){
            operacion = "division";
        }

        Scanner console = new Scanner( System.in);
        System.out.print("Enter " + operacion + " number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter " + operacion + " number 2  ");
        num2 = console.nextInt();
    }
}