import java.util.regex.Pattern;

public class UserRegistration
{
    //DECLARE PATTERN
    String firstNamePattern="^[A-Z][a-zA-Z]{2,}$";
    String lastNamePattern="^[A-Z][a-zA-Z]{2,}$";
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

}
