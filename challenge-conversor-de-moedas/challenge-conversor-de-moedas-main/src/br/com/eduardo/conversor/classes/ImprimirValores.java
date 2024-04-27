package br.com.eduardo.conversor.classes;

import java.io.IOException;

public class ImprimirValores {

    public static void imprimir(double valorEntrada, String baseCode, String tagetCode ) throws IOException, InterruptedException {
        Api.lerApi();
        System.out.println("O valor de "
                + Localizacao.localizando(baseCode, valorEntrada).valorFormatado()
                +" (" + Localizacao.localizando(baseCode, 0).nomeMoeda() + ") convertido é "
                + Localizacao.localizando(tagetCode,
                        Api.inciaApi(baseCode,
                                tagetCode,
                                valorEntrada)).
                valorFormatado()
                +" (" + Localizacao.localizando(tagetCode, 0).nomeMoeda() +")");
    }
}
