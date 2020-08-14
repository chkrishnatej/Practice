class Conditionals {
    public static void main(String args[]) {
        byte choice = 43;

        if (choice < 40) {
            System.out.println("It is my choice");
        }
        else if (41 < choice && choice < 45) {
            System.out.println("It is not my choice");
        }
        else {
            System.out.println("It is again my choice");
        }
    }
}