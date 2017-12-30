import entity.Customer;
import entity.SkiPass;
import entity.SkiPassFactory;
import entity.Tourniquet;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;


/**
 * Created by StasMaster on 30.12.17.
 */
public class EntityTest {

    private Customer customer;
    private SkiPassFactory skiPassFactory;
    private Tourniquet tourniquet;

    @Before
    public void init() {
        this.customer = new Customer("Yurii", "Stasinchuk");
        this.skiPassFactory = new SkiPassFactory();
        this.tourniquet = new Tourniquet();
    }

    @Test
    public void EntityTest() {
        SkiPass skiPass = skiPassFactory.getWeekendSkiPass(1, customer);
        assertTrue(tourniquet.pass(skiPass));
        System.out.println(skiPass.getSkiPassStrategy().getAvailibleCount());
        assertTrue(tourniquet.pass(skiPass));
        assertTrue(tourniquet.pass(skiPass));
        assertTrue(tourniquet.pass(skiPass));
        assertTrue(tourniquet.pass(skiPass));
        skiPassFactory.banSkiPass(skiPass);
        assertFalse(tourniquet.pass(skiPass));
    }


}
