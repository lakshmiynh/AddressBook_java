import java.util.ArrayList;
import java.util.Iterator;
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

        Contacts newcontacts=new Contacts(firstname, lastname, email, phonenumber, address, city, state, zipcode);
        return newcontacts;
    }

    public static void EditingContacts(ArrayList<Contacts> list)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Editing Contacts");
        System.out.println("Enter the First Name: ");
        String firstname = sc.nextLine();
        System.out.println("Enter the Last Name: ");
        String lastname = sc.nextLine();

        if (firstname.isEmpty() || lastname.isEmpty())
        {
            System.out.println("Name cannot be null");
            return;
        }
        for (Contacts item : list)
        {
            if (item.FirstName.equals(firstname) && item.LastName.equals(lastname))
            {
                while (true)
                {
                    System.out.println("\nEnter 1 -> edit First Name");
                    System.out.println("Enter 2 -> edit Last Name");
                    System.out.println("Enter 3 -> edit Email");
                    System.out.println("Enter 4 -> edit Phone Number");
                    System.out.println("Enter 5 -> edit Address");
                    System.out.println("Enter 6 -> edit City");
                    System.out.println("Enter 7 -> edit State");
                    System.out.println("Enter 8 -> edit Zip Code");
                    System.out.println("Enter 9 -> exit editing\n");

                    System.out.print("Enter the choice = ");
                    int choice = sc.nextInt();
                    sc.nextLine(); // Clear the newline

                    switch (choice)
                    {
                        case 1:
                            System.out.print("\nEdit the First name = ");
                            item.FirstName = sc.nextLine();
                            break;
                        case 2:
                            System.out.print("\nEdit the Last name = ");
                            item.LastName = sc.nextLine();
                            break;
                        case 3:
                            System.out.print("\nEdit the Email = ");
                            item.Email = sc.nextLine();
                            break;
                        case 4:
                            System.out.print("\nEdit the Phone Number = ");
                            item.PhoneNumber = sc.nextLine();
                            break;
                        case 5:
                            System.out.print("\nEdit the Address = ");
                            item.Address = sc.nextLine();
                            break;
                        case 6:
                            System.out.print("\nEdit the City = ");
                            item.City = sc.nextLine();
                            break;
                        case 7:
                            System.out.print("\nEdit the State = ");
                            item.State = sc.nextLine();
                            break;
                        case 8:
                            System.out.print("\nEdit the Zip Code = ");
                            item.ZipCode = sc.nextLine();
                            break;
                        case 9:
                            return;
                        default:
                            System.out.println("Invalid input!");
                            break;
                    }
                }
            }
        }
    }
    public static void deleteContacts(ArrayList<Contacts> list)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deleting Contacts");
        System.out.print("Enter the First Name: ");
        String firstname = sc.nextLine();
        System.out.print("Enter the Last Name: ");
        String lastname = sc.nextLine();

        if (firstname.isEmpty() || lastname.isEmpty()) {
            System.out.println("Name cannot be null");
            return;
        }

        boolean contactFound = false;
        Iterator<Contacts> iterator = list.iterator();
        while (iterator.hasNext()) {
            Contacts item = iterator.next();
            if (item.FirstName.equals(firstname) && item.LastName.equals(lastname)) {
                System.out.println("Confirm deletion!");
                System.out.print("Press Y or y for YES: ");
                char decision = sc.next().charAt(0);

                if (decision == 'Y' || decision == 'y') {
                    iterator.remove();  // Safe way to remove during iteration
                    System.out.println("Successfully deleted!");
                } else {
                    System.out.println("Deletion canceled.");
                }
                contactFound = true;
                break;
            }
        }
        if (!contactFound) {
            System.out.println("Entered name is not in the Address Book!");
        }
    }

}
