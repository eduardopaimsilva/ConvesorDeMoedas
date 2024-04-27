package br.com.eduardo.conversor.classes;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CodigoPais {
    public static String codigo(String mensagem ,Scanner entrada) {
        String code;
        int opcao = -1;
        do {
            try {
                System.out.println(mensagem);
                opcao = entrada.nextInt();

                if (opcao == 0) {
                    System.out.println("Programa finalizado");
                    System.exit(0); // Encerra o programa imediatamente
                } else if (opcao >= 1 && opcao <= 14) {
                    code = Menu.menuEscolha(opcao);
                    System.out.println("Voce selecionou "+ Localizacao.localizando(code, 0).nomeMoeda());
                    return code;
                } else {
                    System.out.println("Opção inválida! Por favor, selecione uma opção de 1 a 14 ou 0 para sair.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro. ");
                entrada.next(); // Limpar o buffer do scanner
            }
        } while (!(opcao >= 1 && opcao <= 14));
        return null; // Se chegou aqui, algo deu errado, então retornamos null
    }
}
