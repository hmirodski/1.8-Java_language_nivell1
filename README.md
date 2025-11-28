# 1.8 Java Lambdas - Nivel 1

## 📄 Descripción

Este proyecto contiene la implementación de ocho ejercicios del Sprint 1.08 - Lambdas en Java, utilizando la API de Lambdas y Streams de Java 8+.

### Ejercicio 1: Filtrar strings con letra 'o'

Método que retorna una lista con todas las cadenas que contienen la letra 'o'.

### Ejercicio 2: Filtrar strings con 'o' y más de 5 letras

Método que retorna strings que contienen 'o' y tienen más de 5 caracteres.

### Ejercicio 3: Imprimir meses con lambda

Lista de meses del año impresa usando una expresión lambda con forEach.

### Ejercicio 4: Imprimir meses con method reference

Misma funcionalidad que el ejercicio 3 pero utilizando method reference (`System.out::println`).

### Ejercicio 5: Functional Interface - PiValue

Interfaz funcional con método `getPiValue()` que retorna un double.

### Ejercicio 6: Ordenar strings de corta a larga

Ordena una lista mixta (strings y números) extrayendo solo los strings y ordenándolos por longitud ascendente.

### Ejercicio 7: Ordenar strings de larga a corta

Igual que el ejercicio 6 pero en orden descendente.

### Ejercicio 8: Functional Interface - Reverse

Interfaz funcional con método `reverse()` que recibe y retorna un String invertido.

---

## 💻 Tecnologías Utilizadas

- **Java 17**
- **Maven** - Gestión de dependencias y build
- **IntelliJ IDEA** - Entorno de desarrollo integrado
- **Git** - Control de versiones
- **JUnit 5 (Jupiter)** - Framework de testing

---

## 📋 Requisitos

Para ejecutar este proyecto necesitas:

- **Java Development Kit (JDK) 17** o superior
- **Maven 3.6+**
- **IntelliJ IDEA** (Community o Ultimate) o cualquier IDE compatible con Java
- **Git** para clonar el repositorio

---

## 🛠️ Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/hmirodski/1.8-Java_language_nivell1.git
```

### 2. Abrir el proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA
2. Selecciona `File` → `Open`
3. Navega hasta la carpeta del proyecto y selecciónala
4. Click en `OK`
5. IntelliJ detectará automáticamente el proyecto Maven

### 3. Verificar la configuración del JDK

1. Ve a `File` → `Project Structure`
2. En `Project`, verifica que el SDK sea Java 17
3. Click en `OK`

---

## ▶️ Ejecución

### Ejecutar los tests

```bash
mvn test
```

O desde IntelliJ:

1. Haz clic derecho sobre la carpeta `src/test/java`
2. Selecciona `Run 'All Tests'`

---

## 🧪 Tests Implementados

1. `FilterByOTest` - Verifica filtrado de strings con 'o'
2. `FilterByOLengthGreaterThan5Test` - Verifica filtrado con 'o' y longitud > 5
3. `PrintWithLambdaTest` - Verifica impresión con lambda
4. `PrintWithLambdaRefMethodTest` - Verifica impresión con method reference
5. `PiValueTest` - Verifica interfaz funcional PiValue
6. `SortingByLengthTest` - Verifica ordenación corta a larga
7. `SortingMoreToLessTest` - Verifica ordenación larga a corta
8. `ReverseTest` - Verifica inversión de string

---

## 📁 Estructura del Proyecto

```
1.8-Java_language_nivell1/
├── pom.xml
├── README.md
└── src/
    ├── main/java/
    │   ├── exercise01/
    │   │   └── FilterByLetterO.java
    │   ├── exercise02/
    │   │   └── FilterByLetterOAndMoreThan5.java
    │   ├── exercise03/
    │   │   └── PrintWithLambda.java
    │   ├── exercise04/
    │   │   └── PrintWithLambdaReferenceMethod.java
    │   ├── exercise05/
    │   │   └── PiValue.java
    │   ├── exercise06/
    │   │   └── SortingLessToMoreChars.java
    │   ├── exercise07/
    │   │   └── SortingMoreToLess.java
    │   └── exercise08/
    │       └── ReverserInt.java
    └── test/java/
        ├── FilterByOTest.java
        ├── FilterByOLengthGreaterThan5Test.java
        ├── PrintWithLambdaTest.java
        ├── PrintWithLambdaRefMethodTest.java
        ├── PiValueTest.java
        ├── SortingByLengthTest.java
        ├── SortingMoreToLessTest.java
        └── ReverseTest.java
```

---

## 🌐 Despliegue

Este proyecto es una aplicación de consola local y no requiere despliegue en un servidor. Está diseñado para ejecutarse en un entorno local con fines educativos.

---

## 🤝 Contribuciones

Este es un proyecto educativo personal desarrollado como parte del bootcamp de **IT Academy - Barcelona Activa**.
