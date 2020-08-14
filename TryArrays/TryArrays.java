class TryArrays {
    public static void main(String args[]) {
        String[] myStringArrays = {"Alpha", "Beta", "Gamme", "Theta"};
        
        // If index is not needed in the operation, for-each loop can be used
        System.out.println("Printing with for-each loop");
        for(String element: myStringArrays){
            System.out.println("The array element is " + element);
        }
        
        // If index is needed in the operation, normal for loop with index can be used
        System.out.println("Printing with for loop");
        for(int i=0; i<myStringArrays.length; i++){
            System.out.println("The array element is " + myStringArrays[i]);
        }
    }
}
