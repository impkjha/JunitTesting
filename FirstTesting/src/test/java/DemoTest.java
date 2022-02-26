import org.junit.*;

import static org.junit.Assert.*;

public class DemoTest {
    Order o = new Order(10, "Apple", 100);
    Orderservice o1 = new Orderservice();
    Emailservice e1 = new Emailservice();
    @BeforeClass
    public static void xyz (){

        Orderservice.getInstance();
        System.out.println("Creating Instances for Test Cases ");
        System.out.println("Initializing Tests");
    }
    @Before
    public void startingtest(){
        System.out.println("Initializing Test");
    }
    @After
    public void finishingTest(){
        System.out.println("Test Completed");
    }
    @Test(expected = RuntimeException.class)
    public void testplaceOrder(){
        assertTrue("", o1.placeOrder(o, "xyz@you.me"));
        assertSame(150,o1.placeOrder1(o));
    }

    @Test
    public void testplaceordernew1() {
        assertNotNull("To check if object order is not null and storing values", o1);
    }

    @Test
    public void testplaceordernew2() {
        System.out.println("Place Order ");
    }

    @Test
    public void testsentEmail(){
        assertTrue("To check if method return true value ", e1.sendEmail(o, "xyz@you.me"));
    }

    @Test
    public void testEmail1(){
        assertTrue(e1.sendEmail(o, "xyz@you.me"));
    }

    @Test
    public void testEmailNew(){
        assertNotNull("", e1);
    }

    @Test
    public void testEmailNew1() {
        System.out.println("Sent Email ");
    }
}