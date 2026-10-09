import java.util.Scanner;

public class MainMark {

    public static void main(String[] args) {

        Scanner sc2 = new Scanner(System.in);

        System.out.println("---EX 2: Student results---");

        StudentMark s1 = new StudentMark("JOHN WINNER", 85, 75, 10);
        s1.displayResult();
        System.out.println(" ");
        StudentMark s2 = new StudentMark("JOE LOSER", 1, 1, 1);
        s2.displayResult();

        System.out.println("enter name /theory mark/practical mark/ assignment mark in order: ");

        StudentMark s3 = new StudentMark(sc2.nextLine(), sc2.nextDouble(), sc2.nextDouble(), sc2.nextDouble());
        s3.displayResult();
    }
}
