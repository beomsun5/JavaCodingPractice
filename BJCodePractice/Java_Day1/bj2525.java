import java.util.Scanner;

public class bj2525 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int hour = 0;
    int minute = 0;
    int addMinute = 0;
    int totalMinute = 0;
    int addHourNum = 0;

    hour = input.nextInt();
    minute = input.nextInt();
    addMinute = input.nextInt();
    totalMinute = minute + addMinute;

    if(totalMinute >= 60){
      addHourNum = totalMinute / 60;
      hour += addHourNum;
      if(hour >= 24) hour -= 24;
      minute = totalMinute % 60;
    }
    else minute = totalMinute;
    System.out.println(hour + " " + minute);
  }
}