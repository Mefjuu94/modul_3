import java.util.regex.Pattern;

public class PasswordCase {

    public boolean hasGoodLength(String password) {
        return password.length() >= 12;
    }
    public boolean hasNoWhiteSpaces(String password){
        return password.matches("\\s+");
    }
    public boolean hasNoRepetitions(String password){
        Pattern pattern = Pattern.compile("(.)\\1");
        System.out.print("hasNoRepetitions : ");
        return pattern.matcher(password).find();
    }
    public boolean hasNumbers(String password){
        Pattern pattern = Pattern.compile("\\d");
        System.out.print("hasNumbers? : ");
        return  pattern.matcher(password).find();
    }
    public boolean hasSpecialCharacter(String password){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9 ]",Pattern.CASE_INSENSITIVE);
        System.out.print("hasSpecialCharacter? : ");
        return  pattern.matcher(password).find();
    }

}
