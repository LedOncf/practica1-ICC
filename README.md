# Práctica 01: Manejo de cadenas (String)

**Nombre:** Edgar Leonardo Cervantes Fabela
**Materia:** Introducción a Ciencias de la Computación 2027-1

---

## Objetivo

Que el alumno se familiarice con la creación y uso de objetos de la clase `String` en Java, utilizando algunos de sus métodos en la elaboración de programas.

---

## Contenido

El repositorio contiene dos programas:

| Programa | Descripción |
|----------|-------------|
| `Psicologo.java` | Simula una sesión con un psicólogo: pide el nombre del paciente, lo saluda, lee su problema y responde usando cadenas. |
| `RFC.java` | Genera el RFC de una persona a partir de su nombre completo y su fecha de nacimiento. |

---

## Estructura del repositorio

```
/ECervantes/
└── practica01/
    └── src/
        └── icc/
            ├── Psicologo.java
            └── RFC.java
```
## Compilación y ejecución

Desde el directorio `practica01/src/`:

### Compilar

```bash
javac icc/Psicologo.java icc/RFC.java
```

### Ejecutar

```bash
java icc.Psicologo
java icc.RFC
```

---

## Ejemplos de ejecución

### Psicologo

```
Bienvenido, cual es su nombre?
Alberto
Buenas tardes Alberto.
Digame, cuál es su problema en la vida?
Odio tener clase los viernes
MMMM... ya veo
Y digame ...
Por qué dice "odio tener clase los viernes"?
Porque no puedo concentrarme y el fin de semana me parece muy corto.
Muy interesante!! Hablaremos de ello con más detalle en la siguiente sesión.
```

### RFC

```
Dame el nombre completo
Andrea Lopez Lopez
ingresa la fecha de nacimiento en formato dd/mm/aa
14/04/92
El RFC de Andrea Lopez Lopez es: LOLA920414
```

#### ¿Cómo se forma el RFC?

1. Dos primeras letras del apellido paterno.
2. Inicial del apellido materno.
3. Inicial del nombre.
4. Últimos dos dígitos del año de nacimiento.
5. Dos dígitos del mes de nacimiento.
6. Dos dígitos del día de nacimiento.

---


- Todo el código está documentado con formato Javadoc.
- El código está correctamente indentado.
- Los archivos `Psicologo.java` y `RFC.java` se encuentran dentro de la estructura de carpetas indicada.
