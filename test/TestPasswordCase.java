import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPasswordCase {

    PasswordCase password = new PasswordCase();
    String pass = "JakiesHaslo123^!";
    String wrongPass = "haaslo ";

    @Test
    public void hasGoodLength(){
        assertTrue(password.hasGoodLength(pass));
    }
    @Test
    public void hasNoWhiteSpaces(){
        assertFalse(password.hasNoWhiteSpaces(pass));
    }
    @Test
    public void hasNoRepetitions(){
        assertFalse(password.hasNoRepetitions(pass));
    }
    @Test
    public void hasNumbers(){
        assertTrue(password.hasNumbers(pass));
    }
    @Test
    public void hasSpecialCharacter() {
        assertTrue(password.hasSpecialCharacter(pass));
    }

    //Bad Case

    @Test
    public void hasBadLength(){
        assertFalse(password.hasGoodLength(wrongPass));
    }
    @Test
    public void hasWhiteSpaces(){
        assertFalse(password.hasNoWhiteSpaces(wrongPass));
    }
    @Test
    public void hasRepetitions(){
        assertTrue(password.hasNoRepetitions(wrongPass));
    }
    @Test
    public void dontHaveNumbers(){
        assertFalse(password.hasNumbers(wrongPass));
    }
    @Test
    public void hasNoSpecialCharacter() {
        assertFalse(password.hasSpecialCharacter(wrongPass));
    }

    

}
