package arsw.homework;

public class Statistics {

    public static double mean(MyLinkedList<Double> numbers) {
        double sum = 0;
        for (double n : numbers) {
            sum += n;
        }
        return sum / numbers.size();
    }

    public static double stdDeviation(MyLinkedList<Double> numbers) {
        double mean = mean(numbers);
        double sum = 0;
        for (double n : numbers) {
            sum += Math.pow(n - mean, 2);
        }
        return Math.sqrt(sum / (numbers.size() - 1));
    }
}
