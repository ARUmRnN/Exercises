package local.exercises;

import java.util.Deque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
  private static char[] starting = {'(','[','{'};
  private static char[] ending = {')',']','}'};

  public static boolean examinePairs(String line) {
    Deque<Character> stack = new LinkedList<>();

    for (int i = 0; i < line.length(); i++) {
      char symbol = line.charAt(i);

      if (Arrays.binarySearch(starting,symbol) >= 0) {
        if (!stack.offerFirst(symbol)) {
          return false;
        }
      } else if (Arrays.binarySearch(ending,symbol) >= 0) {
        Character cho = stack.pollFirst();
        if (cho != null) {
          char ch = cho;
          if ((symbol == ')' && ch != '(') || (symbol == ']' && ch != '[') || (symbol == '}' && ch != '{')) {
            return false;
          }
        } else {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String s = scanner.nextLine();
      System.out.println(examinePairs(s));
    }
  }
}
