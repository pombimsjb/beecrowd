package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1006 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double MEDIA = ((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f%n",MEDIA);
    }
}
