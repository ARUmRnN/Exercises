package local.exercises;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class StackMaxTest {
    @Test
    public void max01() {
        StackMax<Integer> stack = new StackMax<>();
        stack.push(2);
        stack.push(1);

        assertEquals(2, (int) stack.max());
        assertEquals(1, (int) stack.pop());
        assertEquals(2, (int) stack.max());
    }

    @Test
    public void max02() {
        StackMax<Integer> stack = new StackMax<>();
        stack.push(7);
        stack.push(1);
        stack.push(7);

        assertEquals(7, (int) stack.max());
        assertEquals(7, (int) stack.pop());
        assertEquals(7, (int) stack.max());
    }

    @Test
    public void max03() {
        StackMax<Integer> stack = new StackMax<>();
        stack.push(1);
        stack.push(2);

        assertEquals(2, (int) stack.max());
        assertEquals(2, (int) stack.pop());
        assertEquals(1, (int) stack.max());
    }

    @Test
    public void max04() {
        StackMax<Integer> stack = new StackMax<>();
        stack.push(2);
        stack.push(3);
        stack.push(9);
        stack.push(7);
        stack.push(2);

        assertEquals(9, (int) stack.max());
        assertEquals(9, (int) stack.max());
        assertEquals(9, (int) stack.max());
        assertEquals(2, (int) stack.pop());
        assertEquals(9, (int) stack.max());
    }
}
