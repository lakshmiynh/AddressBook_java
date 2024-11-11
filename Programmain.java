import java.util.ArrayList;
import java.util.Scanner;

public class Programmain {
    public static void main(String args[])
    {
        System.out.println("welcome to Address Book");
        Scanner sc=new Scanner(System.in);

        ArrayList<Contacts> list=new ArrayList();
        while(true)
        {
            System.out.println("Enter 1-> adding persons contact.");
            System.out.println("Enter 2-> Edit contact using name.");
            System.out.println("Enter 3-> Delete contact using name.");
            System.out.println("Enter 4-> Display contacts.");
            System.out.println("Enter 5-> Exit.");
            System.out.println("Enter the choice=");
            int choice=sc.nextInt();
            System.out.println();

            switch(choice)
            {
                case 1:
                    System.out.println("Adding contact details..");
                    Contacts newcontacts = Addcontacts.AddingDetails();
                    list.add(newcontacts);
                    break;
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
                    for(Contacts item:list)
                    {
                        item.display();
                    }
                    break;
                default:System.out.println("Invalid input,Enter value between 1 to 4");
                break;
            }
        }
    }
}
