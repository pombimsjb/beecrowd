package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1016 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // 1km a cada 2min
        //imprime o tempo em minutos para abrir a distancia digitada
        //30km -- 60 minutos
        //110km --220 minutos
        int distancia = leitor.nextInt();
        int tempo = distancia * 2;
        System.out.println(tempo + " minutos");


        leitor.close();
    }
}
