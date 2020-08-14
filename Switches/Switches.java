class Switches {
    public static void main(String args[]) {
        int temp, x = 23;

        switch(x) {
            case 10: temp = x+10; break;
            case 20: temp = x+20; break;
            case 30: temp = x*100; break;
            default: temp = 12; break;
        }

        System.out.println("The value of temp is: " + temp);
    }
}