// Exercise 2: StudentMark class
public class StudentMark {

    private String fullName;
    private double theoryMark;
    private double practicalMark;
    private double assignmentMark;

  
    public StudentMark(String fullName, double theoryMark, double practicalMark, double assignmentMark) {
        this.fullName = fullName;
        this.theoryMark = theoryMark;
        this.practicalMark = practicalMark;
        this.assignmentMark = assignmentMark;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getTheoryMark() {
        return theoryMark;
    }

    public void setTheoryMark(double theoryMark) {
        this.theoryMark = theoryMark;
    }

    public double getPracticalMark() {
        return practicalMark;
    }

    public void setPracticalMark(double practicalMark) {
        this.practicalMark = practicalMark;
    }

    public double getAssignmentMark() {
        return assignmentMark;
    }

    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    public boolean checkPass() {
        if (theoryMark < 40) {
            return false;
        } else if (practicalMark < 40) {
            return false;
        } else if (assignmentMark < 4.0) {
            return false;
        } else {
            return true;
        }
    }

    
    public void displayResult() {
        System.out.println("=========================================" );
        System.out.println("I Name: " + fullName+"                       I");
        System.out.println("I Theory mark: " + theoryMark+"              I");
        System.out.println("I Practical mark: " + practicalMark+"        I");
        System.out.println("I Assignment mark: " + assignmentMark+"      I");
        System.out.println("=========================================" );


        if (checkPass() == true) {
            System.out.println("Result: YOU PASSED");
        } else {
            System.out.println("Result: YOU FAILED");
        }
       System.out.println("=========================================" );
    }
}
