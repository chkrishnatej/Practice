class GPAHelper {
    public static float letterToGPA(String grade){
        float gpa;
        switch (grade) {
            case ("A+"):
                gpa = 4.0f;
                break;
            case ("A"):
                gpa = 4.0f;
                break;
            case ("A-"):
                gpa = 3.7f;
                break;
            case ("B+"):
                gpa = 3.3f;
                break;
            case ("B"):
                gpa = 3.0f;
                break;
            case ("B-"):
                gpa = 2.8f;
                break;
            case ("C+"):
                gpa = 2.5f;
                break;
            case ("C"):
                gpa = 2.0f;
                break;
            case ("C-"):
                gpa = 1.8f;
                break;
            case ("D"):
                gpa = 1.5f;
                break;
            case ("F"):
                gpa = 0.0f;
                break;
            default:
                gpa = -1.0f;   
        }

        return gpa;
    }
    public static void main(String args[]) {
        System.out.println("The GPA is: " + letterToGPA("A-"));
    }
}