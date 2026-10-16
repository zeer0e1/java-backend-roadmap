package dia03;

public class ResolucoesDia03 {
    public static void main(String[] args) {
        classificarNota(5);
        classificarNota(6);
        classificarNota(8.5);
        classificarNota(9);

        int idade = 20;
        boolean temIngresso = true;
        if (idade >= 18 && temIngresso) {
            System.out.println("Entrada permitida");
        } else {
            System.out.println("Entrada não permitida");
        }

        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // A versão corrigida encerra cada caso com break.
        int nivel = 1;
        switch (nivel) {
            case 1:
                System.out.println("Nível 1");
                break;
            case 2:
                System.out.println("Nível 2");
                break;
            default:
                System.out.println("Outro nível");
        }

        Animal animal = new Gato();
        System.out.println(animal instanceof Animal); // true
        System.out.println(animal instanceof Gato);   // true
    }

    private static void classificarNota(double nota) {
        // A ordem das condições separa corretamente as faixas.
        if (nota < 6) {
            System.out.println("Recuperação");
        } else if (nota < 9) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Excelente");
        }
    }
}

class Animal {
}

class Gato extends Animal {
}
