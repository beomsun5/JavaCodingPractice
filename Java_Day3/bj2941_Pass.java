import java.util.Scanner;

public class bj2941{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();
    String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    for(int i = 0; i < 8; i++){
      if(word.contains(alphabets[i])) word = word.replace(alphabets[i], "1");
    }
    System.out.println(word.length());
    input.close();
    // My answer (Using SWITCH, CASE / IF Format)
    /*
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();
    char[] wordChar = new char[100];
    wordChar = word.toCharArray();
    int alphabetNum = 0;
    int indexNum = 0;
    while(indexNum < word.length()){
      if(wordChar[indexNum] == 'c'){
        if(wordChar[indexNum+1] == '=' || wordChar[indexNum+1] == '-'){
          indexNum += 2;
          alphabetNum += 1;
        }
        else{
          indexNum += 1;
          alphabetNum += 1;
        }
      }
      else if(wordChar[indexNum] == 'd'){
        if(wordChar[indexNum+1] == '-'){
          indexNum += 2;
          alphabetNum += 1;
        }
        else if(wordChar[indexNum+1] == 'z'){
          if(wordChar[indexNum+2] == '='){
            indexNum += 3;
            alphabetNum += 1;
          }
          else{
            indexNum += 2;
            alphabetNum += 1;
          }
        }
        else{
          indexNum += 1;
          alphabetNum += 1;
        }
      }
      else if(wordChar[indexNum] == 'l' || wordChar[indexNum] == 'n'){
        if(wordChar[indexNum+1] == 'j'){
          indexNum += 2;
          alphabetNum += 1;
        }
        else{
          indexNum += 1;
          alphabetNum += 1;
        }
      }
      else if(wordChar[indexNum] == 's' || wordChar[indexNum] == 'z'){
        if(wordChar[indexNum+1] == '='){
          indexNum += 2;
          alphabetNum += 1;
        }
        else{
          indexNum += 1;
          alphabetNum += 1;
        }
      }
      else{
        indexNum += 1;
        alphabetNum += 1;
      }
    }
    System.out.println(alphabetNum);
    input.close();
    */
  }
}