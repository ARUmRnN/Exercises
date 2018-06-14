package local.exercises;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
  @Test
  public void validate01() {
    Validator validator = new Validator("([][])");
    assertEquals(-1,validator.validate());
  }

  @Test
  public void validate02() {
    Validator validator = new Validator("[()]{}{[()()]()}");
    assertEquals(-1,validator.validate());
  }

  @Test
  public void validate03() {
    Validator validator = new Validator("foo(bar[i);");
    assertEquals(9,validator.validate());
  }

  @Test
  public void validate04() {
    Validator validator = new Validator("{[}");
    assertEquals(2,validator.validate());
  }

  @Test
  public void validate05() {
    Validator validator = new Validator("aaaa}");
    assertEquals(4,validator.validate());
  }

  @Test
  public void validate06() {
    Validator validator = new Validator("{");
    assertEquals(0,validator.validate());
  }

  @Test
  public void validate07() {
    Validator validator = new Validator("{}[]");
    assertEquals(-1,validator.validate());
  }
}
