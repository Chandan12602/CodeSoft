import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int totalMarks = 0, numSubjects, marks, i;
        float averagePercentage;
        char grade;
        int gradePoints;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Can you please enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        for (i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            marks = scanner.nextInt();
            totalMarks += marks;
        }

        averagePercentage = (float) totalMarks / numSubjects;

        if (averagePercentage >= 90) {
            grade = 'O';
            gradePoints=10;
        } else if (averagePercentage >= 80) {
            grade = 'A';
            gradePoints=9;
        } else if (averagePercentage >= 70) {
            grade = 'B';
            gradePoints=8;
        } else if (averagePercentage >= 60) {
            grade = 'C';
            gradePoints=7;
        } else if (averagePercentage >= 50) {
            grade = 'D';
            gradePoints=6;
        } else {
            grade = 'F';
            gradePoints=5;
        }

        System.out.println("\nTotal Marks Obtained: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        System.out.println("Grade Points: " + gradePoints);

        scanner.close();
    }
}
