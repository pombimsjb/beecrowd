package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        double Y = leitor.nextDouble();

        double media = X/Y;
        System.out.printf("%.3f km/l%n",media);

        leitor.close();
    }
}
