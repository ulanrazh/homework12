package peaksoft;

public class Triangle {
    double a;
    double b;
    double c;

    public void calculateSemiPerimeter() {
        double p = (a + b + c)/2;
        System.out.println("Semi Perimeter = " + p);
    }
    public void calculateAreaOfTriangle() {
        double p = (a + b + c)/2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Area of Triangle = " + s + "(m2)");
    }
}
