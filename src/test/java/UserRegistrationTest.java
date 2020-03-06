import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    UserRegistration validate=new UserRegistration();

    String[]validEmail={"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
                        "abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
                        "abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
    String[]invalidEmail={"abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",
                          ".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com",
                          "abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};

    //TEST CASE TO CHECK FIRST NAME IS VALID
    @Test
    public void givenFirstName_WhenValid_thenReturn()
    {
        String firstName="Rahul";
        boolean result=validate.validateFirstName(firstName);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK FIRST NAME IS INVALID
    @Test
    public void givenFirstName_WhenInvalid_thenReturn()
    {
        String firstName="rahul";
        boolean result=validate.validateFirstName(firstName);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK LAST NAME IS VALID
    @Test
    public void givenLastName_WhenValid_thenReturn()
    {
        String lastName="Gidde";
        boolean result=validate.validateLastName(lastName);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK LAST NAME IS INVALID
    @Test
    public void givenLastName_WhenInvalid_thenReturn()
    {
        String lastName="gidde";
        boolean result=validate.validateLastName(lastName);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK EMAIL ADDRESS IS VALID
    @Test
    public void givenEmailAddress_WhenValid_thenReturn()
    {
        for(int index=0; index<validEmail.length; index++)
        {
            String email = validEmail[index];
            boolean result = validate.validateEmailAddress(email);
            Assert.assertTrue(result);
        }
    }

    //TEST CASE TO CHECK EMAIL ADDRESS IS INVALID
    @Test
    public void givenEmailAddress_WhenInvalid_thenReturn()
    {
        for(int index=0; index<invalidEmail.length; index++)
        {
            String email = invalidEmail[index];
            boolean result = validate.validateEmailAddress(email);
            Assert.assertFalse(result);
        }
    }
}