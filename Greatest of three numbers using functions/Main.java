import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner (System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      
      int num =larger(n1,n2);
      System.out.print(larger(num,n3));
                       
	}
                       public static int larger(int a,int b)
                       {
                         int num=0;
                         if(a>b)
                         {
                           num=a;
                         }
                         else
                         {
                           num=b;
                         }
                         return num;
                       }
}