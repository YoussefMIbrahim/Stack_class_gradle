package stacks_tests;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class StackTest {

    private Stack<Integer> stack;


    //Testing the emptyStachException with pop
    @Test void testPopEmptyStack(){

        stack = new Stack<>(Integer.class, 10);
        assertThrows(EmptyStackException.class, () -> {stack.pop();});

    }

    //Testing the emptyStachException with peek
    @Test void testPeekEmptyStack(){

        stack = new Stack<>(Integer.class, 10);
        assertThrows(EmptyStackException.class, () -> {stack.peek();});  
    }

    //Testing the FullStachException with push
    @Test void testPushFullStack(){

        stack = new Stack<>(Integer.class, 0);
        assertThrows(FullStackException.class, () -> {stack.push(1);});  

    }

    //Testing the empty method whenstack is empty and when it has 1 item
    @Test void testEmptyStack(){

        stack = new Stack<>(Integer.class, 10);

        assertTrue(stack.empty());

        stack.push(1);

        assertFalse(stack.empty());

    }
}
