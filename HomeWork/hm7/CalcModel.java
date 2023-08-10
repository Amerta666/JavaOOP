package hm7;

public class CalcModel {

    /**
     * @param value1 - первое слагаемое
     * @param value2 - второе слагаемое
     * @return - сумма
     */
    public double sum(double value1, double value2) {
        return value1 + value2;
    }

    /**
     * @param value1 - делимое
     * @param value2 - делитель
     * @return - частное
     */
    public double div(double value1, double value2) {
        if (value2 != 0) {
            return value1 / value2;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
    }

    /**
     * @param value1 - первый множитель
     * @param value2 - второй множитель
     * @return - произведение
     */
    public double mul(double value1, double value2) {

        return value1 * value2;
    }

    /**
     * @param value1 - уменьшаемое
     * @param value2 - вычитаемое
     * @return - разность
     */
    public double sub(double value1, double value2) {

        return value1 - value2;
    }
}