package stacks_tests;


import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    void setUp() {
        // Initialize the stack before each test
        stack = new Stack<>(Integer.class, 10);
    }


    
    @Test void testPopEmptyStack(){

        assertThrows(EmptyStackException.class, () -> {stack.pop();});

    }
}
