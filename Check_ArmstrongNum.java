package First_week_Assignment;

import java.util.Scanner;

public class Check_ArmstrongNum {

	public static void main(String args[])
	{
		ArmstrongNumber();
	}
	private static void ArmstrongNumber() {
		
		System.out.println("Check Armstrong number  :::::::::::::");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the any number =>  ");
		int num=sc.nextInt();
		int rem,sum=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.print("Armstrong number  => " +sum);
		}
		else
		{
			System.out.println("Not Armstrong number  => "+sum);
		}
	}
}
