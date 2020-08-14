class Maths {
    public static void main(String args[]) {
        // Implement Square
        short square = 25;
        System.out.println("The square of " + square + " is: " + Math.pow(square, 2));
        
        // Implement Cube
        short cube = 10;
        System.out.println("The cube of " + cube + " is " + Math.pow(cube, 3));
        
        // Implement Square Root
        short squareRoot = 625;
        System.out.println("The square root of " + squareRoot + " is " + Math.sqrt(squareRoot));
        
        // Implement Cube Root
        short cubeRoot = 125;
        System.out.println("The cube root of " + cubeRoot + " is " + Math.cbrt(cubeRoot));

        // Nth Power
        short nth = 3;
        System.out.println("The 5th power of " + nth + " is " + Math.pow(3, 5));

        // Nth Root
        // Need to do

        // Natural Logarithm
        System.out.println("The natural log of 2 is: " + Math.log(2));

        // Log10
        System.out.println("The log10 of 100 is: " + Math.log10(10000000));

        // Absolute values
        byte absValue = -90;
        System.out.println("The absolute value of: " + absValue + " is " + Math.abs(absValue));

        // Max value
        System.out.println("Maximum of 4 and 5 is: " + Math.max(4, 5));

        // Min value
        System.out.println("Minimum of 90 and 23 is: " + Math.min(90, 23));
    }
}