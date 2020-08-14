// class CheckSum {
//     public int one;
//     public int two;
    
//     public CheckSum(int one, int two) {
//         this.one = one;
//         this.two = two;
//     }

//     public static int checkSum(int one, int two) {
//         int check = 0;
//         int sum = one + two;

//         if (sum < 100) check = 0;
//         else if (sum > 100) check = 1;
//         else if (sum == 100) check = 2;

//         return check;
//     }
// }

class ChallengeOne {
    public static int checkSum(int one, int two) {
        int check = 0;
        int sum = one + two;

        if (sum < 100) check = 0;
        else if (sum > 100) check = 1;
        else if (sum == 100) check = 2;

        return check;
    }
    
    public static void main(String args[]) {
        System.out.println("The check sum value is " + checkSum(24,343));
    }
}