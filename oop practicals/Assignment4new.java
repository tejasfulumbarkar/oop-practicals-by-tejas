import java .util.Scanner;

abstract class Shape {
 double dimention1;
 double dimention2;

   /*concreate method */
public void setValues(double dim1,double dim2){
    this.dimention1=dim1;
    this.dimention2=dim2;
}
/*abstrct method this should not have a body or we can say implementation */
 public abstract double computeArea();
    
 
 
}

class Triangle extends Shape {
    public double computeArea(){
      double  area_triangle= 0.5*dimention1*dimention2;
      return area_triangle;
    }
    
}
class Rectangle extends Shape {
    public double computeArea(){
      double  area_rectangle= dimention1*dimention2;
      return area_rectangle;
    }
      
    /* body OF compute area  */
}




/**
 * Learn_aabstract
 */
public class Assignment4new {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double dimm1,dimm2;
        System.out.println("Enter number 1 for triangle area and number 2 for rectangle area ");
         int choice = s.nextInt();


         

         if ( choice==1){


          System.out.println(" enter the base and height of triangle separated by space");
          dimm1=s.nextDouble();
          dimm2=s.nextDouble();

            Triangle t = new Triangle();
            t.setValues(dimm1,dimm2);
           System.out.println("area of traingle:-"+ t.computeArea());
         }
        
         if ( choice==2){
            System.out.println(" enter the length and breadth of Rectangle separated by space");
             dimm1=s.nextDouble();
             dimm2=s.nextDouble();

            Rectangle rectangle = new Rectangle();
            rectangle.setValues(dimm1,dimm2);
            rectangle.computeArea();
         }
        
    }
}