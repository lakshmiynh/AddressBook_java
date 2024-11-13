import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRegex
{
    private final String PatternName = "^[A-Z][a-z]{2,9}$";
    private final String PatternEmail = "^\\w{3,}([.+-]\\w{1,})?@\\w{1,}\\.[a-z]{1,}(\\.[a-z]{1,})?$";
    private final String PatternNumber = "^[0-9]{1,3}\\s[0-9]{10}$";
    private final String PatternZipCode = "^\\d{6}$";
    private final String PatternPassword = "^(?=.*?[A-Z])(?=.*?[0-9])(?=[^#?!@$%^&*+]*[#?!@$%^&*+][^#?!@$%^&*+]*$).{8,}$";
    private final String Patternaddress = "^[\\w\\s\\.,'-/]{5,100}$";

    // Method to validate Name
    public boolean isName(String name)
    {
        return Pattern.matches(PatternName, name);
    }

    // Method to validate Email
    public boolean isEmail(String email)
    {
        return Pattern.matches(PatternEmail, email);
    }

    // Method to validate Number
    public boolean isNumber(String number)
    {
        return Pattern.matches(PatternNumber, number);
    }

    // Method to validate Password
    public boolean isPassword(String password)
    {
        return Pattern.matches(PatternPassword, password);
    }

    // Method to validate Zip Code
    public boolean isZipCode(String zipCode)
    {
        return Pattern.matches(PatternZipCode, zipCode);
    }

    public boolean isAddress(String address)
    {
        return Pattern.matches(Patternaddress, address);
    }

}
