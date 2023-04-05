package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroFuncionario= leitor.nextInt();
        int horas = leitor.nextInt();
        double valorHoras = leitor.nextDouble();
        double salario = horas*valorHoras;

        System.out.println("NUMBER = "+numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n",salario);
    }
}
