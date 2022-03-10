import java.util.Scanner;

public class bj18108 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int budhaYear = 0;  //불기연도
    int normalYear = 0; //서기연도

    /*
    while(true){        //서기연도가 1000년 이상 3000년 이하여야 끝나는 무한 루프
      System.out.print("불기연도를 입력하시오 : ");
      budhaYear = input.nextInt();
      if (budhaYear >= 1000 && budhaYear <= 3000) break;
    }
    */
    budhaYear = input.nextInt();
    normalYear = budhaYear - 543;   //불기연도 - 543 = 서기연도
    System.out.println(normalYear); //서기연도 출력
  }
}
