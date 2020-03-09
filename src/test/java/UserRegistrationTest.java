import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    boolean result;
    UserRegistration validate = new UserRegistration();

    String[]validEmail={"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
                        "abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
                        "abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
    String[]invalidEmail={"abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",
                          ".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com",
                          "abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};

    //TEST CASE TO CHECK FIRST NAME IS VALID
    @Test
    public void givenFirstName_WhenValid_ThenReturnTrue()
    {
        String firstName="Rahul";
        result = validate.validateFirstName(firstName);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK FIRST NAME IS INVALID
    @Test
    public void givenFirstName_WhenInvalid_ThenReturnFalse()
    {
        String firstName="rahul";
        result = validate.validateFirstName(firstName);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK LAST NAME IS VALID
    @Test
    public void givenLastName_WhenValid_ThenReturnTrue()
    {
        String lastName="Gidde";
        result = validate.validateLastName(lastName);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK LAST NAME IS INVALID
    @Test
    public void givenLastName_WhenInvalid_ThenReturnFalse()
    {
        String lastName="gidde";
        result = validate.validateLastName(lastName);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK EMAIL ADDRESS IS VALID
    @Test
    public void givenEmailAddress_WhenValid_ThenReturnTrue()
    {
        for(int index=0; index<validEmail.length; index++)
        {
            String email = validEmail[index];
            result = validate.validateEmailAddress(email);
            Assert.assertTrue(result);
        }
    }

    //TEST CASE TO CHECK EMAIL ADDRESS IS INVALID
    @Test
    public void givenEmailAddress_WhenInvalid_ThenReturnFalse()
    {
        for(int index=0; index<invalidEmail.length; index++)
        {
            String email = invalidEmail[index];
            result = validate.validateEmailAddress(email);
            Assert.assertFalse(result);
        }
    }

    //TEST CASE TO CHECK MOBILE NUMBER IS VALID
    @Test
    public void givenNumber_WhenValid_ThenReturnTrue()
    {
        String number="+91 9665382289";
        result = validate.validateNumber(number);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK MOBILE NUMBER IS INVALID
    @Test
    public void givenNumber_WhenInValid_ThenReturnFalse()
    {
        String number="9665382289";
        result = validate.validateNumber(number);
        Assert.assertFalse(result);
    }

    //TEST CASE TO CHECK MINIMUM 8 CHARACTERS PASSWORD IS VALID
    @Test
    public void givenPasswordRule1_WhenValid_ThenReturnTrue()
    {
        String password="Aafsdvgsaghb1*1";
        result = validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE TO CHECK MINIMUM 8 CHARACTERS PASSWORD IS INVALID
    @Test
    public void givenPasswordRule1_WhenInvalid_ThenReturnFalse()
    {
        String password="asda";
        result = validate.validatePassword(password);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE UPPER CASE CHARACTER
    @Test
    public void givenPasswordRule2_WhenValid_ThenReturnTrue()
    {
        String password="adadaAaxaa$4";
        result = validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE UPPER CASE CHARACTER
    @Test
    public void givenPasswordRule2_WhenInvalid_ThenReturnFalse()
    {
        String password="asdasdfafa";
        result = validate.validatePassword(password);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE NUMERIC NUMBER
    @Test
    public void givenPasswordRule3_WhenValid_ThenReturnTrue()
    {
        String password="adadaAaxa11a#2";
        result = validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE NUMERIC
    @Test
    public void givenPasswordRule3_WhenInvalid_ThenReturnFalse()
    {
        String password="asdasdfafa";
        result = validate.validatePassword(password);
        Assert.assertFalse(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE SPECIAL CHARACTER
    @Test
    public void givenPasswordRule4_WhenValid_ThenReturnTrue()
    {
        String password="adadaAaxa11a2@";
        result = validate.validatePassword(password);
        Assert.assertTrue(result);
    }

    //TEST CASE FOR VALID PASSWORD FOR AT LEAST ONE SPECIAL CHARACTER
    @Test
    public void givenPasswordRule4_WhenInvalid_ThenReturnFalse()
    {
        String password="asdasdfafa4A";
        result = validate.validatePassword(password);
        Assert.assertFalse(result);
    }
}