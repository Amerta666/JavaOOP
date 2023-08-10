package sem7.patterns.contractMethods;

public class MathUtils {

    /**
     * Возвращает сумму двух целых чисел.
     *
     * @param a Первое целое число.
     * @param b Второе целое число.
     * @return Сумма a и b.
     * @throws IllegalArgumentException Если a или b выходят за пределы допустимых значений.
     */
    public static int add(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Параметры должны быть неотрицательными.");
        }
        return a + b;
    }
}
