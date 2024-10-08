import java.util.Scanner;

public class RectangleInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width;
        double height;


        do {
            System.out.print("Enter the width of the rectangle: ");
            width = scanner.nextDouble();
        } while (width <= 0);


        do {
            System.out.print("Enter the height of the rectangle: ");
            height = scanner.nextDouble();
        } while (height <= 0);


        double area = width * height;
        System.out.println("Area: " + area);

        double perimeter = 2 * (width + height);
        System.out.println("Perimeter: " + perimeter);

        double diagonal = Math.sqrt((width * width) + (height * height));
        System.out.println("Diagonal: " + diagonal);





    }
}
