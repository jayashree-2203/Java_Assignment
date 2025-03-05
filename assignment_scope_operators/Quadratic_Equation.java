package assignment_scope_operators;

import java.util.Scanner;

public class Quadratic_Equation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double root = b * b - 4 * a * c;
        
        if (root > 0) {
            double root1 = (-b + Math.sqrt(root)) / (2 * a);
            double root2 = (-b - Math.sqrt(root)) / (2 * a);
            System.out.println("Roots are real and distinct: " + root1 + " and " + root2);
        } else if (root == 0) {
      
            System.out.println("Root is real and equal: " + -b / (2 * a));
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-root) / (2 * a);
            System.out.println("Roots are complex: " + realPart + " ± " + imaginaryPart + "i");
        }
	}
}
