package br.com.eduardo.conversor.classes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObeterValor {

    public static double valor(String mensagem, Scanner entrada) {
        double valor;

        do {
            try {
                System.out.println("Digite o valor que deseja " + mensagem);
                valor = entrada.nextDouble();
                if (valor == 0) {
                    System.out.println("Deseja sair?");
                    System.exit(0); // Encerra o programa imediatamente
                }
                break; // Saída do loop se um valor válido for inserido
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um valor válido. ");
                entrada.next(); // Limpar o buffer do scanner
            }
        } while (true);

        return valor;
    }
}
