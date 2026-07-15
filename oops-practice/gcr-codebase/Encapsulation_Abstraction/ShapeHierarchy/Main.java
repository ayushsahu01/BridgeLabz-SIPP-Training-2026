public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(6, 4),
                new Triangle(3, 4, 5)
        };

        System.out.println("==============================================");
        System.out.printf("%-12s %-15s %-15s%n",
                "Shape", "Area", "Perimeter");
        System.out.println("==============================================");

        for (Shape s : shapes) {
            System.out.printf("%-12s %-15.2f %-15.2f%n",
                    s.getShapeName(),
                    s.area(),
                    s.perimeter());
        }

        System.out.println("==============================================");
    }
}