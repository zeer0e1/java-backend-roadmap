package dia02;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Variáveis e tipos ===");
        VariaveisETipos.demonstrar();

        System.out.println("\n=== Área do retângulo ===");
        double largura = 5.0;
        double altura = 3.0;
        double area = Retangulo.calcularArea(largura, altura);
        System.out.println("Área: " + area);

        System.out.println("\n=== Pessoa, objeto e referência ===");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Lucas";

        // pessoa2 recebe a referência para o mesmo objeto.
        Pessoa pessoa2 = pessoa1;

        System.out.println("Nome por pessoa1: " + pessoa1.nome);
        System.out.println("Nome por pessoa2: " + pessoa2.nome);

        pessoa2.nome = "Lucas atualizado";
        System.out.println("Após alterar por pessoa2: " + pessoa1.nome);
    }
}
