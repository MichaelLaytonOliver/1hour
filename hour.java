import java.util.Scanner;


public class hour {

public static void main(String[] args) {
    int Number1;
    int Number2;
    int plus;
    int minus;
    Scanner kbd = new Scanner (System.in);

    System.out.println("Enter the first number: ");
     Number1 = kbd.nextInt();

    System.out.println("Enter the first number: ");
     Number2 = kbd.nextInt();
    
    kbd.close();

    plus = Number1 + Number2;
    minus = Number1 - Number2;

    System.out.println("Addition Result: " + plus);
    System.out.println("Subtraction Result: " + minus);
}

}

