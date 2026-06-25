# 🤖 AgentLang

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
![ANTLR4](https://img.shields.io/badge/ANTLR-4-F58220)

> Un lenguaje propio (DSL) para definir agentes inteligentes basados en reglas percepción → condición → acción.

**AgentLang** es un lenguaje de dominio específico (DSL) diseñado desde cero con **ANTLR4**. Permite describir **agentes reactivos** de forma declarativa: cada agente tiene un estado, percibe datos de su entorno y reacciona mediante reglas `si ... entonces ... sino ...`.

## Ejemplo

```
// Agente que controla un semáforo inteligente
agente Semaforo {
  estado: rojo;
  percibe numero autos;
  percibe booleano emergencia;

  si autos > 20 y emergencia == falso entonces {
    accion cambiar("verde");
    accion notificar("trafico_alto");
  }
  si emergencia == verdadero entonces {
    accion cambiar("rojo");
    enviar("alerta", CentralControl);
  } sino {
    accion esperar();
  }
}
```

## El lenguaje

| Construcción | Sintaxis |
|---|---|
| Declarar un agente | `agente Nombre { ... }` |
| Estado inicial | `estado: nombre;` |
| Percepción (sensor) | `percibe numero\|texto\|booleano nombre;` |
| Regla | `si <condición> entonces { ... }` (con `sino` opcional) |
| Acción | `accion nombre(args);` |
| Enviar mensaje a otro agente | `enviar("mensaje", Destinatario);` |
| Operadores lógicos | `y`, `o`, `no` |
| Comparadores | `>` `<` `>=` `<=` `==` `!=` |
| Valores | números, textos `"..."`, `verdadero` / `falso` |
| Comentarios | `// ...` |

## Cómo está construido

- **Gramática:** `AgentLang.g4` define las reglas léxicas y sintácticas del lenguaje.
- **ANTLR4** genera el lexer y el parser en **Java** a partir de esa gramática.
- Los árboles de sintaxis de los ejemplos quedan como imágenes (`semaforo_tree.svg`).

## Generar y probar

**Requisitos:** Java y [ANTLR4](https://www.antlr.org/) instalados.

```bash
# 1. Generar el lexer y el parser desde la gramática
antlr4 AgentLang.g4

# 2. Compilar
javac AgentLang*.java

# 3. Ver el árbol de sintaxis de un programa de ejemplo
grun AgentLang programa -gui prueba.agent
```

## Estructura

```
AgentLang.g4        # Gramática del lenguaje (fuente principal)
prueba.agent        # Programa de ejemplo (semáforo inteligente)
semaforo_tree.svg   # Árbol de sintaxis del ejemplo
AgentLang*.java     # Lexer y parser generados por ANTLR
```

## Autora

**Cielo Chávez** — [GitHub @skyluw](https://github.com/skyluw) · [LinkedIn](https://www.linkedin.com/in/cielo-chavez)
