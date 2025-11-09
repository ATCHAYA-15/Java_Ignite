import java.util.Scanner;
class GradeCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Enter marks for subject " + (i+1) + ": ");
            arr[i] = scan.nextInt();
            total = total + arr[i];
        }
        int average = total / n;
        char grade;

        if(average > 90) grade = 'A';
        else if(average > 80) grade = 'B';
        else if(average > 70) grade = 'C';
        else if(average > 60) grade = 'D';
        else grade = 'F';

        System.out.println("\n RESULT ");
        System.out.println("Total Marks   : " + total);
        System.out.println("Average       : " + average);
        System.out.println("Grade         : " + grade);
    }
}