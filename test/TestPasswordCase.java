import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPasswordCase {

    PasswordCase password = new PasswordCase("JakiesHaslo123^!");

    @Test
    public void hasGoodLength(){
        assertTrue(password.getPassword().length() > 12);
    }
    @Test
    public void hasNoWhiteSpaces(){
        assertFalse(password.getPassword().contains(" "));
    }
    @Test
    public void hasNoRepetitions(){
        Pattern pattern = Pattern.compile("(.)\\1");
        assertFalse(pattern.matcher(password.getPassword()).find());
    }
    @Test
    public void hasNumbers(){
        Pattern pattern = Pattern.compile("\\d");
        assertTrue(pattern.matcher(password.getPassword()).find());
    }
    @Test
    public void hasSpecialCharacter() {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        assertTrue(pattern.matcher(password.getPassword()).find());
    }

}
