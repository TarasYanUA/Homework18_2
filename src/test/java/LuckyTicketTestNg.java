import org.testng.Assert;
import org.testng.annotations.*;

public class LuckyTicketTestNg {
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before all tests...");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After all tests...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is text before each test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is text after each test");
    }

    @Test
    public void luckyTicketIsFalseTest () {
        System.out.println("testLuckyTicketFalse");
        int [] testArray = {1,4,1,6,6,7};
        boolean actualResult = LuckyTicket.checkItIsLuckyTicket(testArray);
        Assert.assertFalse(actualResult);
    }

    @Test
    public void luckyTicketIsTrueTest () {
        System.out.println("testLuckyTicketTrue");
        int [] testArray = {3,3,3,2,2,5};
        boolean actualResult = LuckyTicket.checkItIsLuckyTicket(testArray);
        Assert.assertTrue(actualResult);
    }
}