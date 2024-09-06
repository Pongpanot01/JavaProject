public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle("Red", 12);
        System.out.println("Color: " + circle.getColor());
        System.out.println("Radius: "+ circle.getRadius());
        System.out.println("Area: "+ circle.area());

        Rectangle rectangle = new Rectangle("Grey", 12, 15);
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: "+ rectangle.area());
    }
}
