package com.mycompany.contabanco;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Qual o numero da sua conta ? ");
            String numero = scanner.nextLine();
            System.out.print("Qual o seu nome ? ");
            String nome = scanner.nextLine();
            System.out.print("Qual a sau agencia ? ");
            String agencia = scanner.nextLine();
            System.out.print("Qual o valor que quer deposisar ?  ");
            int saldo = scanner.nextInt();

            System.out.println("Olá, " + "Numero da conta é: " + numero +"Seu nome é :" + nome + "Sua agência é: " + agencia + "Seu saldo é: " + saldo);
        }
    }
}
