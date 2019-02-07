import java.util.Scanner;
class Main{
  public static int sum_of_digit(int m)
  {
    int sum=0;
    int i=1;
   while (i<=m)
    {
      sum=sum+i;
      i++;
    }
    return sum;
  }
	public static void main (String[] args){
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int s;
      s=sum_of_digit(n);
        n=s;
      System.out.println(n);
      
      
      
	    
	}
}