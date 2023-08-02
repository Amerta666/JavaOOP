package sem5.ex001;

public class CalcController {
    private CalcModel model = new CalcModel();
    private CalcVIew view = new CalcVIew();

    public CalcController(CalcModel model, CalcVIew view) {
        this.model = model;
        this.view = view;
    }

    public void select() {
        int num1 = view.userInput();
        int num2 = view.userInput();
        char ch = view.chooseOperation();
        int result = 0;
        switch (ch) {
            case '+': result = model.sum(num1, num2);
                break;
            case '-': result = model.sub(num1, num2);
                break;
            case '*': result = model.mul(num1, num2);
                break;
            case '/': result = model.div(num1, num2);
                break;
            default:
                System.out.println("Введена неверная операция");
                break;
        }
        view.showOutput(result);
    }
}
