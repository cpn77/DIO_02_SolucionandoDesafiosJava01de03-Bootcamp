package com.cpn77;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        int resultado = ((a*b)-(c*d));
        //complete o codigo
        System.out.println("DIFERENCA = " + resultado);
    }
}
