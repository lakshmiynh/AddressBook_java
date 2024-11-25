import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Programmain
{
    public static void main(String args[]) throws  InvalidFormat
    {
        System.out.println("welcome to Address Book");
        Scanner sc=new Scanner(System.in);

        HashSet<Contacts> list=new HashSet<>();
        String fileName =  "C:\\Users\\laksh\\OneDrive\\Desktop\\Contactslist3.txt";
        while(true)
        {
            System.out.println("Enter 1-> adding persons contact.");
            System.out.println("Enter 2-> Edit contact using name.");
            System.out.println("Enter 3-> Delete contact using name.");
            System.out.println("Enter 4-> Display contacts.");
            System.out.println("Enter 5-> To search the person using State");
            System.out.println("Enter 6-> To sort the Contacts by person name");
            System.out.println("Enter 7-> To sort the Contacts by City");
            System.out.println("Enter 8-> Exit.");
            System.out.println("Enter the choice=");
            int choice=sc.nextInt();
            System.out.println();

            switch(choice)
            {
                case 1:
                    System.out.println("Adding contact details..");
                    Contacts newcontacts = Addcontacts.AddingDetails();
                    try {
                        if (newcontacts != null)
                        {
                            if (Addcontacts.isDuplicateContact(list, newcontacts.FirstName, newcontacts.LastName))
                            {
                                System.out.println("This contact already exists. Please enter unique names.");
                            } else
                            {
                                list.add(newcontacts);
                                System.out.println("Contact added successfully!");
                                Addcontacts.writeToFile(fileName, newcontacts);
                            }
                        }
                        break;
                    }
                    catch (Exception ex)
                    {
                        System.out.println("Please enter the valid formate");
                    }
                case 2:
                    if(list.stream().count()>0)
                    {
                        Addcontacts.EditingContacts(list);
                    }
                    else
                    {
                        System.out.println("Address book is empty !,please add contacts !");
                        break;
                    }
                    break;
                case 3:
                    if(list.stream().count()>0)
                    {
                        Addcontacts.deleteContacts(list);
                    }
                    else
                    {
                        System.out.println("Address book is empty !,please add contacts !");
                        break;
                    }
                    break;
                case 4:
                    System.out.println("Display the Contacts");
                        Addcontacts.DisplayContacts(list);
                    break;
                case 5:
                    System.out.println("Search the Person");
                    Addcontacts.searchPersonbyState(list);
                    break;
                case 6:
                    System.out.println("Sorting contacts by name...");
                    Addcontacts.SortContactsByName(list);
                    break;
                case 7:
                    System.out.println("Sorting contacts by city...");
                    Addcontacts.SortContactsByCity(list);
                    break;
                default:System.out.println("Invalid input,Enter value between 1 to 8");
                break;
            }
        }
    }
}
