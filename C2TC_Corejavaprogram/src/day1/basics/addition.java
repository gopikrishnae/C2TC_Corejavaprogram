package day1.basics;
import java.util.Scanner;

public class addition {
   
	public static void main(String[]args) {
		int a,b,c;
		Scanner  S=new Scanner(System.in);
		System.out.println("Enter the  values;");
		a=S.nextInt();
		b=S.nextInt();
        c=a+b;
        System.out.println("Addition of a="+a+" and b="+b+" is "+c);
         
	}
          
}
