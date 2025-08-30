package arsw.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.*;
import java.util.*;

public class FileReaderUtil {

    public static List<MyLinkedList<Double>> readColumns(String filename) throws IOException {
        List<MyLinkedList<Double>> columns = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();

                // Ignorar comentarios y líneas vacías
                if (line.isEmpty() || line.startsWith("#")) {
                    continue;
                }

                // Crear nueva lista para cada línea válida
                MyLinkedList<Double> list = new MyLinkedList<>();
                for (String token : line.split("\\s+")) {
                    list.add(Double.parseDouble(token));
                }
                columns.add(list);
            }
        }
        return columns; // Retorna ambas listas (columna1 en [0], columna2 en [1])
    }
}
