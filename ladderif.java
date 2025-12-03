import java.util.Scanner;

public class ladderif {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

           if (marks >= 91 && marks <= 100)
         {
            System.out.println("Outstanding (O)");
            }
        else if (marks >= 81 && marks <= 90)
         {
            System.out.println("Distinction");
        }
        else if (marks >= 61 && marks <= 80)
         {
            System.out.println("First Class");
        }
        else if (marks >= 41 && marks <= 60) 
        {
            System.out.println("Second Class");
        }
        else if (marks >= 35 && marks <= 40)
         {
            System.out.println("Pass");
        }
        else if (marks >= 0 && marks <= 34) 
        {
            System.out.println("Fail");
        }
        else 
        {
            System.out.println("Invalid Marks");
        }
    }
}