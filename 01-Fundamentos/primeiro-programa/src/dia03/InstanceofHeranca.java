package dia03;

class Animal {
}

class Cachorro extends Animal {
}

public class InstanceofHeranca {
    public static void demonstrar() {
        // Tipo declarado: Animal. Tipo real do objeto: Cachorro.
        Animal animal = new Cachorro();

        System.out.println(animal instanceof Animal);   // true
        System.out.println(animal instanceof Cachorro); // true
    }
}
