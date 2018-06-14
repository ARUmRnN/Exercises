package local.exercises;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

public class MainTest {
  @Disabled
  public void examineFirst() {
    assertTrue(Main.examinePairs("([][])"));
  }

  @Disabled
  public void examineSecond() {
    assertTrue(Main.examinePairs("[()]{}{[()()]()}"));
  }

  @Disabled
  public void examineThird() {
    assertFalse(Main.examinePairs("()[]}"));
  }

  @Disabled
  public void examineFourth() {
    assertFalse(Main.examinePairs("((())"));
  }
}
