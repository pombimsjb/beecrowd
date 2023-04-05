package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int codPeca1 = leitor.nextInt();
        int numeroPeca1 = leitor.nextInt();
        double valorUnitarioPeca1 = leitor.nextDouble();

        int codPeca2 = leitor.nextInt();
        int numeroPeca2 = leitor.nextInt();
        double valorUnitarioPeca2 = leitor.nextDouble();

        double totalPagar = numeroPeca1*valorUnitarioPeca1+numeroPeca2*valorUnitarioPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",totalPagar);
        leitor.close();
    }
}
