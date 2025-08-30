package arsw.homework;

import java.util.List;

public class MainHomework {
    public static void main(String[] args) {
        try {
            List<MyLinkedList<Double>> columnas = FileReaderUtil.readColumns("src/main/resources/datos.txt");

            MyLinkedList<Double> columna1 = columnas.get(0);
            MyLinkedList<Double> columna2 = columnas.get(1);

            System.out.println("== Column 1 ==");
            System.out.println("Mean = " + Statistics.mean(columna1));
            System.out.println("Std Dev = " + Statistics.stdDeviation(columna1));

            System.out.println("\n== Column 2 ==");
            System.out.println("Mean = " + Statistics.mean(columna2));
            System.out.println("Std Dev = " + Statistics.stdDeviation(columna2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
