import java.util.Scanner;

public class bj1316_PassLate {
  static Scanner input = new Scanner(System.in);
  public static void main(String args[]){
    int groupWord = 0;  //그룹단어 개수
    System.out.print("How many words: "); 
    int wordNum = input.nextInt();          // Word Numbers to check if some of them are group words.
    for(int i = 0; i < wordNum; i++){ if(checkGroupWord() == true) groupWord++; }
    System.out.println(groupWord);
    input.close();
  }
  public static boolean checkGroupWord(){
    boolean[] check = new boolean[26];        // This array consists of every alphabet (26 letters) (The default condition of bool type array is 'false')
    int prev = 0;                             // previous letter
    String word = input.next();               // Get the word to check if it is a group word.
    for(int i = 0; i < word.length(); i++){
      int now = word.charAt(i);               // Get the present checking letter.

      if(prev != now){
        if (check[now - 'a'] == false) {      // If current letter has not ever used in the word
          check[now - 'a'] = true;            // make its sign as 'used'
          prev = now;                         // the current letter becomes the previous letter
        }
        else return false;                    // if there are the same letters which are not continuous, this word is not a group word.
      }
      else continue;                          // The previous letter and the current letter are the same.
    }
    return true;                              // If the word has no letters at a consecutive order.
  }
}
