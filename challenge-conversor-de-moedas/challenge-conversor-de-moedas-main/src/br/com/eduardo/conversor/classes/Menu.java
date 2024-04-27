package br.com.eduardo.conversor.classes;

public class Menu {
    public static String menuEscolha(int opcao) {
        switch (opcao) {
            case 1:
                return "BRL";
            case 2:
                return "USD";
            case 3:
                return "EUR";
            case 4:
                return "GBP";
            case 5:
                return "JPY";
            case 6:
                return "AUD";
            case 7:
                return "CHF";
            case 8:
                return "CAD";
            case 9:
                return "CNY";
            case 10:
                return "ARS";
            case 11:
                return "TRY";
            case 12:
                return "BOB";
            case 13:
                return "CLP";
            case 14:
                return "COP";
            default:
                throw new IllegalArgumentException("Opção inválida! Por favor, selecione uma opção de 1 a 14.");
        }
    }

    public void mostraMenu() {
        System.out.println("""
                1 - Real Brasileiro (BRL)
                2 - Dólar Americano (USD)
                3 - Euro (EUR)
                4 - Libra esterlina (GBP)
                5 - Iene (JPY)
                6 - Dólar Australiano (AUD)
                7 - Franco Suíço (CHF)
                8 - Dólar Canadense (CAD)
                9 - Renminbi (Yuan) (CNY)
                10 - Peso Argentino (ARS)
                11 - Lira Turca (TRY)
                12 - Boliviano boliviano (BOB)
                13 - Peso chileno (CLP)
                14 - Peso colombiano (COP)
                """);
    }
}
