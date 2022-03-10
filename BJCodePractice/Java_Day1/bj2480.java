import java.util.Scanner;

public class bj2480 {
  public static void main(String args[]){
    int dice1 = 0;
    int dice2 = 0;
    int dice3 = 0;
    int totalReward = 0;
    Scanner input = new Scanner(System.in);

    dice1 = input.nextInt();
    dice2 = input.nextInt();
    dice3 = input.nextInt();
    if(dice1 == dice2 && dice1 == dice3 && dice2 == dice3) totalReward = 10000 + dice1 * 1000;
    else if(dice1 != dice2 && dice1 != dice3 && dice2 != dice3){
      int max = 0;
      if(max < dice1) max = dice1;
      if(max < dice2) max = dice2;
      if(max < dice3) max = dice3;
      totalReward = max * 100;
    }
    else{
      int sameNum = 0;
      if(dice1 == dice2) sameNum = dice1;
      else if(dice1 == dice3) sameNum = dice1;
      else if(dice2 == dice3) sameNum = dice3;
      totalReward = 1000 + sameNum * 100;
    }
    System.out.println(totalReward);
  }
}