package local.exercises;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Unit test for FibonacciNumber.
 */
public class FibonacciNumberTest
{
    @Test
    public void evaluteZeroElement()
    {
      FibonacciNumber fb = new FibonacciNumber(0);
      int fbn = fb.evaluteByIndex();
      assertEquals(0,fbn);
    }

    @Test
    public void evaluteFirstElement()
    {
      FibonacciNumber fb = new FibonacciNumber(1);
      int fbn = fb.evaluteByIndex();
      assertEquals(1,fbn);
    }

    @Test
    public void evaluteSecondElement()
    {
      FibonacciNumber fb = new FibonacciNumber(2);
      int fbn = fb.evaluteByIndex();
      assertEquals(1,fbn);
    }

    @Test
    public void evaluteThirdElement()
    {
      FibonacciNumber fb = new FibonacciNumber(3);
      int fbn = fb.evaluteByIndex();
      assertEquals(2,fbn);
    }

    @Test
    public void evaluteFourthElement()
    {
      FibonacciNumber fb = new FibonacciNumber(4);
      int fbn = fb.evaluteByIndex();
      assertEquals(3,fbn);
    }

    @Test
    public void evaluteFifthElement()
    {
      FibonacciNumber fb = new FibonacciNumber(5);
      int fbn = fb.evaluteByIndex();
      assertEquals(5,fbn);
    }

    @Test
    public void evaluteSixthElement()
    {
      FibonacciNumber fb = new FibonacciNumber(6);
      int fbn = fb.evaluteByIndex();
      assertEquals(8,fbn);
    }

    @Test
    public void evaluteSeventhElement()
    {
      FibonacciNumber fb = new FibonacciNumber(7);
      int fbn = fb.evaluteByIndex();
      assertEquals(13,fbn);
    }
}
