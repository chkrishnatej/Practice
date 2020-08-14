class CheckMaxOfArray {
    public static void main(String args[]) {
        int[] arr = {32, 23, 8, 222, 90, 89, 45, 32, 31};

        int maxVal = Integer.MIN_VALUE;
        for(int element: arr){
            maxVal = Math.max(maxVal, element);
        }

        System.out.println("The max value of the array is " + maxVal);
    }
}