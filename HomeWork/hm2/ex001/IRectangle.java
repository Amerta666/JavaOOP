package hm2.ex001;

public interface IRectangle extends IConst {


    default double Width() {
        return 10;
    }

    default double Height() {
        return 4;
    }

    double calculateArea();

    double calculatePerimeter();

}