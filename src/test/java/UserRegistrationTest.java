import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    UserRegistration validate=new UserRegistration();

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
}