package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1020 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtdTotalDias = leitor.nextInt();
        int qtdAnos = qtdTotalDias / 365;
        qtdTotalDias = qtdTotalDias % 365;

        int qtdMeses = qtdTotalDias/30;
        qtdTotalDias = qtdTotalDias%30;

        int qtdDias = qtdTotalDias;

        System.out.printf("%d ano(s)%n",qtdAnos);
        System.out.printf("%d mes(es)%n",qtdMeses);
        System.out.printf("%d dia(s)%n",qtdDias);

        leitor.close();
    }
}
