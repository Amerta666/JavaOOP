package hm6;

public class CalcPresenter {


    // Рефакторинг кода 1.
    //
    // private CalcModel model = new CalcModel(); - рудимент
    //
    private CalcModel model;
    //
    // private CalcView view = new CalcView(); - рудимент
    private CalcView view;

    /**
     * @param model - данные для отображения
     * @param view  - реализация отображения данных
     */
    public CalcPresenter(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }

    // метод "calculate" - получает из "view" два числа, определяет введённую операцию по введённому пользователем символу
    public void calculate() {
        double firstNumber = view.getFirstNumber();
        double secondNumber = view.getSecondNumber();
        char ch = view.selectOperation();
        // result - результат вычисления
        double result = 0;
        // Определение операции и передача чисел на вычисление в "model"
        switch (ch) {
            // Рефакторинг кода 2.
            //            case '+':
            //                result = model.sum(firstNumber, secondNumber);
            //                break;
            //            case '-':
            //                result = model.sub(firstNumber, secondNumber);
            //                break;
            //            case '*':
            //                result = model.mul(firstNumber, secondNumber);
            //                break;
            //            case '/':
            //                result = model.div(firstNumber, secondNumber);
            //                break;
            //            default:
            //                System.out.println("Введена неверная операция");
            //                break;
            case '+' -> result = model.sum(firstNumber, secondNumber);
            case '-' -> result = model.sub(firstNumber, secondNumber);
            case '*' -> result = model.mul(firstNumber, secondNumber);
            case '/' -> result = model.div(firstNumber, secondNumber);
            default ->
                // Вывод сообщения при введении пользователем неучтённой операции/некорректного символа
                    System.out.println("Введена неверная операция");
        }
        // Передача результата вычисления в метод "showOutput"
        view.showOutput(result);
    }
}
