package eg.edu.alexu.csd.datastructure.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

class testarrqueue {

    @Test
    void test1() {
        Scanner input=new Scanner(System.in);
        try {
        int sizefortest1;
        System.out.println("enter the size");
        sizefortest1=input.nextInt();
        arrqueue q = new arrqueue(sizefortest1);

        for (int i = 1 ; i <= sizefortest1 ; i++)
            q.enqueue(i);
        //queue : 1  2.....sizefortest1 

        assertEquals(1,q.dequeue());
        //queue will be : 2 3 ....size for test1

        assertEquals(sizefortest1-1,q.size());
        assertFalse(q.isEmpty());

        q.enqueue(60);
        //queue will be : 2 3 .... sizefortest1  60
        assertEquals(sizefortest1,q.size());
        assertEquals(2,q.dequeue());

        //queue will be : 3 .... sizefortest1  60
        assertEquals(sizefortest1-1,q.size());
        assertEquals(3,q.dequeue());}
        catch(Exception e){
        	System.out.println(e.getMessage());
        	 assertTrue(true);
        			}

    }

    @Test
    void test2() {
    	Scanner input=new Scanner(System.in);
    	try {  
    	 int sizefortest2;
         System.out.println("enter the size");
         sizefortest2=input.nextInt();
         arrqueue q = new arrqueue(sizefortest2);


        //declare empty queue
        assertTrue(q.isEmpty());
        assertEquals(0,q.size());

        for (int i = 1 ; i <= sizefortest2 ; i++)
            q.enqueue(i);
        //queue : 10  12  14  16  18  20

        for (int i = 1 ; i <= sizefortest2 ; i++)
            assertEquals(i,q.dequeue());
        //queue will be : empty

        assertTrue(q.isEmpty());}
    	catch(Exception e){
        	System.out.println(e.getMessage());
        	 assertTrue(true);
        			}

    	
    }

    @Test
    void test3() {
    	Scanner input=new Scanner(System.in);
    	try {  
    	 int sizefortest3;
         System.out.println("enter the size");
         sizefortest3=input.nextInt();
         arrqueue q = new arrqueue(sizefortest3);

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
    	catch(Exception e){
    	System.out.println(e.getMessage());
   	 assertTrue(true);
   			}
    	}
    
}