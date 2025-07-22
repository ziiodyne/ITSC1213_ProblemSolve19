import java.awt.Color;

/**
 * The {@code Circle} class represents a circle with a radius and a color.
 * It provides methods to access the radius, color, and calculate the area of the circle.
 * 
 * <p>This class uses {@link java.awt.Color} to store color information.
 * The area is automatically calculated when requested.</p>
 * 
 * @author nanajjar
 * @version Spring 25
 */
public class Circle {  

    /** The radius of the circle. */
    private double radius;

    /** The color of the circle. */
    private Color color;

    /** The area of the circle (calculated internally). */
    private double area;

    /**
     * Default constructor.
     * Initializes the circle with a radius of 1.0 and a default color (RGB: 255, 119, 65).
     */
    public Circle() {
        radius = 1.0;
        this.color = new Color(255, 119, 65);
    }

    /**
     * Constructs a circle with a given radius and color.
     *
     * @param r   the radius of the circle
     * @param clr the color of the circle
     */
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius as a double
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Returns the color of the circle.
     *
     * @return the color as a {@link Color} object
     */
    public Color getColor() {
        return color;
    }

    /**
     * Returns the area of the circle.
     * The area is calculated using the formula πr².
     *
     * @return the area as a double
     */
    public double getArea() {
        calculateArea();
        return area;
    }

    /**
     * Calculates the area of the circle and stores it in the {@code area} field.
     */
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
