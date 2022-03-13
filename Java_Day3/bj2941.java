import java.util.Scanner;

public class bj2941 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();
    int alphabetCount = 0;
    int indexNum = 0;
    while(indexNum != word.length()){
      if (indexNum == word.length()-1){
        alphabetCount += 1;
        break;
      }
      switch (word.charAt(indexNum)){
        case 'c':{
          switch (word.charAt(indexNum+1)){
            case '=':
            case '-':{
              indexNum += 2;
              alphabetCount += 1;
              break;
            }
            default:{
              indexNum += 1;
              alphabetCount += 1;
              break;
            }
          }
          break;
        }
        
        case 'd':{
          switch (word.charAt(indexNum+1)){
            case '-':{
              indexNum += 2;
              alphabetCount += 1;
              break;
            }
            case 'z':{
              if(indexNum >= word.length()-2) break;
              switch(word.charAt(indexNum+2)){
                case '=':{
                  indexNum += 3;
                  alphabetCount += 1;
                  break;
                }
                default: {
                  indexNum += 2;
                  alphabetCount += 1;
                  break;
                }
              }
              break;
            }
            default:{
              indexNum += 1;
              alphabetCount += 1;
              break;
            }
          }
          break;
        }

        case 'l':
        case 'n':{
          switch(word.charAt(indexNum+1)){
            case 'j':{
              indexNum += 2;
              alphabetCount += 1;
              break;
            }
            default:{
              indexNum += 1;
              alphabetCount += 1;
            }
          }
          break;
        }
        case 's':
        case 'z':{
          switch(word.charAt(indexNum+1)){
            case '=':{
              indexNum += 2;
              alphabetCount += 1;
              break;
            }
            default:{
              indexNum += 1;
              alphabetCount += 1;
            }
          }
          break;
        }
        default:{
          indexNum += 1;
          alphabetCount += 1;
          break;
        }
      }
    } 
    System.out.println(alphabetCount);
    input.close();
  }
}
