import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {
    MathUtils mathUtils;
    TestInfo testInfo;
    TestReporter testReporter;

    @BeforeAll
    void beforeAllInit() {
        System.out.println("this runs before all");
    }

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        mathUtils = new MathUtils();
    }

    @Nested
    class testAdd {
        @Test
        @DisplayName("Testing add method for positive numbers")
        void testAddPositive() {
            int expected = 2;
            int actual = mathUtils.add(1, 1);
            assertEquals(expected, actual, "add method adds two numbers");
        }

        @Test
        @DisplayName("Testing add method for negative numbers")
        void testAddNegative() {
            int expected = -2;
            int actual = mathUtils.add(-1, -1);
            assertEquals(expected, actual, "add method adds two numbers");
        }
    }

    @Test
    @DisplayName("Testing circle area method")
    void testCircleArea() {
        boolean value = true;
        assumeTrue(value);
        testReporter.publishEntry("Running" + testInfo.getDisplayName() + "with tags" + testInfo.getTags());
        assertEquals(314, mathUtils.circleArea(10), "returns circle area");

    }

    @RepeatedTest(2)
    @DisplayName("Testing divide method")
    void testDivide(RepetitionInfo repetitionInfo) {
        repetitionInfo.getTotalRepetitions();
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "divide by zero should be thrown");

    }

    @Test
    @DisplayName("Testing multiply method")
    void testMultiply() {
        assertAll(
                () -> assertEquals(0, mathUtils.multiply(0, 1)),
                () -> assertEquals(1, mathUtils.multiply(1, 1)),
                () -> assertEquals(-1, mathUtils.multiply(-1, 1))

        );
    }

    @Test
    @DisplayName("Disabled Test ")
    @Disabled
    void testDisabled() {
        fail("Disabled Test");
    }
}
