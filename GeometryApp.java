import java.util.Scanner;

public class GeometryApp  {

//A protected inner class

protected  class SquareCalculator  {
   private double area;
   //Constructor that calculates square side from circle circumference  
   public void calculateFromcircumference(double circumference)  {

   // 1.Find radius: r = C/(2*PI)
   double radius = circumference / (2 * Math.PI);
 
   // 2.Find circle area: A = PI * r^2
   this.area = Math.PI * Math.pow(radius,2);

   // 3.Find square side: side = sqrt(area)
  double side = Math.sqrt(this.area);

System.out.println("---Results--- "); 
System.out.printf("Circle/Square Area: %.2f\n",this.area); 
System.out.printf("side of the Square: %.2f\n",side); 
System.out.printf("Perimeter of Square: %.2f\n",4 * side); 
 
  }

}

public static void main(String[] args)   {
    Scanner scanner = new Scanner(System.in);
    //Creating an instance of the outer class
    GeometryApp app = new GeometryApp();
    //Creating an instance of the Protected inner class
    GeometryApp.SquareCalculator calc = app.new SquareCalculator();
    System.out.print("Enter the circumference of a circle:");
    double circ = scanner.nextDouble();
    calc.calculateFromcircumference(circ);

    scanner.close();

  } 

}

  
 