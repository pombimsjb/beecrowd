package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int totalSegundos = leitor.nextInt();

        int qtdHoras = totalSegundos/3600;
        totalSegundos=totalSegundos%3600;

        int qtdMinutos = totalSegundos/60;
        totalSegundos=totalSegundos%60;

        int qtdSegundos = totalSegundos;
        System.out.println(qtdHoras+":"+qtdMinutos+":"+qtdSegundos);

        leitor.close();
    }
}
