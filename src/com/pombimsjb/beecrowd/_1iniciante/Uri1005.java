package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A=scan.nextDouble();
        double B=scan.nextDouble();

        double MEDIA=((A*3.5)+(B*7.5))/11.0;
        System.out.printf("MEDIA = %.5f%n", MEDIA);

        scan.close();
    }
}
