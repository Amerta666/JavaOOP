package hm5;

public class CalcPresenter {
    private CalcModel model = new CalcModel();
    private CalcView view = new CalcView();

    public CalcPresenter(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }

    public void calculate() {
        double firstNumber = view.getFirstNumber();
        double secondNumber = view.getSecondNumber();
        char ch = view.selectOperation();
        double result = 0;
        switch (ch) {
            case '+': result = model.sum(firstNumber, secondNumber);
                break;
            case '-': result = model.sub(firstNumber, secondNumber);
                break;
            case '*': result = model.mul(firstNumber, secondNumber);
                break;
            case '/': result = model.div(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Введена неверная операция");
                break;
        }
        view.showOutput(result);
    }
}
