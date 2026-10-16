package dia03;

public class Main {
    public static void main(String[] args) {
        int idade = 70;

        // Teste a condição mais específica antes da condição mais geral.
        if (idade >= 60) {
            System.out.println("Idoso");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Menor de idade");
        }

        boolean temIngresso = true;
        boolean acompanhado = false;

        // && significa E: as duas condições precisam ser verdadeiras.
        if (idade >= 18 && temIngresso) {
            System.out.println("Entrada permitida");
        }

        // || significa OU: basta uma condição verdadeira.
        if (temIngresso || acompanhado) {
            System.out.println("Tem ingresso ou está acompanhado");
        }

        // ! inverte o valor booleano.
        if (!acompanhado) {
            System.out.println("Não está acompanhado");
        }

        // Ternário para uma escolha simples entre dois valores.
        String situacao = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(situacao);

        System.out.println("\n=== Switch tradicional ===");
        SwitchTradicional.demonstrar();

        System.out.println("\n=== Switch moderno ===");
        SwitchModerno.demonstrar();

        System.out.println("\n=== instanceof ===");
        InstanceofHeranca.demonstrar();
    }
}
