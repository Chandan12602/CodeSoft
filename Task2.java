import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int totalMarks = 0, numSubjects, marks, i;
        float averagePercentage;
        char grade;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Can u Please Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        for (i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            marks = scanner.nextInt();
            totalMarks += marks;
    
        averagePercentage = (float)totalMarks / numSubjects;

        if (averagePercentage >= 90) {
            grade = 'O';
        } else if (averagePercentage >= 80) {
            grade = 'A+';
        } else if (averagePercentage >= 75) {
            grade = 'A';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks Obtained: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
