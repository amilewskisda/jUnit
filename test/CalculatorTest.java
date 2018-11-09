import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    // test name should explain what the test does
    static Calculator calculator;

    @BeforeClass
    public static void testBeforeClass() {
        System.out.println("Before class test");
        calculator = new Calculator();
        //assertNotNull(calculator);
    }

    @Test
    public void testAdd() {
        System.out.println("Test add");
        int a = 5;
        int b = 2;
        int expected = 7;
        int result = calculator.add(a, b);
        assertEquals("Add result: ", expected, result);
    }

    @Test
    public void testMultiply() {
        System.out.println("Test multiply");
        int a = 5;
        int b = 2;
        int expected = 10;
        int result = calculator.multiply(a, b);
        assertEquals("Multiply result: ", expected, result);
    }

    // Before, After executes before and after EACH test

    @Before
    public void testBefore() {
        System.out.println("Before test");
    }

    @After
    public void testAfter() {
        System.out.println("After test");
    }

    // Before Class, After Class executes before and after ALL test (needs to be static)

    @AfterClass
    public static void testAfterClass() {
        System.out.println("After class test");
        calculator = null; // static field cykl życia
    }
}