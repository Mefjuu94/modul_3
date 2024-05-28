import java.util.regex.Pattern;

public class PasswordCase {

    private final String password;

    public String getPassword() {
        return password;
    }

    public PasswordCase(String password) {
        this.password = password;
    }

    public boolean hasGoodLength(String password) {
        return password.length() >= 12;
    }
    public boolean hasNoWhiteSpaces(String password){
        return password.matches(".*[^a-zA-Z0-9 ].*");
    }
    public boolean hasNoRepetitions(String password){
        Pattern pattern = Pattern.compile("(.)\\1");
        System.out.print("hasNoRepetitions : ");
        return pattern.matcher(getPassword()).find();
    }
    public boolean hasNumbers(String password){
        Pattern pattern = Pattern.compile("\\d");
        System.out.print("hasNumbers? : ");
        return  pattern.matcher(getPassword()).find();
    }
    public boolean hasSpecialCharacter(String password){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        System.out.print("hasSpecialCharacter? : ");
        return  pattern.matcher(getPassword()).find();
    }

}
