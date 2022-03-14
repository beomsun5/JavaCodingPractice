import java.util.Scanner;

public class bj4344_Pass {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int testCases = input.nextInt();      // Number of test cases

    // The loop for testing each test case
    for(int i = 0; i < testCases; i++){
      float average = 0;
      int scoreTotal = 0;
      int scoreNum = input.nextInt();
      int[] testScore = new int[scoreNum];
      float stuOverAvg = 0;

      // Getting the test cases and scores from the user
      for(int j = 0; j < scoreNum; j++){
        testScore[j] = input.nextInt();
        scoreTotal += testScore[j];
      }
      average = (scoreTotal / scoreNum);
      for(int k = 0; k < scoreNum; k++){
        if(testScore[k] > average) stuOverAvg += 1;
      }
      System.out.printf("%.3f", (stuOverAvg / scoreNum) * 100);
      System.out.println("%");
    }
    input.close();
  }
}
