public class Rectangle {
    private double length; // Private 
    private double width;  // Private

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter for area
    public double getArea() {
        return length * width;
    }

    // Setter for length
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length must be positive.");
        }
    }
}


