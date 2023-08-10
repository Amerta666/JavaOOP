package hm7;
public class Main {
    public static void main(String[] args) throws Exception {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcPresenter presenter = new CalcPresenter(model, view);
        presenter.calculate();
    }
}
