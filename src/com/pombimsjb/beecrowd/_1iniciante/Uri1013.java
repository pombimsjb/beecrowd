package com.pombimsjb.beecrowd._1iniciante;

import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();

        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        System.out.println(maiorABC + " eh o maior");

        leitor.close();
    }
}
