package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int raio = leitor.nextInt();
        double pi=3.14159;
        double volume = (4.0/3.0)*pi*Math.pow(raio,3);
        System.out.printf("VOLUME = %.3f%n",volume);
        leitor.close();
    }
}
