import java.util.Scanner;

public class bj10809_20220317 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String word = input.next();               // Get the word to check
    int[] alphabet = new int[26];             // Get the number of used alphabet
    for(int i = 0; i < 26; i++) if(alphabet[i] == 0) alphabet[i] = -1;
    for(int i = 0; i < word.length(); i++){
      if(alphabet[word.charAt(i) - 'a'] != -1) continue;
      else alphabet[word.charAt(i) - 'a'] = i;
    }
    for(int i = 0; i < 26; i++) System.out.printf("%d ", alphabet[i]);  // Print the alphabet array
    System.out.println();
    input.close();
  }
}
