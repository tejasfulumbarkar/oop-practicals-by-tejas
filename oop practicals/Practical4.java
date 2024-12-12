import java.util.Scanner;

abstract class Shape {
    protected double dim1;
    protected double dim2;

    // Method to set values
    void setvalues(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2; // Fix: Correctly assign dim2
    }

    // Abstract method to compute area
    abstract double computeArea();
}

class Triangle extends Shape {
    @Override
    double computeArea() {
        double areat= 0.5 * dim1 * dim2;
        return areat;
    }
}

class Rectangle extends Shape {
    @Override
    double computeArea() {

        double arrrr= dim1 * dim2;
        return arrrr;
    }
}

 class Practical4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("<<< Enter 1 to calculate the area of a Triangle >>>");
        System.out.println("<<< Enter 2 to calculate the area of a Rectangle >>>");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the base and height of the triangle: ");
            double base = scanner.nextDouble();
            double height = scanner.nextDouble();
            
            Triangle triangle = new Triangle();
            triangle.setvalues(base, height); // Correctly use inherited method
            System.out.println("Area of the Triangle: " + triangle.computeArea());

        } else if (choice == 2) {
            System.out.print("Enter the length and breadth of the rectangle: ");
            double length = scanner.nextDouble();
            double breadth = scanner.nextDouble();
            Rectangle rectangle = new Rectangle();

            rectangle.setvalues(length, breadth); // Correctly use inherited method
            System.out.println("Area of the Rectangle: " + rectangle.computeArea());
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        scanner.close();
    }
}
