import java.util.Scanner;
class Main
{ 
  public static int square_of_num(int m)
  {int sum;
    sum =m*m;
  return sum;
  }
  
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int s;
      s=square_of_num(n);
      n=s;
      System.out.println(n);
	} 
}