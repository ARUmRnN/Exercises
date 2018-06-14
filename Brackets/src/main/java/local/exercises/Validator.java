package local.exercises;

import java.util.Deque;
import java.util.LinkedList;

class Validator {
  private final String line;
  private final int length;
  private final Deque<BracketPosition> stack = new LinkedList<>();

  public Validator(String s) {
    line = s;
    length = s.length();
  }

  public int validate() {
    for (int i = 0; i < length; i++) {
      Bracket bracket = Brackets.getBracket(line.charAt(i));
      if (bracket != null) {
        if (bracket.getKind() == BracketKind.OPENING) {
          stack.offerFirst(new BracketPosition(bracket,i));
        } else if (bracket.getKind() == BracketKind.CLOSING) {
          BracketPosition bracketPosition = stack.pollFirst();
          if (bracketPosition == null || bracketPosition != null && bracketPosition.getBracket().getType() != bracket.getType()) {
            return i;
          }
        }
      }
    }

    return stack.isEmpty() ? -1 : stack.pollFirst().getIndex();
  }
}
