/**
 * Created by PierreM on 05/01/2015.
 */

import Source.SimpleMap;
import Source.SimpleMapImpl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestSimpleMap {
    @Test
    public void tests_simpleMapInterface() {
        SimpleMapImpl simpleMap = new SimpleMapImpl(100);
        assertTrue(simpleMap.isEmpty());
        simpleMap.put(17, "Peter");
        assertFalse(simpleMap.isEmpty());
        simpleMap.remove(17);
        assertTrue(simpleMap.isEmpty());

        simpleMap.put(99, "Karl");
        simpleMap.put(34, "Jo");
        simpleMap.put(28, "Bill");
        simpleMap.put(28, "Dean");
        simpleMap.put(54, "David");

        assertEquals("Bill",simpleMap.get(28));
        assertEquals(null,simpleMap.get(44));
        assertEquals(null,simpleMap.get(0));

        assertEquals("Karl",simpleMap.get(99));
        simpleMap.remove(99);
        assertEquals(null,simpleMap.get(99));
        simpleMap.put(99,"Greg");
        assertEquals("Greg",simpleMap.get(99));

        simpleMap.remove(99);
        simpleMap.remove(34);
        simpleMap.remove(54);
        simpleMap.remove(28);
        assertTrue(simpleMap.isEmpty());

    }
}
