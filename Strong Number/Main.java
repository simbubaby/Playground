import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp, i,reminder,sum =0, factorial;
      temp =n;
      while (temp >0)
      {
        factorial =1;
        i =1;
        reminder = temp %10;
        while(i<=reminder)
        {
          factorial = factorial*i;
          i++;
        }
        sum =sum+factorial;
        
      temp = temp /10;
      }
      if (n == sum)
        System.out.println("Yes");
      else
        System.out.println("No");
          
        
        
	}
}