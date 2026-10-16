package dia03;

public class SwitchTradicional {
    public static void demonstrar() {
        String prioridade = "MEDIA";

        // O break encerra cada caso.
        switch (prioridade) {
            case "BAIXA":
                System.out.println("Pode aguardar");
                break;
            case "MEDIA":
                System.out.println("Prioridade média");
                break;
            case "ALTA":
                System.out.println("Atender em breve");
                break;
            default:
                System.out.println("Prioridade desconhecida");
        }

        // Fall-through intencional para demonstrar a execução sem break.
        int nivel = 1;
        switch (nivel) {
            case 1:
                System.out.println("Nível 1");
                // Sem break: a execução continua no caso 2.
            case 2:
                System.out.println("Nível 2");
                break;
            default:
                System.out.println("Outro nível");
        }
    }
}
