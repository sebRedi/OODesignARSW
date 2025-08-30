# Proyecto: Cálculo de Media y Desviación Estándar con Lista Enlazada en Java
## AUTOR: Sebastian Galvis Briceño

## Descripción
Este proyecto implementa en **Java** un programa que calcula la **media** y la **desviación estándar** de un conjunto de números reales.

El enfoque principal de la tarea es el **diseño orientado a objetos (OO Design)** y el uso de **genéricos en estructuras de datos**.  
Por lo tanto, no se utiliza la clase `LinkedList` de Java, sino que se implementa **una lista enlazada propia** que sigue la API de colecciones.

Los números para los cálculos se leen desde un archivo de texto (`datos.txt`), siguiendo el formato establecido en el enunciado.

***EJEMPLO DATOS:***
```
# Columna 1
160 591 114 229 230 270 128 1657 624 1503

# Columna 2
15.0 69.9 6.5 22.4 28.4 65.9 19.4 198.7 38.8 138.2
```
---

## Estructura del proyecto
El proyecto está hecho con **Maven** y tiene la siguiente estructura:

    /src
     └── main
         ├── java.arsw.homework
         │   ├── MyLinkedList.java      # Implementación de lista enlazada
         │   ├── FileReaderUtil.java    # Utilidad para leer datos desde archivo
         │   ├── Statistics.java        # Métodos para media y desviación estándar
         │   └── MainHomework.java      # Programa principal
         └── resources
             └── datos.txt              # Archivo con los datos de entrada

## Funcionamiento

1.  **Lectura de datos**
    La clase `FileReaderUtil` lee el archivo `datos.txt`.

    -   Ignora los comentarios (`#`).
    -   Separa los números de cada línea.
    -   Crea una `MyLinkedList<Double>` para cada columna de datos.

2.  **Cálculo estadístico**
    La clase `Statistics` implementa:

    -   `mean(lista)` → calcula la **media**.
    -   `stdDeviation(lista)` → calcula la **desviación estándar**

3.  **Ejecución**\
    La clase `MainHomework` obtiene ambas listas y muestra los resultados en
    consola.


## Ejecución

Para compilar y ejecutar con Maven:

``` bash
mvn clean compile
mvn exec:java -Dexec.mainClass="MainHomework"
```

Salida esperada:

    == Column 1 ==
    Mean = 550.6
    Std Dev = 572.03

    == Column 2 ==
    Mean = 60.32
    Std Dev = 62.26


