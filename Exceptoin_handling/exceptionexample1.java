package Exceptoin_handling;

import java.util.Scanner;

public class exceptionexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("First line");
		 //System.out.println(5/0); // ArithmeticException
		 
		 int arr[]= {1,23,3,4,5,6};
		// System.out.println(arr[9]);//ArrayIndexOutOfBoundsException
		 
		String s="sksd";
		// System.out.println(s.charAt(7));//StringIndexOutOfBoundsException
		 
		// int arr[]=new int[-4];//NegativeArraySizeException
		 
		 Scanner sc=new Scanner(System.in);
		 //int n=sc.nextInt(); //InputMismatchException
		 
		 String s1=null;
		 //System.out.println(s1.length()); //NullPointerException
		 
		 String s2="78hk"
		 		+ "";
		 int num=Integer.parseInt(s2);
		 System.out.println(num);//NumberFormatException
		 System.out.println("last line");
	}

}
