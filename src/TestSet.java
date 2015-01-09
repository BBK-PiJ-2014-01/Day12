/**
 * Created by PierreM on 05/01/2015.
 */
import Source.IntSet;
import Source.TreeIntSet;

import org.junit.*;
import static org.junit.Assert.*;

public class TestSet {
    @Test
    public void tests_intSetInterface() {
        IntSet tree = new TreeIntSet(6);
        tree.add(5);
        tree.add(9);
        tree.add(3);
        tree.add(8);
        tree.add(11);
        tree.add(11);
        tree.add(12);

        String expected = "6,5,3,9,8,11,12";
        assertEquals(expected,tree.toString());
        assertFalse(tree.contains(7));
        assertTrue(tree.contains(11));
        assertFalse(tree.containsVerbose(7));
        assertTrue(tree.containsVerbose(11));

    }
}
