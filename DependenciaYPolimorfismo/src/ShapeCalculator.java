public class ShapeCalculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        ShapeCalculator calculator = new ShapeCalculator();

        // Calculando el área de un círculo
        System.out.println("Área del círculo: " + calculator.calculateArea(circle));

        // Calculando el área de un rectángulo
        System.out.println("Área del rectángulo: " + calculator.calculateArea(rectangle));
    }

    public double calculateArea(Shape shape) {
        return shape.area();
    }
}
