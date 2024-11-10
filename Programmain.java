public class Programmain {
    public static void main(String args[])
    {
        System.out.println("welcome to Address Book");
        Contacts contact = Addcontacts.AddingDetails();
        if (contact != null) {
            contact.display();
        }
    }
}
