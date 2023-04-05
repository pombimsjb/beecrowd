package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1017 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double consumo=12.0;
        int tempoGasto = leitor.nextInt();//10hrs
        int velocidadeMedia = leitor.nextInt(); //85km/hrs

        double gastoLitros = (tempoGasto*velocidadeMedia)/consumo;
        System.out.printf("%.3f%n",gastoLitros);

        leitor.close();


    }
}
