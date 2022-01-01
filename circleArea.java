import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float r = s.nextFloat();
        float area = (22 * r * r) / 7;
        System.out.println("Area of the circle is: " + area);

        s.close();
    }
}