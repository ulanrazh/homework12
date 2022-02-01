package peaksoft;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 4;
        triangle.b = 5;
        triangle.c = 7;

        triangle.calculateSemiPerimeter();
        triangle.calculateAreaOfTriangle();

    }
}
