import java.util.Scanner;

public class bj11720_20220317 {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int digit = input.nextInt();    // Get the digit of the number
    String num = input.next();      // Get the numbers (in String type)
    int total = 0;                  // Total of the numbers.
    for(int i = 0; i < digit; i++){
      String oneDigitNum = num.substring(i, i+1); // Get one digit Number from the string
      total += Integer.parseInt(oneDigitNum);     // Convert it into int and get the total of them.
    }
    System.out.println(total);
    input.close();
  }
}
