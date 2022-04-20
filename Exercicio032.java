package com.company;
import java.util.Scanner;
public class Exercicio032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        traco();
        String[] calculo = new String[] {"Adição", "Subtração"};
        System.out.print("Escolha dentre as contas abaixo:\n");
        for(int i = 0; i < calculo.length; i++) {
            System.out.println("[" + i + "] " + calculo[i]);
        }
        System.out.print("Insira o número da conta que deseja efetuar: ");
        Integer posicaoCalculoEscolhido = scanner.nextInt();
        traco();
        insiraUmNumero();
        Double numeroUm = scanner.nextDouble();
        insiraUmNumero();
        Double numeroDois = scanner.nextDouble();
        Double calculoAdicao = numeroUm + numeroDois;
        Double calculoSubtracao = numeroUm - numeroDois;
        if (posicaoCalculoEscolhido == 0 ) {
            System.out.print("A sua adição deu: "+calculoAdicao);
        } else if (posicaoCalculoEscolhido == 1) {
            System.out.print("A sua subtração deu: "+calculoSubtracao);
        }
    }
    static void traco() {
        System.out.print("---------------------------------------------\n");
    }
    static void insiraUmNumero() {
        System.out.print("Insira um número para efetuar a conta: ");
    }
}
