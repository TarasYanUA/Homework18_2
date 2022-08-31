import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestJunit {
    @Test
    public void testIsLuckyTicketFalse() {
        System.out.println("testLuckyTicketFalse");
        int[] testArray = {1, 6, 1, 6, 6, 7};
        boolean actualResult = LuckyTicket.checkIsLuckTicket(testArray);
        assertFalse(actualResult);
    }

    @Test
    public void testIsLuckyTicketTrue() {
        System.out.println("testLuckyTicketTrue");
        int[] testArray = {4, 4, 2, 5, 4, 1};
        boolean actualResult = LuckyTicket.checkIsLuckTicket(testArray);
        assertTrue(actualResult);
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("This is text before each test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("This is text after each test");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all tests...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all tests...");
    }
}

