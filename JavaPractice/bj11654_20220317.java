import java.util.Scanner;

public class bj11654_20220317 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int asciiCodeNum = input.nextLine().charAt(0);  // Get the character and put it in to the integer variable
    System.out.println(asciiCodeNum);               // This character is printed in int format
    input.close(); 
  }
}
