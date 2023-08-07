package hm6;

public class Main {
    public static void main(String[] args) {
        // Создаём "Model", "View" и "Presenter" калькулятора
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcPresenter presenter = new CalcPresenter(model, view);
        presenter.calculate();
    }
}
