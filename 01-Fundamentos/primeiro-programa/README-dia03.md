# Dia 03 — Estruturas condicionais

Neste dia foram praticadas estruturas de decisão em Java:

- `if`, `else if` e `else`;
- operador ternário;
- operadores lógicos `&&` (E), `||` (OU) e `!` (negação);
- `switch` tradicional, `break`, `default` e fall-through;
- `switch` moderno com `->`;
- `instanceof` e herança.

## Como executar

Abra o projeto no IntelliJ IDEA e execute `Main.java`, dentro de `src/dia03`.

Também é possível compilar e executar pelo terminal, a partir da pasta `src`:

```bash
javac dia03/*.java
java dia03.Main
```

Os exemplos separados também podem ser executados trocando o nome da classe depois de `java dia03.`. O `switch` moderno com `->` requer Java 14 ou superior.

## Pontos de atenção

### Ordem das condições

Coloque as condições mais específicas antes das mais gerais. Se `idade > 18` vier antes de `idade > 60`, uma pessoa de 70 anos será classificada como adulta e a condição de idoso não será alcançada. No exemplo, usamos `idade >= 60` para incluir a idade 60.

### `break` e fall-through

No `switch` tradicional, `break` encerra o caso atual. Sem ele, a execução continua nos próximos casos, mesmo quando seus valores não correspondem. O exemplo mostra esse fall-through de propósito; normalmente, use `break` ao final de cada caso.

### Tipo declarado e objeto real no `instanceof`

Uma variável declarada como `Animal` pode guardar um objeto `Cachorro`. O `instanceof` verifica o tipo real do objeto: nesse caso, ambos `animal instanceof Animal` e `animal instanceof Cachorro` são verdadeiros.

## Exercícios

As propostas estão comentadas em `src/dia03/ExerciciosDia03.java`. Tente resolvê-las antes de consultar `src/dia03/ResolucoesDia03.java`.
