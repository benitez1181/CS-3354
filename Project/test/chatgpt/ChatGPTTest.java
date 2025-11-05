package chatgpt;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.stack.Stack;

public class ChatGPTTest {

    @Test
    public void sampleTest() {
        assertTrue(true);
    }
    
    @Test
    public void testPushAndPopSingleElement() {
        Stack s = new Stack(3);
        s.push(10);
        assertEquals(10, s.pop());
        assertTrue(s.isEmpty());
    }

    @Test
    public void testPushMultipleElementsAndPopOrder() {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals(3, s.pop());
        assertEquals(2, s.pop());
        assertEquals(1, s.pop());
        assertTrue(s.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testPopFromEmptyStackThrowsException() {
        Stack s = new Stack(2);
        s.pop();
    }

    @Test
    public void testPeekDoesNotRemoveElement() {
        Stack s = new Stack(3);
        s.push(100);
        s.push(200);
        assertEquals(200, s.peek());
        assertEquals(200, s.peek());
        assertEquals(2, s.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testPeekFromEmptyStackThrowsException() {
        Stack s = new Stack(2);
        s.peek();
    }

    @Test
    public void testIsEmptyInitially() {
        Stack s = new Stack(4);
        assertTrue(s.isEmpty());
    }

    @Test
    public void testIsFullWhenCapacityReached() {
        Stack s = new Stack(2);
        s.push(10);
        s.push(20);
        assertTrue(s.isFull());
    }

    @Test
    public void testSizeAfterSeveralOperations() {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.pop();
        s.push(3);
        assertEquals(2, s.size());
    }

    @Test(expected = IllegalStateException.class)
    public void testPushBeyondCapacityThrowsException() {
        Stack s = new Stack(2);
        s.push(10);
        s.push(20);
        s.push(30);
    }

    @Test
    public void testPushPopInterleaved() {
        Stack s = new Stack(4);
        s.push(5);
        s.push(10);
        assertEquals(10, s.pop());
        s.push(15);
        assertEquals(15, s.peek());
        assertEquals(15, s.pop());
        assertEquals(5, s.pop());
        assertTrue(s.isEmpty());
    }
}
