class SumDigits {
    public static int sumOfDig(int var) {
        int result = 0;
        while (var > 0){
            result = result+var %10;
            var /=10;
        }
        
        return result;
    }
    public static void main(String args[]) {
        System.out.println(sumOfDig(2345));
    
    }
}