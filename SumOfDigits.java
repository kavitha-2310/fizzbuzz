import java.util.Scanner;
public class SumOfDigits {
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a number :123");
    int num=sc.nextInt();
    if(num<=0){
      System.out.print("Enter a positive number");
      return;
    }
    int sum=0;
    while(num>0){
      sum+=num%10;
      num/=10;
    }
    System.out.print("sum of number :"+ sum);
  }
}
