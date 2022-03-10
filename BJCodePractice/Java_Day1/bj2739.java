import java.util.Scanner;

public class bj2739 {
  public static void main(String args[]){
    int n = 0;
    Scanner input = new Scanner(System.in);
    n = input.nextInt();

    for(int i = 0; i < 10; i++){
      System.out.println(n + " * " + i + " = " + n*i);
    }
  }
}
