/**
 * Created by PierreM on 05/01/2015.
 */

import Source.Person;
import Source.PersonQueue;
import Source.PersonQueueImpl1;
import Source.PersonQueueImpl2;

import org.junit.*;
import static org.junit.Assert.*;

public class TestQueue {
    @Test
    public void tests_personQueueInterface() {
        PersonQueue queue = new PersonQueueImpl2();
        Person p1 = new Person(1,"Basil",5);
        Person p2 = new Person(2,"Luda",10);
        Person p3 = new Person(3,"Keith",15);
        queue.insert(p1);
        queue.insert(p2);
        queue.insert(p3);
        assertEquals(p1,queue.retrieve());
        assertEquals(p2,queue.retrieve());
        assertEquals(p3,queue.retrieve());
    }
}