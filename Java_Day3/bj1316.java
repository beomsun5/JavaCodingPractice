import java.util.Scanner;

public class bj1316 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("How many words: ");
    int wordNum = input.nextInt();
    String[] words = new String[wordNum];
    for(int i = 0; i < wordNum; i++) words[i] = input.next();
    int groupWord = 0;
    for(int word = 0; word < wordNum; word++){
      int groupWordOrNot = 1; // 1 : This is a group word, 0 : This is not a group word.
      char[] consistingAlphabet = new char[words[word].length()];
      for(int i = 0; i < words[word].length(); i++){ consistingAlphabet[i] = words[word].charAt(i); }
      for(int i = 0; i < words[word].length(); i++){
        for(int j = i+1; j < words[word].length(); j++){
          if(consistingAlphabet[i] == consistingAlphabet[j] && j-i != 1){
            if(consistingAlphabet[j-1] == consistingAlphabet[j]) groupWordOrNot = 1;
            else groupWordOrNot = 0;
          }
        }
      }
      if (groupWordOrNot == 1) groupWord += 1;
    }
    System.out.println(groupWord);
    input.close();
  }
}
