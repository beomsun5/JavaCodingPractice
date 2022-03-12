import java.util.Scanner;

public class bj10818{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in); 
    int n = input.nextInt();                //Number of Integers
    int[] nums = new int[n];                //Array of Integers
    // The integer on the first part is the minimum, the integer on the last part is the maximum.
    for(int i = 0; i < n; i++){ nums[i] = input.nextInt(); } //Get Integers from the user
    for(int i = 0; i < n; i++){
      for(int j = i; j < n; j++){
        int temp = 0;
        if(nums[i] > nums[j]){
          temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
      }
    }
    System.out.print(nums[0] + " ");     //The minimum
    System.out.println(nums[n-1]);  //The maximum
    input.close();
  }
}

