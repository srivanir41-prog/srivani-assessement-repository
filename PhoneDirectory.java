import java.util.HashMap;
import java.util.Scanner;

public class PhoneDirectory
{
    public static void main(String[] args)
    {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n1. Find number");
            System.out.println("2. Add number");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1)
            {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                if(phoneBook.containsKey(name))
                {
                    System.out.println("Phone number: " + phoneBook.get(name));
                }
                else
                {
                    System.out.println("Name not found in phone book.");
                }
            }
            else if(choice == 2)
            {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter phone number: ");
                String number = sc.nextLine();

                phoneBook.put(name, number);
                System.out.println("Number added successfully.");
            }
            else if(choice == 3)
            {
                System.out.println("Exiting...");
                break;
            }
            else
            {
                System.out.println("Invalid choice!");
            }
        }
    }
}
