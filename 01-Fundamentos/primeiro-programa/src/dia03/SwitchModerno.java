package dia03;

public class SwitchModerno {
    public static void demonstrar() {
        String cargo = "PLENO";

        // Com ->, apenas o caso correspondente é executado.
        switch (cargo) {
            case "JUNIOR" -> System.out.println("Está começando");
            case "PLENO" -> System.out.println("Já tem experiência");
            case "SENIOR" -> System.out.println("Tem bastante experiência");
            default -> System.out.println("Cargo desconhecido");
        }
    }
}
