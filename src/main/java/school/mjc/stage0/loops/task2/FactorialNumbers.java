package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int count = 0;

        while (count <= printToInclusive) {
            if (count == 0) {
                // Особливий випадок: 0! = 1
                factorial = 1;
            } else {
                // Множимо попередній факторіал на поточний лічильник
                factorial *= count;
            }

            // Виводимо факторіал у консоль
            System.out.println(factorial);

            // Переходимо до наступного числа
            count++;
        }
    }
}