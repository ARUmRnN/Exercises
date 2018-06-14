package local.exercises;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BracketsTest {
  @Test
  public void createOpeningParentheses() {
    Bracket bracket = Brackets.getBracket('(');
    assertEquals('(',bracket.getBracketChar());
  }
}
