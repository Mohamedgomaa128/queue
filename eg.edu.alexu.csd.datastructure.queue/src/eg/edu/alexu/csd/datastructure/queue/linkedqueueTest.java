package eg.edu.alexu.csd.datastructure.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class linkedqueueTest {

    @Test
    void test1() {
        linkedqueue q = new linkedqueue();

        for (int i = 5 ; i <= 30 ; i+=5)
            q.enqueue(i);
        //queue : 5  10  15  20  25  30

        assertEquals(5,q.dequeue());
        //queue will be : 10  15  20  25  30

        assertEquals(5,q.size());
        assertFalse(q.isEmpty());

        q.enqueue(60);
        //queue will be : 10  15  20  25  30 60
        assertEquals(6,q.size());
        assertEquals(10,q.dequeue());

        //queue will be :  15  20  25  30  60
        assertEquals(5,q.size());
        assertEquals(15,q.dequeue());

    }

    @Test
    void test2() {
        linkedqueue q = new linkedqueue();

        //declare empty queue
        assertTrue(q.isEmpty());
        assertEquals(0,q.size());

        for (int i = 10 ; i <= 20 ; i+=2)
            q.enqueue(i);
        //queue : 10  12  14  16  18  20

        for (int i = 10 ; i <= 20 ; i+=2)
            assertEquals(i,q.dequeue());
        //queue will be : empty

        assertTrue(q.isEmpty());
    }

    @Test
    void test3() {
        linkedqueue q = new linkedqueue();

        assertTrue(q.isEmpty());
        assertEquals(0,q.size());

        try{
            q.dequeue();
        }catch (Exception e){
            assertTrue(true);
            //will catch Exception because queue is empty
        }
        assertTrue(q.isEmpty());

        q.enqueue(5);
        q.enqueue(10);
        //queue : 5  10

        assertEquals(5,q.dequeue());
        assertEquals(1,q.size());
        //queue will be : 10

        assertFalse(q.isEmpty());
        assertEquals(10,q.dequeue());
        assertEquals(0,q.size());
        assertTrue(q.isEmpty());
    }
}