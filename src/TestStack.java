/**
 * Created by PierreM on 05/01/2015.
 */
import Source.StringStack;
import Source.PointerStringStack;
import Source.ArrayStringStack;
import Source.StringStackNode;

import org.junit.*;
import static org.junit.Assert.*;

public class TestStack {
    @Test
    public void tests_stackInterface() {
        StringStack stack = new ArrayStringStack();

        stack.push("Item1");
        stack.push("Item2");
        stack.push("Item3");
        assertFalse(stack.isEmpty());

        assertEquals("Item3", stack.peek());
        assertEquals("Item3",stack.pop());
        assertFalse(stack.isEmpty());

        stack.push("Item4");
        assertFalse(stack.isEmpty());

        assertEquals("Item4", stack.peek());
        assertEquals("Item4",stack.pop());
        assertFalse(stack.isEmpty());

        assertEquals("Item2", stack.peek());
        assertEquals("Item2",stack.pop());
        assertFalse(stack.isEmpty());

        assertEquals("Item1", stack.peek());
        assertEquals("Item1",stack.pop());
        assertTrue(stack.isEmpty());

    }

}
