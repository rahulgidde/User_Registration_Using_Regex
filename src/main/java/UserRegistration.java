import java.util.regex.Pattern;

public class UserRegistration
{
    //DECLARE PATTERN
    String firstNamePattern="^[A-Z][a-zA-Z]{2,}$";
    String lastNamePattern="^[A-Z][a-zA-Z]{2,}$";
    String emailPattern="^[a-z]{3}((([.+_-]?+[a-zA-z-0-9])+([@]+[a-zA-Z0-9]+))|[@][a-zA-Z0-9]+)[.][a-z]{3}[.]?([a-z]{2,4}|[a-z]?)$";
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
}
