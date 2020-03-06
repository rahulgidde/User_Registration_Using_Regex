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
    public void givenFirstName_whenValid_thenReturn()
    {
        String firstName="Rahul";
        boolean result=validate.validateFirstName(firstName);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK FIRST NAME IS INVALID
    @Test
    public void givenFirstName_whenInvalid_thenReturn()
    {
        String firstName="rahul";
        boolean result=validate.validateFirstName(firstName);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK LAST NAME IS VALID
    @Test
    public void givenLastName_whenValid_thenReturn()
    {
        String lastName="Gidde";
        boolean result=validate.validateLastName(lastName);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK LAST NAME IS INVALID
    @Test
    public void givenLastName_whenInvalid_thenReturn()
    {
        String lastName="gidde";
        boolean result=validate.validateLastName(lastName);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK EMAIL ADDRESS IS VALID
    @Test
    public void givenEmailAddress_whenValid_thenReturn()
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
    public void givenEmailAddress_whenInvalid_thenReturn()
    {
        for(int index=0; index<invalidEmail.length; index++)
        {
            String email = invalidEmail[index];
            boolean result = validate.validateEmailAddress(email);
            Assert.assertFalse(result);
        }
    }

    //TEST CASE TO CHECK MOBILE NUMBER IS VALID
    @Test
    public void givenNumber_whenValid_thenReturn()
    {
        String number="+91 9665382289";
        boolean result=validate.validateNumber(number);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK MOBILE NUMBER IS INVALID
    @Test
    public void givenNumber_whenInValid_thenReturn()
    {
        String number="9665382289";
        boolean result=validate.validateNumber(number);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK MINIMUM 8 CHARACTERS PASSWORD IS VALID
    @Test
    public void givenPasswordRule1_whenValid_thenReturn()
    {
        String password="Aafsdvgsaghb11";
        boolean result=validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK MINIMUM 8 CHARACTERS PASSWORD IS INVALID
    @Test
    public void givenPasswordRule1_whenInvalid_thenReturn()
    {
        String password="asda";
        boolean result=validate.validatePassword(password);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE UPPER CASE CHARACTER
    @Test
    public void givenPasswordRule2_whenValid_thenReturn()
    {
        String password="adadaAaxaa4";
        boolean result=validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE UPPER CASE CHARACTER
    @Test
    public void givenPasswordRule2_whenInvalid_thenReturn()
    {
        String password="asdasdfafa";
        boolean result=validate.validatePassword(password);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE NUMERIC NUMBER
    @Test
    public void givenPasswordRule3_whenValid_thenReturn()
    {
        String password="adadaAaxa11a2";
        boolean result=validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE NUMERIC
    @Test
    public void givenPasswordRule3_whenInvalid_thenReturn()
    {
        String password="asdasdfafa";
        boolean result=validate.validatePassword(password);
        Assert.assertFalse(result);
    }
}