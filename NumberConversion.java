import java.util.Scanner;

public class NumberConversion {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     System.out.print("Enter an integer to convert to binary: ");
     int num=sc.nextInt();
     String binary=Integer.toBinaryString(num);
     System.out.println("Binary representation: " + binary);


     System.out.print("Enter a binary number to convert to integer: ");
     String binaryInput=sc.next();
     int decimal=Integer.parseInt(binaryInput,2);
     System.out.println("Integer representation: " + decimal);
  }
  
}
