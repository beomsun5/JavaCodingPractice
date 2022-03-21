import java.util.Scanner;

/*
If you want to get the multiple inputs separated by some spaces,
You can use any methods of Scanner, except the String Class.
Because the interruption of enter buffer, if you use 'nextLine()', you may not be able to get the expected result.
So use 'next()' when you want to get the String while you have to input many kinds of value.
*/

public class bj2675_20220321 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int testCaseNum = input.nextInt();
    String[] testCase = new String[testCaseNum];
    for(int i = 0; i < testCaseNum; i++){
      testCase[i] = "";
      int r = input.nextInt();                    // Repetition of printing each character
      String chars = input.next();                // Characters to print repeatedly
      for(int j = 0; j < chars.length(); j++){
        for(int k = 0; k < r; k++){
          testCase[i] += chars.charAt(j);         // Input each test result into the String array
        }
      }
    }
    for(String result : testCase) System.out.println(result);
    input.close();
  }  
}
