import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      int Last_two=((n/10)%10);
      System.out.println(Last_two);
	}
}