package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x1 = leitor.nextDouble();
        double y1 = leitor.nextDouble();
        double x2 = leitor.nextDouble();
        double y2 = leitor.nextDouble();

        double distanciaXY = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f%n",distanciaXY);
        leitor.close();
    }
}
