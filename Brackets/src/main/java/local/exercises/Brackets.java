package local.exercises;

class Brackets {
  public static Bracket getBracket(char c) {
    switch (c) {
      case '(': return Bracket.OPENING_PARENTHESES;
      case ')': return Bracket.CLOSING_PARENTHESES;
      case '[': return Bracket.OPENING_BRACKET;
      case ']': return Bracket.CLOSING_BRACKET;
      case '{': return Bracket.OPENING_BRACE;
      case '}': return Bracket.CLOSING_BRACE;
      default: return null;
    }
  }

  public static Bracket getOpeningBracket(char c) {
    switch (c) {
      case '(': return Bracket.OPENING_PARENTHESES;
      case '[': return Bracket.OPENING_BRACKET;
      case '{': return Bracket.OPENING_BRACE;
      default: return null;
    }
  }

  public static Bracket getClosingBracket(char c) {
    switch (c) {
      case ')': return Bracket.CLOSING_PARENTHESES;
      case ']': return Bracket.CLOSING_BRACKET;
      case '}': return Bracket.CLOSING_BRACE;
      default: return null;
    }
  }
}
