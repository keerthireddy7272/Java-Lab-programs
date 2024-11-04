# Java-Lab-programs
import java.util.Scanner;
import java.lang.Math;

class Quadratic {
int a, b, c;
double r1, r2, d;

void getd() {
while (a == 0) {
System.out.println("The given equation is not a quadratic equation");
System.out.println("Enter a:");
Scanner scanner = new Scanner(System.in);
a = scanner.nextInt();
}
d = (b * b) - (4 * a * c);

if (d == 0) {
r1 = (-b) / (2.0 * a);
System.out.println("Roots are real and equal, the two roots are: " + r1);
}

else if (d > 0) {
r1 = ((-b) + (Math.sqrt(d))) / (2.0 * a);
r2 = ((-b) - (Math.sqrt(d))) / (2.0 * a);
System.out.println("Roots are real and distinct");
System.out.println("Root 1 is: " + r1);
System.out.println("Root 2 is: " + r2);
}
else if(d<0){
r1 = (-b) / (2.0 * a);
r2 = Math.sqrt(-d) / (2.0 * a);
System.out.println("Roots are imaginary");
System.out.println("Root 1 is: " + r1 + " + " + r2 + "i");
System.out.println("Root 2 is: " + r1 + " - " + r2 + "i");
}
}
}
public class QuadraticSolve {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
Quadratic obj = new Quadratic();
System.out.println("Enter a, b, and c: ");
obj.a = scanner.nextInt();
obj.b = scanner.nextInt();
obj.c = scanner.nextInt();
obj.getd();
System.out.println("Name: K. Keerthi Reddy");
System.out.println("USN: 1BM23CS137");
scanner.close();
}
}
a = scanner.nextInt();
}
d = (b * b) - (4 * a * c);

if (d == 0) {
r1 = (-b) / (2.0 * a);
System.out.println("Roots are real and equal, the two roots are: " + r1);
}

else if (d > 0) {
r1 = ((-b) + (Math.sqrt(d))) / (2.0 * a);
 r2 = ((-b) - (Math.sqrt(d))) / (2.0 * a);
System.out.println("Roots are real and distinct");
System.out.println("Root 1 is: " + r1);
System.out.println("Root 2 is: " + r2);
}
else if(d<0){
r1 = (-b) / (2.0 * a);
r2 = Math.sqrt(-d) / (2.0 * a);
System.out.println("Roots are imaginary");
System.out.println("Root 1 is: " + r1 + " + " + r2 + "i");
System.out.println("Root 2 is: " + r1 + " - " + r2 + "i");
}
}
}
public class QuadraticSolve {
public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
Quadratic obj = new Quadratic();
System.out.println("Enter a, b, and c: ");
obj.a = scanner.nextInt();
obj.b = scanner.nextInt();
obj.c = scanner.nextInt();
obj.getd();
System.out.println("Name: K. Keerthi Reddy");
System.out.println("USN: 1BM23CS137");
scanner.close();
}
}
