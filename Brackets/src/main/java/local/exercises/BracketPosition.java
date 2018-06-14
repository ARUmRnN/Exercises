package local.exercises;

class BracketPosition {
  private final Bracket bracket;
  private final int index;

  public BracketPosition(Bracket b, int i) {
    bracket = b;
    index = i;
  }

  public Bracket getBracket() {
    return bracket;
  }

  public int getIndex() {
    return index;
  }
}
