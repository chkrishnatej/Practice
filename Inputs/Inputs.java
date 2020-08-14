import java.util.Scanner;

class Inputs {
    public static void main(String args[]) {
        Scanner scannerOne = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scannerOne.nextLine();
        System.out.println("Your name is: " + name);
    }
}