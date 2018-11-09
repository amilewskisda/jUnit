import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RegexTest {

    @Test
    public void testIsPeselValid() {
        System.out.println("Test is pesel valid");
        String pesel = "01234567891";
        String wrongPesel = "01234567891asd";
        //assertTrue(Main.isPeselValid(pesel));
        assertTrue("for " + wrongPesel + " result is:", Main.isPeselValid(pesel));
    }
}
