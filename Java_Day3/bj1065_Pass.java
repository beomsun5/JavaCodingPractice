import java.util.Scanner;

public class bj1065_Pass {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int x = input.nextInt(); //The maximum number of the range
    System.out.println(answerNums(x));
    input.close();
  }

  public static int answerNums(int x){
    int num = 0;
    if(x >= 100){
      num = 99;
      for(int allNum = 100; allNum <= x; allNum++){
        if(allNum == 1000) return num;
        int checkThisNum = allNum;
        int[] eachDigitNum = new int[3];
        int[] eachNumDif = new int[2];
        for(int i = 0; i < 3; i++){
          eachDigitNum[i] = checkThisNum % 10;
          checkThisNum /= 10;
        }
        for(int i = 0; i < 2; i++) { eachNumDif[i] = eachDigitNum[i] - eachDigitNum[i+1]; }
        if((eachNumDif[0] == eachNumDif[1])){ num += 1; }
      }
    }
    else num = x; // 99 이하의 한수는 본인 값이 한수 개수
    return num;
  }
}