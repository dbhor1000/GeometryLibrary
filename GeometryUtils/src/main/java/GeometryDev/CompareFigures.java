package GeometryDev;

public class CompareFigures {

    public static double[] compareCirceAndTriangle(Circle circle, Triangle triangle) {

        double areaDifference = circle.calculateArea() - triangle.calculateArea();
        double perimeterDifference = circle.calculatePerimeter() - triangle.calculatePerimeter();

        System.out.println("Площадь круга минус площадь треугольника: " + areaDifference +
                " Пермиетр круга минус периметр треугольника: " + perimeterDifference);

        return new double[]{areaDifference, perimeterDifference};
    }

    public static double[] compareCirceAndRectangle(Circle circle, Rectangle rectangle) {

        double areaDifference = circle.calculateArea() - rectangle.calculateArea();
        double perimeterDifference = circle.calculatePerimeter() - rectangle.calculatePerimeter();

        System.out.println("Площадь круга минус площадь четырёхугольника: " + areaDifference +
                " Пермиетр круга минус периметр четырёхуголника: " + perimeterDifference);

        return new double[]{areaDifference, perimeterDifference};
    }

    public static double[] compareTriangleAndRectangle(Triangle triangle, Rectangle rectangle) {

        double areaDifference = triangle.calculateArea() - rectangle.calculateArea();
        double perimeterDifference = triangle.calculatePerimeter() - rectangle.calculatePerimeter();

        System.out.println("Площадь треугольника минус площадь четырёхугольника: " + areaDifference +
                " Пермиетр треугольника минус периметр четырёхуголника: " + perimeterDifference);

        return new double[]{areaDifference, perimeterDifference};
    }

}
