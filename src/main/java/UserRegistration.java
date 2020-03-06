import java.util.regex.Pattern;

public class UserRegistration
{
    //DECLARE PATTERN
    String firstNamePattern="^[A-Z][a-zA-Z]{2,}$";
    String lastNamePattern="^[A-Z][a-zA-Z]{2,}$";
    String emailPattern="^[a-z]{3}((([.+_-]?+[a-zA-z-0-9])+([@]+[a-zA-Z0-9]+))|[@][a-zA-Z0-9]+)[.][a-z]{3}[.]?([a-z]{2,4}|[a-z]?)$";
    String numberPattern="^[+]?[0-9]{2}[ ][0-9]{10}$";
    String passwordPattern="^([A-Z]+[a-z]*)+|([a-z]*[A-Z]+[a-z]*)+|([a-z]*[A-Z]+).{8,}$";
    public static void main(String[] args)
    {
        System.out.println("-----WELCOME TO USER REGISTRATION-----");
    }

    //CHECK PATTERN FOR FIRST NAME
    public boolean validateFirstName(String firstName)
    {
        return (Pattern.matches(firstNamePattern,firstName));
    }

    //CHECK PATTERN FOR LAST NAME
    public boolean validateLastName(String lastName)
    {
        return (Pattern.matches(lastNamePattern,lastName));
    }

    //CHECK PATTERN FOR EMAIL ADDRESS
    public boolean validateEmailAddress(String email)
    {
        return (Pattern.matches(emailPattern,email));
    }

    //CHECK PATTERN FOR MOBILE NUMBER
    public boolean validateNumber(String number)
    {
        return (Pattern.matches(numberPattern,number));
    }

    //CHECK PATTERN FOR PASSWORD
    public boolean validatePassword(String password)
    {
        return (Pattern.matches(passwordPattern,password));
    }
}
