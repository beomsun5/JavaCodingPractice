import java.util.Scanner;

public class bj10926{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String id = "";
    id = input.nextLine();
    System.out.println(id + "??!");
    
    /*
    int sameCharNum = 0;
    while(true){
      sameCharNum = 0;
      System.out.print("아이디를 입력하시오: ");
      id = input.nextLine();
      for(int i = 0; i < id.length(); i++){
        if(id.charAt(i) >= 97 && id.charAt(i) <= 122){
          sameCharNum += 1;
        }
      }
      if(sameCharNum == id.length()){
        System.out.println(id + "??!");
        break;
      }
    }
    */
  }
}