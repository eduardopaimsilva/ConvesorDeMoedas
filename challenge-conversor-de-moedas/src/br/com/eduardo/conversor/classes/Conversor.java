package br.com.eduardo.conversor.classes;

import java.io.IOException;
import java.util.Scanner;


public class Conversor {

    public static void realizarConversao(Scanner entrada, Menu menu) throws IOException, InterruptedException {
        String baseCode;
        String tagetCode;
        String nomeMoedaOrigem ;
        String nomeMoedaDestino ;



        menu.mostraMenu();
        do{
            // Seleção da moeda de origem

            baseCode = CodigoPais.codigo("Selecione a moeda de origem (ou 0 para sair):", entrada);
            nomeMoedaOrigem = Localizacao.localizando(baseCode, 0).nomeMoeda();
            // Seleção da moeda de destino

            tagetCode = CodigoPais.codigo("Selecione a moeda de destino (ou 0 para sair):", entrada);
            nomeMoedaDestino =Localizacao.localizando(tagetCode, 0).nomeMoeda();
            if (baseCode.equals(tagetCode)){
                System.out.println("Voce selecionou a mesma moeda de origem e moeda de destimo");
            }
        }while (baseCode.equals(tagetCode));





        // Obtenção do valor a ser convertido
       try {
            Api.lerApi();
        } catch (IOException e) {
            throw new RuntimeException("A chave da API não foi definida corretamente. verifique api.txt ");
        }

        ImprimirValores.imprimir(ObeterValor.valor(
                        "converter de " + nomeMoedaOrigem + " para " + nomeMoedaDestino + " (ou 0 para sair):", entrada),
                baseCode, tagetCode);




    }


}
