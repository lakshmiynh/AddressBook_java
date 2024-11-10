import java.util.Scanner;

public class Addcontacts
{
    public static Contacts AddingDetails()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the first name = ");
        String firstname = scanner.nextLine();
        System.out.print("Enter the last name = ");
        String lastname = scanner.nextLine();
        System.out.print("Enter the email = ");
        String email = scanner.nextLine();
        System.out.print("Enter the phone number = ");
        String phonenumber = scanner.nextLine();
        System.out.print("Enter the address = ");
        String address = scanner.nextLine();
        System.out.print("Enter the city = ");
        String city = scanner.nextLine();
        System.out.print("Enter the state = ");
        String state = scanner.nextLine();
        System.out.print("Enter the ZipCode = ");
        String zipcode = scanner.nextLine();

        return new Contacts(firstname, lastname, email, phonenumber, address, city, state, zipcode);
    }
}
