package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1036 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        double A = leitura.nextDouble();
        double B = leitura.nextDouble();
        double C = leitura.nextDouble();
        double delta = Math.sqrt((B*B)-(4*A*C));
        double R1 = (-B + delta) / (2 * A);
        double R2 = (-B - delta) / (2 * A);
        if(delta>0&& A!=0) {

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }else{
            System.out.println("Impossivel calcular");
        }

    }
}
