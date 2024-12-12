import java.util.Scanner;

class Complex {
    double real;
    double img;

    // Default constructor
    public Complex() {
        real = 0;
        img = 0;
    }

    // Parameterized constructor
    public Complex(double r, double i) {
        this.real = r;
        this.img = i; 
    }
}

// Method to add two complex numbers



// Create a separate class for main method
public class Mainn1 {  // Class name should start with an uppercase letter
    
    static Complex addition(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.img + c2.img);
    }

    static Complex substraction(Complex c1, Complex c2){

        return new Complex(c1.real-c2.real,c1.img-c2.img);
    }

    public static Complex multiply(Complex c1, Complex c2) {
        double realnum = c1.real * c2.real - c1.img * c2.img;
        double imgnum = c1.real * c2.img + c1.img * c2.real;
        return new Complex(realnum, imgnum);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
   
        System.out.println("Enter real part of num1:");
        double real_num1 = s.nextDouble();

        System.out.println("Enter imaginary part of num1:");
        double img_num1 = s.nextDouble();

        System.out.println("Enter real part of num2:");
        double real_num2 = s.nextDouble();

        System.out.println("Enter imaginary part of num2:");
        double img_num2 = s.nextDouble();

        Complex c1 = new Complex(real_num1, img_num1);
        Complex c2 = new Complex(real_num2, img_num2);

        // Add two complex numbers
        Complex add = addition(c1, c2);
        Complex sub= substraction(c1, c2);
        Complex mul =(multiply(c1, c2));
        // To implement subtraction, multiplication, and division, we need to define those methods
        // For now, let's just focus on the addition part and print the result
        System.out.println(
            "Multiplication of two complex numbers: " + mul.real +
            (mul.img < 0 ? " - " : " + ") + Math.abs(mul.img) + "i"
        );
        System.out.println("Addition of two complex numbers: " + add.real + " + " + add.img + "i");
        System.out.println("substraction of two complex numbers:- " +sub.real + "+" +sub.img +"i");
        s.close();  // It's good practice to close the scanner
    }
}
