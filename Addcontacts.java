import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Addcontacts {

    public static Contacts AddingDetails() throws InvalidFormat
    {
        PatternRegex validator = new PatternRegex();
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.print("\nEnter the first name : ");
            String firstname = scanner.nextLine();
            if (!(validator.isName(firstname))) throw new InvalidFormat("please valid Firstname ex:Jhon");
            System.out.print("Enter the last name : ");
            String lastname = scanner.nextLine();
            if (!(validator.isName(lastname))) throw new InvalidFormat("please valid Lastname ex:Jhon");
            System.out.print("Enter the email : ");
            String email = scanner.nextLine();
            if (!(validator.isEmail(email))) throw new InvalidFormat("please valid Email ex:jhonmery@gmail.com");
            System.out.print("Enter the phone number : ");
            String phonenumber = scanner.nextLine();
            if (!(validator.isNumber(phonenumber))) throw new InvalidFormat("please valid Phone Number ex:91 XXXXXXXXXX");
            System.out.print("Enter the address : ");
            String address = scanner.nextLine();
            if (!(validator.isAddress(address))) throw new InvalidFormat("please valid Address ex:street,city");
            System.out.print("Enter the city : ");
            String city = scanner.nextLine();
            if (!(validator.isAddress(city))) throw new InvalidFormat("please valid City ex:City");
            System.out.print("Enter the state : ");
            String state = scanner.nextLine();
            if (!(validator.isAddress(state))) throw new InvalidFormat("please valid State ex:State");
            System.out.print("Enter the ZipCode : ");
            String zipcode = scanner.nextLine();
            if (!(validator.isZipCode(zipcode))) throw new InvalidFormat("please valid ZipCode ex:XXXXXX");

            Contacts newcontacts = new Contacts(firstname, lastname, email, phonenumber, address, city, state, zipcode);
            return newcontacts;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public static void EditingContacts(HashSet<Contacts> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Editing Contacts");
        System.out.println("Enter the First Name: ");
        String firstname = sc.nextLine();
        System.out.println("Enter the Last Name: ");
        String lastname = sc.nextLine();

        if (firstname.isEmpty() || lastname.isEmpty()) {
            System.out.println("Name cannot be null");
            return;
        }
        for (Contacts item : list) {
            if (item.FirstName.equals(firstname) && item.LastName.equals(lastname)) {
                while (true) {
                    System.out.println("\nEnter 1 -> edit First Name");
                    System.out.println("Enter 2 -> edit Last Name");
                    System.out.println("Enter 3 -> edit Email");
                    System.out.println("Enter 4 -> edit Phone Number");
                    System.out.println("Enter 5 -> edit Address");
                    System.out.println("Enter 6 -> edit City");
                    System.out.println("Enter 7 -> edit State");
                    System.out.println("Enter 8 -> edit Zip Code");
                    System.out.println("Enter 9 -> exit editing\n");
                    System.out.print("Enter the choice : ");
                    int choice = sc.nextInt();
                    sc.nextLine(); // Clear the newline

                    switch (choice) {
                        case 1:
                            System.out.print("\nEdit the First name : ");
                            item.FirstName = sc.nextLine();
                            break;
                        case 2:
                            System.out.print("\nEdit the Last name : ");
                            item.LastName = sc.nextLine();
                            break;
                        case 3:
                            System.out.print("\nEdit the Email : ");
                            item.Email = sc.nextLine();
                            break;
                        case 4:
                            System.out.print("\nEdit the Phone Number : ");
                            item.PhoneNumber = sc.nextLine();
                            break;
                        case 5:
                            System.out.print("\nEdit the Address : ");
                            item.Address = sc.nextLine();
                            break;
                        case 6:
                            System.out.print("\nEdit the City : ");
                            item.City = sc.nextLine();
                            break;
                        case 7:
                            System.out.print("\nEdit the State : ");
                            item.State = sc.nextLine();
                            break;
                        case 8:
                            System.out.print("\nEdit the Zip Code : ");
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

    public static void deleteContacts(HashSet<Contacts> list)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deleting Contacts");
        System.out.print("Enter the First Name: ");
        String firstname = sc.nextLine();
        System.out.print("Enter the Last Name: ");
        String lastname = sc.nextLine();

        if (firstname.isEmpty() || lastname.isEmpty())
        {
            System.out.println("Name cannot be null");
            return;
        }
        boolean contactFound = false;
        Iterator<Contacts> iterator = list.iterator();
        while (iterator.hasNext()) {
            Contacts item = iterator.next();
            if (item.FirstName.equals(firstname) && item.LastName.equals(lastname))
            {
                System.out.println("Confirm deletion!");
                System.out.print("Press Y or y for YES: ");
                char decision = sc.next().charAt(0);

                if (decision == 'Y' || decision == 'y')
                {
                    iterator.remove();  // Safe way to remove during iteration
                    System.out.println("Successfully deleted!");
                } else
                {
                    System.out.println("Deletion canceled.");
                }
                contactFound = true;
                break;
            }
        }
        if (!contactFound)
        {
            System.out.println("Entered name is not in the Address Book!");
        }
    }

    public static boolean isDuplicateContact(HashSet<Contacts> list, String firstname, String lastname)
    {
        for (Contacts contact : list)
        {
            if (contact.FirstName.equals(firstname) && contact.LastName.equals(lastname))
            {
                return true; // Duplicate found
            }
        }
        return false; // No duplicate found
    }
}



