package assignments.a1;

import static assignments.a1.q5.isValidMove;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testq5 {
    @Test
    // Test case for 1-->A-->2.
    public void testNode2() {
        assertEquals("Invalid: <from> and <to> both needs to be non-empty strings", isValidMove(null, null));
    }
    @Test
    // Test case for 1-->!A-->5-->B-->6.
    public void testNode6() {
        assertEquals("Valid: stock to pile", isValidMove("stock", "3"));
    }
    @Test
    // Test case for 1-->!A-->5-->!B-->7-->C-->8.
    public void testNode8() {
        assertEquals("Valid: stock to suit", isValidMove("stock", "h"));
    }
    @Test
    // Test case for 1-->!A-->5-->!B-->7-->!C-->9-->D-->10-->E-->11.
    public void testNode11() {
        assertEquals("Invalid: <to> value is invalid", isValidMove("4", "6000"));
    }
    @Test
    // Test case for 1-->!A-->5-->!B-->7-->!C-->9-->D-->10-->!E-->13.
    public void testNode13() {
        assertEquals("Valid: pile to (pile or suit)", isValidMove("2", "s"));
    }
    @Test
    // Test case for 1-->!A-->5-->!B-->7-->!C-->9-->!D-->15.
    public void testNode15() {
        assertEquals("Invalid <from> or <to> value", isValidMove("300", "hey"));
    }
}
