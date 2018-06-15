package local.exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SampleApp {
  public static void main(String[] args) throws IOException {
    StackMax<Object> stack = new StackMax<>();

    try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
      int num = Integer.parseInt(bf.readLine());

      for (int i = 0; i < num; i++) {
        String[] arrCommands = bf.readLine().split(" ");

        switch (arrCommands[0]) {
          case "push":
            stack.push(Integer.parseInt(arrCommands[1]));
            break;
          case "pop":
            System.out.println(stack.pop());
            break;
          case "max":
            System.out.println(stack.max());
            break;
        }
      }
    }
  }
}
