package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
        //area = n * (radio *raio);
        Scanner entrada = new Scanner(System.in);

        double n=3.14159;
        double raio=entrada.nextDouble();
        double area = n*Math.pow(raio,2);

        System.out.printf("A=%.4f%n",area);
            //   %.4f = (f)Formatado para 4 casas após o ponto.
            // %n = após a formatação das casas é apresentado o fim da linha.
        entrada.close();

    }
}
