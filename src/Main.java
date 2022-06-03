public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Blue");
        circle.draw();
        circle.fill();

        System.out.println("-------------------");

        Rectangle rectangle = new Rectangle("Black");
        rectangle.draw();
        rectangle.fill();

        Rectangle rectangle1 = new Rectangle();
    }
}
