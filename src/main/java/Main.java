import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value a : ");
        double a=input.nextDouble();
        System.out.println("Enter value b : ");
        double b=input.nextDouble();
        System.out.println("Enter value c : ");
        double c=input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.check();

    }
}
