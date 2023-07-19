package Sem_1.Exx001;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4.0, 10.1,"green");
        Triangle t2 = new Triangle(3.0, 14.1, "wrate");
        TwoShapes t3 = new TwoShapes(4.2, 8.9);
        Triangle t4 = new Triangle(5.1, 8.6);
        TwoShapes t5 = new TwoShapes();

//        t1.setHeight(4.0);
//        t1.setWidth(10.1);
//        t1.style = "green";

//        t2.setHeight(3.0);
//        t2.setWidth(14.1);
//        t2.style = "wrate";

        System.out.println("Информация о Т1");
        t1.showStyle();
        t1.ShowDim();
        System.out.println("Площадь - " + t1.area());
        System.out.println();
        System.out.println("Информация о Т2");
        t2.showStyle();
        t2.ShowDim();
        System.out.println("Площадь - " + t2.area());
    }

}
