class MultiplicationTable {
    public static void main(String args[]) {
        String answer = "";
        int i = 1, num = 5;
        while (i <= 10) {
            answer += String.valueOf(i+num) + " ";
            i++;
        }
        System.out.println(answer);
    }
}