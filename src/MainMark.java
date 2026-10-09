import java.util.Scanner;

public class MainMark {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("---EX 2: Student results---");
        System.out.println("enter name /theory mark/practical mark/ assignment mark in order: ");

        StudentMark s1 = new StudentMark(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        s1.displayResult();

        System.out.println("enter name /theory mark/practical mark/ assignment mark in order: ");

        StudentMark s2 = new StudentMark(sc2.nextLine(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt());
        s2.displayResult();
    }
}
