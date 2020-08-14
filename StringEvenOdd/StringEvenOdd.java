class StringEvenOdd {
    public static String evenOdd(String inputStr) {
        if ((inputStr.length()%2) == 0) return inputStr.toUpperCase();
        else return inputStr.toLowerCase();
    }
    public static void main(String args[]) {
        System.out.println(evenOdd("krishnad"));
    }
}