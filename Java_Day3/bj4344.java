import java.util.Scanner;

public class bj4344 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int testCases = input.nextInt();      // Number of test cases

    // The loop for testing each test case
    for(int i = 0; i < testCases; i++){
      float average = 0;
      int scoreTotal = 0;
      int testNum = input.nextInt();
      int[] testScore = new int[testNum];

      // Getting the test cases and scores from the user
      for(int j = 0; j < testNum; j++){
        testScore[j] = input.nextInt();
        scoreTotal += testScore[j];
      }
      average = (scoreTotal / testNum);
      System.out.printf("%.3f", average);
      System.out.println("%");
    }
    input.close();
  }
}
