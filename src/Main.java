import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // 1) create directory test
    // 2) File -> Project Structure -> Modules zaznaczyć folder test i użyc zakładki Tests
    // 3) to create test of class alt+enter on class -> JUnit4 -> Fix

    public static boolean isPeselValid(String pesel) {
        // \\d char is digit
        // \\d{11} 11 digits
        // ^tekst$ value exactly like between ^ a $ without any other chars

        String peselRegex = "\\d{11}"; //for  matcher.matches() (must match the ENTIRE string)
        // String peselRegex = "^\\d{11}$"; // for matcher.find()
        Pattern pattern = Pattern.compile(peselRegex);
        Matcher matcher = pattern.matcher(pesel);
        boolean isValid = matcher.matches();
        return isValid;
    }
}
