package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 2; // Починаємо з 2, бо це перше просте число
        while (number <= printToInclusive) {
            boolean isPrime = true;

            // Перевіряємо, чи є дільники від 2 до number - 1
            for (int i = 2; i < number; i++) {
                if (number % i == 0) { // Якщо знайшли дільник
                    isPrime = false; // Число не є простим
                    break; // Перериваємо цикл
                }
            }

            if (isPrime) { // Якщо просте, виводимо
                System.out.println(number);
            }

            number++; // Переходимо до наступного числа
        }
    }
}