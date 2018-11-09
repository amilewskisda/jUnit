import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;

@RunWith(Parameterized.class)
public class ParametrizedTest {

    private int a;
    private int b;
    private int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                //Pierwsze 2 elementy to wartosci wymagane przez metode, drugi spodziewany wynik.
                {5, 5, 10},
                {2, 1, 8},
                {1, 5, 6}
        });
    }

    //Konstruktor jest wymagany do testów z parametrami
    public ParametrizedTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void testCalculator() {
        System.out.println("Parametrized test calculator");
        Calculator calculator = new Calculator();
        // Assert.assertEquals(calculator.add(a,b), expected);
        Assert.assertThat(calculator.add(a, b), is(expected));
    }
}
