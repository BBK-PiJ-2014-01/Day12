/**
 * Created by PierreM on 17/12/2014.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testsNormalName() {
        Person p = new Person();
        String input = "Dereck Robert Yssirt";
        String output = p.getInitials(input);
        String expected = "DRY";
        assertEquals(output, expected);
    }

    @Test
    public void testsNameWithTwoSpaces() {
        Person p = new Person();
        String input = "Dereck  Robert Yssirt";
        String output = p.getInitials(input);
        String expected = "DRY";
        assertEquals(output, expected);
    }

}

