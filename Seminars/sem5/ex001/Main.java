package sem5.ex001;

public class Main {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcVIew view = new CalcVIew();
        CalcController controller = new CalcController(model, view);
        controller.select();
    }
}
