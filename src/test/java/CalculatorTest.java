import org.junit.jupiter.api.*;

public class CalculatorTest {
    private static long suiteStartTime;
    private long testStartTime;
    private static Calculator calc = new Calculator();

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running CalculatorTest");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("CalculatorTest complete: " + (System.nanoTime() - suiteStartTime));
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test");
        testStartTime = System.nanoTime();
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete:" + (System.nanoTime() - testStartTime));
    }

    @Test
    public void calculateMonthlyPaymentTest_success() {
        //given:
        double expected = 4_583.333333333;
        double total = 50_000.00;
        int months = 12;
        //when:
        double result = calc.calculateMonthlyPayment(total, months);
        //then:
        Assertions.assertTrue(Math.abs(expected - result) < 0.0000001);
    }

    @Test
    public void calculateTotalPaymentTest_success() {
        //given:
        double expected = 55_000.00;
        double total = 50_000.00;
        int months = 12;
        //when:
        double result = calc.calculateTotalPayment(total, months);
        //then:
        Assertions.assertTrue(Math.abs(expected - result) < 0.0000001);
    }

    @Test
    public void calculateOverpaymentTest_success() {
        //given:
        double expected = 5_000.00;
        double total = 50_000.00;
        int months = 12;
        //when:
        double result = calc.calculateOverpayment(total, months);
        //then:
        Assertions.assertTrue(Math.abs(expected - result) < 0.0000001);
    }


}
