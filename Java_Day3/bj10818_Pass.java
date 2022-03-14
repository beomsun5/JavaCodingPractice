import java.util.Scanner;

public class bj10818_Pass{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in); 
    int max = 0;                            //Maximum
    int min = 0;                            //Minimum
    int n = input.nextInt();                //Number of Integers
    int[] nums = new int[n];                //Array of Integers
    // The integer on the first part is the minimum, the integer on the last part is the maximum.
    for(int i = 0; i < n; i++){ nums[i] = input.nextInt(); } //Get Integers from the user
    max = nums[0];
    min = nums[0];
    for(int i = 1; i < n; i++){
      if(max < nums[i]) max = nums[i];
      if(min > nums[i]) min = nums[i];
    }
    System.out.print(min + " ");     //The minimum
    System.out.println(max);  //The maximum
    input.close();
  }
}

