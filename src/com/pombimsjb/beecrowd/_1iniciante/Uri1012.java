package com.pombimsjb.beecrowd._1iniciante;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double pi = 3.14159;
        double triangulo = (A*C)/2.0;
        double circulo = pi*Math.pow(C,2);
        double trapezio = ((A+B)/2)*C;
        double quadrado = Math.pow(B,2);
        double retangulo = A*B;

        System.out.printf("TRIANGULO: %.3f%n",triangulo);
        System.out.printf("CIRCULO: %.3f%n",circulo);
        System.out.printf("TRAPEZIO: %.3f%n",trapezio);
        System.out.printf("QUADRADO: %.3f%n",quadrado);
        System.out.printf("RETANGULO: %.3f%n",retangulo);
        leitor.close();
    }
}
