package local.exercises;

enum Bracket {
  OPENING_PARENTHESES('(',BracketKind.OPENING,BracketType.PARENTHESES),
  CLOSING_PARENTHESES(')',BracketKind.CLOSING,BracketType.PARENTHESES),
  OPENING_BRACKET('[',BracketKind.OPENING,BracketType.BRACKET),
  CLOSING_BRACKET(']',BracketKind.CLOSING,BracketType.BRACKET),
  OPENING_BRACE('{',BracketKind.OPENING,BracketType.BRACE),
  CLOSING_BRACE('}',BracketKind.CLOSING,BracketType.BRACE);

  private final char bracketChar;
  private final BracketKind kind;
  private final BracketType bracketType;

  private Bracket(char c, BracketKind k, BracketType t) {
    bracketChar = c;
    kind = k;
    bracketType = t;
  }

  public char getBracketChar() {
    return bracketChar;
  }

  public BracketKind getKind() {
    return kind;
  }

  public BracketType getType() {
    return bracketType;
  }
}
