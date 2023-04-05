package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome = leitor.next();
        double salario = leitor.nextDouble();
        double vendas = leitor.nextDouble();
        double valorComissao = vendas*0.15;
        double valorPagamento = salario+valorComissao;
        System.out.printf("TOTAL = R$ %.2f%n",valorPagamento);

        leitor.close();
    }
}
