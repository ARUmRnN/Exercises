import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();

    String[] samples = {"Madam, I'm Adam!","Madam","Дед","Яблоко","ZЯблокоAZ","Apple","Дед, а дед ...","8118","a...!","Ъабаъ"};

    System.out.println("Method isPalindrome1");
    for (String s : samples) {
      System.out.println("\"" + s + "\": " + (isPalindrome1(s) ? "is palindrome" : "is not palindrome"));
    }

    System.out.println("");
    System.out.println("Method isPalindrome2");
    for (String s : samples) {
      System.out.println("\"" + s + "\": " + (isPalindrome2(s) ? "is palindrome" : "is not palindrome"));
    }

    br.readLine();
  }

  public static boolean isPalindrome1(String str) {
    int i = 0, j = str.length() - 1;
    boolean isPalindrome = true;

    while (isPalindrome && i < j) {
      char a = str.charAt(i);
      if (!Character.isLetter(a)) {
        i++;
        continue;
      };

      char b = str.charAt(j);
      if (!Character.isLetter(b)) {
        j--;
        continue;
      }

      isPalindrome = Character.toUpperCase(a) == Character.toUpperCase(b);

      i++;
      j--;
    }

    return isPalindrome;
  }

  public static boolean isPalindrome2(String str) {
    // Step 1: clear the source string and get new clear string - create new object, new memory allocation
    String clearStr = str.replaceAll("\\P{IsL}+","");

    // Step 2: create StringBuilder object for reverse - create new object, new memory allocation
    StringBuilder sb = new StringBuilder(clearStr);

    // Step 2: get reversed string as new StringBuilder object
    StringBuilder sbr = sb.reverse();

    // Step 3: convert StringBuilder to String - create new object String
    String revStr = sbr.toString();

    // Step 4: equals
    return clearStr.equalsIgnoreCase(revStr);
  }
}
