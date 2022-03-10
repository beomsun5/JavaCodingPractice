import java.util.Scanner;
public class bj10952 {
  public static void main(String args[]){
    int a = 0;
    int b = 0;
    Scanner input = new Scanner(System.in);

    while(true){
      a = input.nextInt();
      b = input.nextInt();
      if(a == 0 && b == 0) break;
      System.out.println(a+b);
    }
  }
}
