public class Contacts
{
    public String FirstName;
    public String LastName;
    public String Email;
    public String PhoneNumber;
    public String Address;
    public String City;
    public String State;
    public String ZipCode;

    public Contacts(String firstName, String lastName, String email, String phoneNumber, String address, String city, String state, String zipCode)
    {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
        this.Address = address;
        this.City = city;
        this.State = state;
        this.ZipCode = zipCode;
    }
    public void display() {
        System.out.printf("%s %s %s %s %s %s %s %s%n",
                FirstName, LastName, Email, PhoneNumber,
                Address, City, State, ZipCode);
    }
}
