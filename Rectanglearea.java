public class Rectanglearea {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Area: " + rect.getArea());
        
        rect.setLength(10);
        System.out.println("New Area: " + rect.getArea());
    }
}
