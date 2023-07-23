package sem2.ex001;

public interface INumeric {

    void reset(); // сброс

    /**
     *
     * @return возврат следующего по порядку числа
     */
    int getNext(); // возврат следующего по порядку числа

    /**
     *
     * @param x Установить начальное значение
     */
    void setStart(int x); // Установить начальное значение
}
