/**
 * Created by Pierre on 28/12/2014.
 */
import java.util.Random;
import org.junit.*;
import static org.junit.Assert.*;

public class TestHashUtilities {
    @Test
    public void tests_KeyBetween0and1000() {
        Person p = new Person();
        Random numberGenerator = new Random();
        int number;
        boolean inRange = true;
        for (int i=0;i<2000;i++) {
            number = numberGenerator.nextInt(1000000);
            if ((HashUtilities.shortHash(number) <= 0) || (HashUtilities.shortHash(number) >= 1000))
                inRange = false;
            assertTrue(inRange);
            inRange = true;
        }
    }

}
