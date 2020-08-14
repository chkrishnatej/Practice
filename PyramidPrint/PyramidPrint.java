class PyramidPrint {
    public static void main(String[] args) {
        int n=5;
        printMe(5);
    }

    public static void printMe(int n){
        if (n > 0){
            System.out.print("#");
            printMe(n-1);
        }
    }
}