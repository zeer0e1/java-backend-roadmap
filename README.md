# ☕ Estudos de Java

Repositório criado para acompanhar minha evolução nos estudos de Java.

## 📚 Objetivo

Estudar os fundamentos da linguagem Java e evoluir gradualmente para desenvolvimento backend com Spring Boot.

## ✅ Dia 01 - Fundamentos

Conteúdos estudados:

- JVM
- Estrutura de um programa Java
- Classes
- Objetos
- Atributos
- Métodos
- Parâmetros
- Método `main`
- `System.out.println`
- Criação de objetos com `new`

## 💻 Exercício realizado

Criação de uma classe `ContaBancaria` com:

- titular
- saldo
- método para exibir dados
- método para adicionar saldo
- método para sacar valor

Exemplo:

```java
public class ContaBancaria {

    String titular;
    float saldo;

    void dados() {
        System.out.println("Meu nome é " + titular);
    }

    void adicionarSaldo(float valor) {
        saldo += valor;
    }

    void sacar(float valor) {
        saldo -= valor;
    }
}