package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        int result = 0;

        if (multiplyByAndToInclusive >= 0) {
            while (count <= multiplyByAndToInclusive) {
                result = count * multiplyByAndToInclusive;
                System.out.println(result);
                count++;
            }
        } else {
            while (count >= multiplyByAndToInclusive) {
                result = count * multiplyByAndToInclusive;
                System.out.println(result);
                count--;
            }
        }
    }
}
