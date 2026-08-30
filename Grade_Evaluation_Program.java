import java.util.Scanner;

class GradeEvaluation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take marks as input
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        // Grade evaluation
        if (marks >= 80 && marks <= 100) {
            System.out.println("Grade: A");
        }
        else if (marks >= 60 && marks < 80) {
            System.out.println("Grade: B");
        }
        else if (marks >= 40 && marks < 60) {
            System.out.println("Grade: C");
        }
        else if (marks >= 0 && marks < 40) {
            System.out.println("Grade: Fail");
        }
        else {
            System.out.println("Invalid marks!");
        }

        sc.close();
    }
}
